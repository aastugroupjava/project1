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

    public ResultSet getitemdata() {
       String getdataquery = "SELECT * FROM data";
       ResultSet items = null;
       try {
           items = st.executeQuery(getdataquery);
           return items;
       }catch (Exception e){
           System.out.println("erro_of_getitemdata:"+e);
           return null;
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
