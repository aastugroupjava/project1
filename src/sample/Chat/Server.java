package sample.Chat;
import java.io.*;
import java.net.*;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {


    public static void main(String[] args) throws SQLException {
        int port = 6789;
        Servermain servermain = new Servermain(port);
        servermain.start();
    }


}
