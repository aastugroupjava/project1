package sample;
import javax.jnlp.FileContents;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.lang.*;
import sample.Server;
public class ServerController {
    public DataOutputStream outputToClient;
    public DataInputStream inputFromClient;
    public  int b=0,c=0;

    public  void senddatatoclient() throws IOException {
        outputToClient = new DataOutputStream(
                Server.socket.getOutputStream());
        inputFromClient = new DataInputStream(
                Server.socket.getInputStream());
        while(true) {
            if (b >= 0 && c >= 0 && b <= Controller.count-- && c <= 2) {
                outputToClient.writeUTF(Controller.userdata[b][c]);
                if (c < 2) {
                    //b = Server.b;
                    c++;
                } else if (c == 2) {
                    c = 0;
                    b++;
                }
                System.out.println(b);
                System.out.println(c);
                outputToClient.flush();
            }
        }
    }
    public void recievedatafromclient(){

    }
}
