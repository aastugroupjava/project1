package sample.Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.Date;
import java.util.concurrent.ExecutionException;

public class Serverworker extends Thread {
    static Socket clientSocket;
    public Serverworker(Socket connection)  {
        this.clientSocket = connection;

    }
    public void run() {
        try{
            handleclientsocket(clientSocket);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    private static void handleclientsocket(Socket clientsocket) throws Exception {
        ObjectOutputStream output = new ObjectOutputStream(clientsocket.getOutputStream());
        ObjectInputStream input = new ObjectInputStream(clientsocket.getInputStream());
        //BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
       while((line= (String) input.readObject())!="quit"){
            String msg = line;
            System.out.println(line);
            output.writeObject(line);
        }
        System.out.println("connection got closed");
        clientsocket.close();
    }
}
