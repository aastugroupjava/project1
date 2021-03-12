package sample.Chat;
import java.io.*;
import java.net.*;

public class Server {
    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    private static ServerSocket server;
    private static Socket connection;
    public void Chatting(){
        try{
            server=new ServerSocket(6789,100);
            while(true){
                try{
                    Connectionwaiter();
                    setupstream();
                    whilechatting();
                }catch (Exception e){
                    System.out.println("Connection has ended!");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    //during the chat conversation.
    private void whilechatting()throws  IOException {
        String message= "You are now connected!";
        System.out.println(message);
        ableToType(true);
        while(true){
            try{
                message = (String) input.readObject();
                System.out.println(message);
            }catch (Exception e){
                System.out.println("message sent error/message not send.");
            }
        }
    }

    private void ableToType(boolean b) {
    }

    //getting and setting up streams
    private void setupstream() throws IOException {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        System.out.println("Streams are setup");
    }
    //waiting for connection
    private void Connectionwaiter() throws IOException {
        System.out.println("Connecting...");
        connection  = server.accept();
        System.out.println("Now Connected.");
    }
}
