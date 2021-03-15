package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.Chat.client;

//import java.awt.*;
import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.List;


public class chatgui {
    private static client client= new client("localhost",6789);
    public static Stage chatstage;
    public static Scene chatscene;
    public static TextField inserttext;
    public static Button sendmessage;
    public static ScrollPane textview;
    public static List<Label> messages = new ArrayList<Label>();
    public static ObservableList<Label> chat = FXCollections.observableArrayList();
    public static void display(){
       chatstage = new Stage();
       inserttext = new TextField();
       sendmessage = new Button();
       textview = new ScrollPane();
       sendmessage.setText("send");
       sendmessage.setOnMouseClicked(event -> {
           onAction(event);
       });
       client.addMessageListener(new MessageListener() {
            @Override
            public void readMessage(String msg) {
                chat.add(new Label(msg));
            }
        });
        if(!client.connect()){
            System.out.println("connection failed");
        }
        else{
            System.out.println("connection created");
            //client.msg("hello");
            client.startMessageReader();
        }
    }

    private static void onAction(MouseEvent event) {
        if(event.getSource()==sendmessage){
            client.startMessageWriter(inserttext.getText());
        }
    }

}
