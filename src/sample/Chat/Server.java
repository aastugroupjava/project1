package sample.Chat;
import sample.Client.Rmiimplementor;

import java.io.*;
import java.net.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {


    public static void main(String[] args) throws SQLException, RemoteException {
        int port = 6789;
        Servermain servermain = new Servermain(port);
        servermain.start();
        Registry register = LocateRegistry.createRegistry(7000);
        register.rebind("notification",new Rmiimplementor());
        System.out.println("register created.");
    }


}
