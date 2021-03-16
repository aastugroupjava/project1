package sample;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RmiInterface extends  Remote{
    public String echo()throws RemoteException;
}
