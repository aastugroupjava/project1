package sample;



public class stModel {
    private String ID;
    private String Full_Name;
    private String Email;
    private String Department;
    private String Block_number;
    private String Dorm_number;
    private String Phonenumber;

    public stModel(String id, String fullName, String email, String department, String bnum, String phone) {
        this.ID=id;
        this.Full_Name=fullName;
        this.Email=email;
        this.Department=department;
        this.Block_number=bnum;
        this.Phonenumber=phone;
    }


       
    


    public String getID(){
        return ID;
    }
    public String getFull_Name(){
        return Full_Name;
        }


    public String getEmail(){
        return Email;
    }
    public String Department(){
        return Department;
    }
    public String getBlock_number(){
        return Block_number;
    }
    public String getPhonenumber(){
        return Phonenumber;
    }


}


