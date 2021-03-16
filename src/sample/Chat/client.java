package sample.Chat;

import sample.MessageListener;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class client {

    private final String servername;
    private final int serverport;
    private static Socket socket;
    private static OutputStream output;
    private InputStream input;
    private static BufferedReader reader;
    private static ArrayList<MessageListener> messagelisteners = new ArrayList<>();

    public static void closesocket() throws IOException {
        socket.close();
    }

    public client(String servername, int serverport){
        this.servername = servername;
        this.serverport = serverport;
    }


    public static void startMessageWriter(String msg) {
        Thread t = new Thread(){
            @Override
            public void run() {
                try{
                    writeMessageLoop(msg);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        };
        t.start();
    }

    public static void writeMessageLoop(String msg) throws IOException {
        try{
               msg(msg);
        }catch (Exception e){
            System.out.println(e);
            socket.close();
        }
    }

    public static void startMessageReader() {
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


   public boolean connect() {
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
            output.write((msg+"\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addMessageListener(MessageListener listener){
        messagelisteners.add(listener);
    }
    public void writeMessageListener(MessageListener listener){
        messagelisteners.remove(listener);
    }
}
