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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadbproject","root","");
            System.out.println("connected to database");
            st = con.createStatement();
            System.out.println("created statement");
        }catch(Exception e){
            System.out.println("error2:"+e);
        }
    }

    public ResultSet getitemdata() {
       String getitemquery = "SELECT DISTINCT * FROM items JOIN  student ON items.student_ID=student.ID;";
       //String getstudentquery = "SELECT * FROM student";
       ResultSet items = null;
       try {
           items = st.executeQuery(getitemquery);
           return items;
       }catch (Exception e){
           System.out.println("error_of_getitemdata:"+e);
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
        String login_query = "SELECT 1 FROM users where name='"+username+"'&&"+"password='"+password+"';";
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
    public boolean signup(String name,String password,String id,String email,String phonenumber){
        String query = "INSERT INTO users VALUES("+"'"+id+"'"+","+"'"+name+"','"+email+"','"+password+"','"+phonenumber+"');";
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
        String forget_password_query = "SELECT password FROM users where phone_number='"+security+"';";
        ResultSet checker=null;
        try{
            checker = st.executeQuery(forget_password_query);
            if(checker.next()){
                return checker.getString("password");
            }
            else{
                return "ur account doesn't exist. please create an account.";
            }
        }catch (Exception e){
            System.out.println("error_on_forgetpassword:"+e);
            return e.toString();
        }
    }

    public boolean additems(String id, String fullname, String email, String dep, String block, String dorm, String phone, String serial, String type) {
        String add_query_to_student = "INSERT INTO student VALUES("+"'"+id+"'"+","+"'"+fullname+"','"+email+"','"+dep+"','"+block+"','"+dorm+"','"+phone+"');";
        String add_query_to_items = "INSERT INTO items VALUES("+"'"+serial+"', '1' ,"+"'"+type+"','"+id+"');";
        System.out.println(add_query_to_items);
        try{
            st.executeUpdate(add_query_to_items);
            st.executeUpdate(add_query_to_student);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deleteitems(items item) {
        String delete_query ="DELETE FROM items WHERE serial_number="+"'"+item.getSerial()+"';";
        try {
            st.executeUpdate(delete_query);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
    }

