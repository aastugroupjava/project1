package sample.Chat;

import sample.Client.MessageListener;


import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class client2 {

    private final String servername;
    private final int serverport;
    private static Socket socket;
    private static OutputStream output;
    private InputStream input;
    private static BufferedReader reader;
    private static ArrayList<MessageListener> messagelisteners = new ArrayList<>();


    public client2(String servername, int serverport){
        this.servername = servername;
        this.serverport = serverport;
    }
    public static void main(String[] args)throws Exception {
        client2 client2 = new client2("127.0.0.1",6789);
        client2.addMessageListener(new MessageListener() {
            @Override
            public void readMessage(String msg) {
                System.out.println(msg);
            }
        });
        if(!client2.connect()){
            System.out.println("connection failed");
        }
        else{
            System.out.println("connection created");
            //client.msg("hello");
            startMessageWriter();
            startMessageReader();
//            while(true){
//                System.out.println("enter ur message");
//                Scanner in = new Scanner(System.in);
//                String msg = in.nextLine();
//                try {
//                    client.msg(msg);
//                   // System.out.println((String) reader.readLine());
//                } catch (Exception e) {
//                    System.out.println("error here:"+e);
//                }
//            }

        }
    }

    private static void startMessageWriter() {
        Thread t = new Thread(){
            @Override
            public void run() {
                try{
                    writeMessageLoop();
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        };
        t.start();
    }

    private static void writeMessageLoop() throws IOException {
        try{
            while(true) {
                System.out.println("enter ur message");
                Scanner read = new Scanner(System.in);
                String msg = read.nextLine();
                msg(msg);
            }
        }catch (Exception e){
            System.out.println(e);
            socket.close();
        }
    }

    private static void startMessageReader() {
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    readMessageLoop();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }


     boolean connect() {
        try {
            this.socket = new Socket(servername,serverport);
            this.output = socket.getOutputStream();
            this.input = socket.getInputStream();
            this.reader = new BufferedReader(new InputStreamReader(input));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void readMessageLoop() throws IOException {
        try{
            String line;
            while((line=reader.readLine())!=null){
                handleMessage(line);
            }
        }catch (Exception e){
            System.out.println(e);
           socket.close();
        }
    }

    private static void handleMessage(String line) {
        for(MessageListener listener : messagelisteners){
            listener.readMessage(line);
        }
    }

    public static void msg(String msg)  {
        try {
            output.write(("client2: "+msg+"\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addMessageListener(MessageListener listener){
        messagelisteners.add(listener);
    }
    public void writeMessageListener(MessageListener listener){
        messagelisteners.remove(listener);
    }
}

