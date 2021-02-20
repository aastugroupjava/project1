package sample;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class Controller implements Serializable {
    protected Connection con;
    protected Statement st;
    protected ResultSet rt;
    protected ResultSet ct;
    protected ResultSet d;
    protected ResultSet stolen_item;
    public static String userdata[][];
    public static String data[][];
    public static String stolen_items[][];
    public static int count;
    public static int requestcounter;
    public static int counterstolen;
    public Object[] Userdata;
    public Object a;
    private String name;
    private String pass;
    private String secure;

    public Controller(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aastu_inventory","root","");
            System.out.println("connected to database");
            st = con.createStatement();
            System.out.println("created statement");
        }catch(Exception e){
            System.out.println("error2:"+e);
        }




    }

    public void getData() {
       try{
           String query ="SELECT * FROM users";
           String counter ="SELECT COUNT(username) FROM users";
           String query1= "SELECT * FROM data";
           String countuser = "SELECT COUNT(request) FROM data";
           String query3= "SELECT * FROM stolen_item";
           String countstolen = "SELECT COUNT(status) FROM stolen_item";
           //System.out.println("hellow");
           ct = st.executeQuery(counter);
           //System.out.println("hellow");
           while(ct.next()) {
               count = ct.getInt("count(username)");
           }
           //System.out.println(count);
           rt = st.executeQuery(query);
           //System.out.println("list from db");
            int i=0;
           Controller.userdata = new String[count][3];
           while (rt.next()){
               //userdata[i][2] = new String();
              Controller.userdata[i][0]= rt.getString("username");
              Controller.userdata[i][1]=rt.getString("passwords");
              Controller.userdata[i][2]=rt.getString("security");
              i++;
           }
           d = st.executeQuery(countuser);
           while(d.next()){
               requestcounter=d.getInt("count(request)");
           }
           Controller.data = new String[requestcounter][6];
           d = st.executeQuery(query1);
           i=0;
           while(d.next()){
               Controller.data[i][0]=d.getString("request");
               Controller.data[i][1]= String.valueOf(d.getInt("appending"));
               Controller.data[i][2]= String.valueOf(d.getInt("approved"));
               Controller.data[i][3]= String.valueOf(d.getInt("denied"));
               Controller.data[i][4]=d.getString("full_name");
               Controller.data[i][5]=d.getString("block_number");
//               System.out.println(data[i][2]);
//               System.out.println(data[i][1]);
               i++;
           }
           stolen_item = st.executeQuery(countstolen);
           while (stolen_item.next()){
               counterstolen = stolen_item.getInt("count(status)");
           }
           stolen_item = st.executeQuery(query3);
           Controller.stolen_items= new String[counterstolen][4];
           i=0;
           while(stolen_item.next()){
               Controller.stolen_items[i][0]=stolen_item.getString("stolen_item");
               Controller.stolen_items[i][1]= String.valueOf(stolen_item.getInt("status"));
               Controller.stolen_items[i][2]=stolen_item.getString("reported_by");
               Controller.stolen_items[i][3]=stolen_item.getString("reported_by_address");
               i++;
           }


       }catch (Exception e){
           System.out.println("error1:"+e);
       }

    }
    public void user(String username, String password, String security){

    }
    public void sendData(){
        try{
            for(String[] g : userdata){
                for(String b:g)
                    System.out.println(b);
            }
        }catch(Exception e){
            System.out.println("error:"+e);
        }

    }
    public boolean validator(String username,String password){
        String login_query = "SELECT 1 FROM users where username='"+username+"'&&"+"passwords='"+password+"';";
        System.out.println(login_query);
        ResultSet checker=null;
        try{
            checker = st.executeQuery(login_query);
            if(checker.next()){
                return true;
            }else
                return false;
        }catch(Exception e){
            System.out.println("error_on_validator:"+e);
            return false;
        }
    }
    public boolean signup(String username,String password,String security){
        String query = "INSERT INTO users VALUES("+"'"+username+"'"+","+"'"+password+"','"+security+"')";
        //System.out.println(query);
        try {
            st.executeUpdate(query);
           // System.out.println(query);
            return true;
        }catch (SQLException e){
            System.out.println("error:"+e);
            return false;
        }
    }
    public String forgetpassword(String security){
        String forget_password_query = "SELECT passwords FROM users where security='"+security+"';";
        ResultSet checker=null;
        try{
            checker = st.executeQuery(forget_password_query);
            if(checker.next()){
                return checker.getString("passwords");
            }
            else{
                return "ur account doesn't exist. please create an account.";
            }
        }catch (Exception e){
            System.out.println("error_on_forgetpassword:"+e);
            return e.toString();
        }
    }

}
