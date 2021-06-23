package sample.Server;

import sample.Server.Controller;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        System.setProperty("java.rmi.server.hostname","192.168.0.2");
        Registry reg = LocateRegistry.createRegistry(1278);
        reg.bind("controller",new Controller());
    }
}
