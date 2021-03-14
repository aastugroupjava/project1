package sample.Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Serverworker extends Thread {
    static Socket clientSocket;
   public static InputStream input=null;
   public static OutputStream output=null;
    public Serverworker(Socket connection) throws Exception {
        this.clientSocket = connection;
    }
    public void run() {
        try{
            handleclientsocket(clientSocket);
        }catch (Exception e){
            System.out.println("error is here:"+e);
        }
    }
    private void handleclientsocket(Socket clientsocket) throws Exception {
        this.output = clientsocket.getOutputStream();
        this.input = clientsocket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;

       while((line= (String) reader.readLine())!="quit"){
            String msg = line;
            System.out.println(line);
            for(Serverworker worker:Server.serverworkers){
                output.write(msg.getBytes());
            }
        }
        System.out.println("connection got closed");
        clientsocket.close();
    }

}
