package sample;

import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.xml.soap.Text;
//import java.awt.*;
import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.List;


public class chatgui {
    public static Stage chatstage;
    public static Scene chatscene;
    public static TextField inserttext;
    public static Button sendmessage;
    public static ScrollPane textview;
    public static List<Label> messages = new ArrayList<Label>();
    public void chatgui(){
       chatstage = new Stage();
       inserttext = new TextField();
       sendmessage = new Button();
       textview = new ScrollPane();


    }
}
