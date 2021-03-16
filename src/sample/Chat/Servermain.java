package sample.Chat;

import sample.Rmiimplementor;

import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

public class Servermain  extends  Thread{

    private final int serverport;
    private ArrayList<Serverworker> workers = new ArrayList<>();
    public Servermain(int port) {
        this.serverport = port;
    }

    public List<Serverworker> getWorkers(){
        return workers;
    }

    @Override
    public void run() {
        try{
            ServerSocket server = new ServerSocket(serverport);
            while (true){
                System.out.println("waiting for client to connect...");
                Socket clientsocket = server.accept();
                Serverworker worker = new Serverworker(this,clientsocket);
                workers.add(worker);
                worker.start();
                System.out.println("New connection created.");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
