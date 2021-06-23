package sample;

import java.util.Date;

public class complain_model {
    private String Complain_number;
    private String Item_ID;
    private String Complainer;
    private String Status;
    private String Date_of_complain;

    public complain_model(String comp,String id,String compl,String status,String date){
        this.Complain_number = comp;
        this.Item_ID= id;
        this.Complainer= compl;
        this.Status = status;
        this.Date_of_complain = date;
    }

    public String getComplain_number() {
        return Complain_number;
    }

    public String getComplainer() {
        return Complainer;
    }

    public String getDate_of_complain() {
        return Date_of_complain;
    }

    public String getItem_ID() {
        return Item_ID;
    }

    public String getStatus() {
        if(Status=="1"){
            return "Found";
        }
        else if(Status=="0"){
            return "Not Found";
        }
        return Status;
    }
}
