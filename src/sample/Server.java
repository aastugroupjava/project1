package sample;
import javax.jnlp.FileContents;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.lang.*;


public class Server {
    public static Socket socket;
    public DataOutputStream outputToClient;
    public DataInputStream inputFromClient;
    protected Connection con;
    protected static Statement st;
    protected static ResultSet rt;
    protected static ResultSet ct;
    protected static ResultSet d;
    protected static ResultSet stolen_item;
    public  static String userdata[][];
    public static String data[][];
    public static String stolen_items[][];
    public static int count;
    public static int requestcounter;
    public static int counterstolen;
    public static String[][] Userdata;
    private String name;
    private String pass;
    private String secure;
    public static int b=0,c=0;
    public static int dt=2;
    public static void main(String[] args){
        Controller controller = new Controller();
        controller.getData();

         new Server();
    }

    public Server() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aastu_inventory","root","");
            st = con.createStatement();
        }catch(Exception e){
            System.out.println("error2:"+e);
        }
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(8000,100);
            System.out.println("Server started " + '\n');
            // Listen for a connection request
             socket = serverSocket.accept();
            // Create data input and output streams
             outputToClient = new DataOutputStream(
                    socket.getOutputStream());
             inputFromClient = new DataInputStream(
                    socket.getInputStream());



                //int g=0,e=0;
                //dt = inputFromClient.readInt();
                //outputToClient.writeInt(Controller.count);

                ServerController cont = new ServerController();
                cont.senddatatoclient();






                //b=ServerController.b;
                //c=ServerController.c;
                //int t = inputFromClient.readInt();
                //System.out.println(userdata[0][0]);
                //String b=inputFromClient.readUTF();
                //outputToClient.writeChars(t);
//            outputToClient.writeUTF(userdata[0][0]);
//            outputToClient.writeUTF(userdata[0][0]);

        } catch (IOException ex) {
            System.err.println(ex);
        }


    }



}
