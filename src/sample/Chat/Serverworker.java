package sample.Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Serverworker extends Thread {
   private final Socket clientSocket;
    private final Servermain server;
    private OutputStream output;

    public Serverworker(Servermain server, Socket connection) throws Exception {
        this.server = server;
        this.clientSocket = connection;
    }
    @Override
    public void run() {
        try{
          handleclientsocket();
        }catch (Exception e){
            System.out.println("error is here:"+e);
        }
    }
    private void handleclientsocket() throws IOException, InterruptedException {
        this.output = clientSocket.getOutputStream();
        InputStream input = clientSocket.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
            if("quit".equalsIgnoreCase(line)){
                break;
            }
            else {
                List<Serverworker> workers = server.getWorkers();
                for(Serverworker worker:workers){
                    worker.send(line+"\n");
                }
               // String msg = "You typed: " + line + "\n";
              //  output.write(msg.getBytes());
            }
        }

        System.out.println("connected to a client.");
        clientSocket.close();

    }

    private void send(String msg) throws IOException {
       this.output.write(msg.getBytes());
    }


}
