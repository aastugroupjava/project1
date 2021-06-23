package sample.Server;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;

public interface ControllerInterface extends Remote {
    //public void Controller()throws RemoteException;
    //public Con()throws RemoteException;
    ResultSet getitemdata();
    boolean validator(String username, String password);
    boolean signup(String name, String password, String id, String email, String phonenumber);
    String forgetpassword(String phonenumber);
    boolean additems(String id, String fullname, String email, String dep, String block, String dorm, String phone, String serial, String type);
    boolean deleteitems(sample.Server.items item);
    boolean checkout(sample.Server.items item);
    boolean check_in(sample.Server.items item);
    ResultSet getstudentdata();
    ResultSet getcomplaindata();
    ResultSet getStolen_item();
    boolean delete_stolen(String Id);
    boolean deletestudent(String ID);
    boolean deletecomplain(String ID);
    boolean searchpossibleitem(String id);
    ResultSet searchitem(String id);
    ResultSet searchstudent(String id);
    ResultSet searchstolen(String id);
    ResultSet searchcomplain(String id);
    boolean addcomplain(String id, String complainer, String complain_number, int status, String found, String gate, String dorm, String block, String date);
    boolean addfound(String date, String gate, String dorm, String block, String id);
}
