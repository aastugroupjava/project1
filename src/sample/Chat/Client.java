package sample.Chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static Socket connection;
    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    public static void main(String[] args)throws Exception{
        OutputStream output = null;
        InputStream input = null;
        BufferedReader reader= null;
        try{
            connection = new Socket("localhost",6789);
            output =new ObjectOutputStream(connection.getOutputStream());
            input = new ObjectInputStream(connection.getInputStream());
            reader = new BufferedReader(new InputStreamReader(input));
        } catch (Exception e) {
            System.out.println(e);
        }
        while(true){
                System.out.println("enter ur message");
                Scanner in = new Scanner(System.in);
                String msg = in.nextLine();
                try {
                    output.write(msg.getBytes());
                    output.flush();
                    System.out.println((String) reader.readLine());
                } catch (Exception e) {
                    System.out.println(e);
                }

        }
    }
}
