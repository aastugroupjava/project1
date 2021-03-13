package sample.Chat;
import java.io.*;
import java.net.*;
import java.sql.SQLException;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {



    public static void main(String[] args) throws SQLException {
        int port = 6789;
        try{
            ServerSocket server = new ServerSocket(port,100);
            while (true){
                System.out.println("waiting for client to connect...");
                Socket clientsocket = server.accept();
                Serverworker worker = new Serverworker(clientsocket);
                worker.start();
                System.out.println("New connection created.");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }




}
