package sample.Client;

import sample.Chat.Server;
import sample.Chat.Serverworker;
import sample.Chat.client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Rmiimplementor extends UnicastRemoteObject implements sample.RmiInterface {

    public Rmiimplementor() throws RemoteException {
        super();
    }

    @Override
    public String echo() throws RemoteException {
       return "Update:New Stolen Item has been registered.";
    }
}
