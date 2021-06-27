package sample.Server;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;

public interface ControllerInterface extends Remote {
    //public void Controller()throws RemoteException;
    //public Con()throws RemoteException;
    ResultSet getitemdata()throws RemoteException;
    boolean validator(String username, String password)throws RemoteException;
    boolean signup(String name, String password, String id, String email, String phonenumber)throws RemoteException;
    String forgetpassword(String phonenumber)throws RemoteException;
    boolean additems(String id, String fullname, String email, String dep, String block, String dorm, String phone, String serial, String type)throws RemoteException;
    boolean deleteitems(sample.Server.items item)throws RemoteException;
    boolean checkout(sample.Server.items item)throws RemoteException;
    boolean check_in(sample.Server.items item)throws RemoteException;
    ResultSet getstudentdata()throws RemoteException;
    ResultSet getcomplaindata()throws RemoteException;
    ResultSet getStolen_item()throws RemoteException;
    boolean delete_stolen(String Id)throws RemoteException;
    boolean deletestudent(String ID)throws RemoteException;
    boolean deletecomplain(String ID)throws RemoteException;
    boolean searchpossibleitem(String id)throws RemoteException;
    ResultSet searchitem(String id)throws RemoteException;
    ResultSet searchstudent(String id)throws RemoteException;
    ResultSet searchstolen(String id)throws RemoteException;
    ResultSet searchcomplain(String id)throws RemoteException;
    boolean addcomplain(String id, String complainer, String complain_number, int status, String found, String gate, String dorm, String block, String date)throws RemoteException;
    boolean addfound(String date, String gate, String dorm, String block, String id)throws RemoteException;
}
