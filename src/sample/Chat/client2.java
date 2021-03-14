package sample.Chat;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client2 {
    private static Socket connection;
    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    public static void main(String[] args)throws Exception{
        ObjectOutputStream output = null;
        ObjectInputStream input = null;
        try{
            connection = new Socket("localhost",6789);
            output =new ObjectOutputStream(connection.getOutputStream());
            input = new ObjectInputStream(connection.getInputStream());
        } catch (Exception e) {
            System.out.println(e);
        }
        while(true){
            System.out.println("enter ur message");
            Scanner in = new Scanner(System.in);
            String msg = in.nextLine();
            try {
                output.writeObject("client-3: " + msg);
                output.flush();
                System.out.println((String) input.readObject());
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
