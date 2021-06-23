package sample.Client;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sample.Chat.client;
import sample.MessageListener;

//import java.awt.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class chatgui {
    private static client client= new client("localhost",6789);
    public  static VBox all;
    public static Stage chatstage;
    public static Scene chatscene;
    public static TextField inserttext;
    public static Button sendmessage;
    public static ListView<Label> textview;
    public static HBox writer;
    public static ObservableList<Label> chat = FXCollections.observableArrayList();
    public static void display(){
       writer = new HBox();
       all = new VBox();
       chatstage = new Stage();
       inserttext = new TextField();
       sendmessage = new Button();
       textview = new ListView<>();

       all.setStyle("-fx-background-color: #262626");
       all.setSpacing(20);

       textview.setStyle("-fx-background-color:black;");


       inserttext.setPromptText("write your message here");

       sendmessage.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 25;");
       sendmessage.setTextFill(Color.BLACK);
       sendmessage.setText("Send");
       sendmessage.setOnMouseClicked(event -> {
           onAction(event);
       });
       client.addMessageListener(new MessageListener() {
            @Override
            public void readMessage(String msg) {
                Label chatitem = new Label(msg);
                chatitem.setTextFill(Color.valueOf("#bf7600"));
                Platform.runLater(()->{
                    chat.add(chatitem);
                    textview.setStyle("-fx-background-color:black;");
                });

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
        textview.setItems(chat);
        writer.setSpacing(20);
        writer.getChildren().addAll(inserttext,sendmessage);
        all.getChildren().addAll(textview,writer);
        chatscene = new Scene(all);
        chatstage.setScene(chatscene);
        chatstage.setOnCloseRequest(event -> {
            event.consume();
            chatstage.close();
            try {
                client.closesocket();
            } catch (IOException e) {
                System.out.println(e);
            }
        });
        chatstage.setTitle("chat");
        chatstage.setResizable(false);
        chatstage.show();
    }

    private static void onAction(MouseEvent event) {
        if(event.getSource()==sendmessage){
            String msg = inserttext.getText();
            if(!msg.equalsIgnoreCase("")){
                client.startMessageWriter(msg);
                inserttext.setText("");
            }
        }
    }

}
