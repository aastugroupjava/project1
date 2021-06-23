package sample.Client;

import javafx.collections.ObservableArray;

public class stolen_model  {
    private String Id_of_item;
    private String found_date;
    private String found_gate;
    private String found_dorm;
    private String found_block;


    public stolen_model (String Id_of_item,String found_date,String found_gate,String found_dorm, String found_bloke){
        this.Id_of_item = Id_of_item;
        this.found_date = found_date;
        this.found_gate = found_gate;
        this.found_dorm = found_dorm;
        this.found_block = found_bloke;

    }




    public String getId_of_item(){
        return Id_of_item;
    }
    public String getFound_date(){
        return found_date;
    }
    public String getFound_gate(){
        return found_gate;
    }
    public String getFound_dorm(){
        return found_dorm;
    }
    public String getFound_block(){
        return found_block;
    }



}

