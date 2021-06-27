package sample.Client;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.application.Application;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.Chat.client;


import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Random;


public class addcomplain{
    private static sample.Chat.client client = new client("localhost",6789);
    public static void addcomplain(){
        TextField ID = new TextField();
        TextField complainer = new TextField();
        Label IDlabel = new Label();
        Label complainerlabel = new Label();
        VBox  container = new VBox();
        Scene itemscene = new Scene(container);
        Button submit = new Button();
        Stage addcomplainstage = new Stage();

        //Id label and field.

        IDlabel.setAlignment(Pos.CENTER);
        IDlabel.setText("Item ID:");
        IDlabel.setStyle("-fx-background-color:#262626");
        IDlabel.setTextFill(Color.WHITE);

        ID.setAlignment(Pos.CENTER);
        ID.setPrefHeight(48.0);
        ID.setPrefWidth(50.0);
        ID.setPromptText("Item ID");
        ID.setStyle("-fx-background-color:gray");

        complainerlabel.setAlignment(Pos.CENTER);
        complainerlabel.setText("Complainer name:");
        complainerlabel.setStyle("-fx-background-color:#262626");
        complainerlabel.setTextFill(Color.WHITE);

        complainer.setAlignment(Pos.CENTER);
        complainer.setPrefHeight(48.0);
        complainer.setPrefWidth(50.0);
        complainer.setPromptText("Complainer name");
        complainer.setStyle("-fx-background-color:gray");



        //submit button
        submit.setText("Add Complain");
        submit.setAlignment(Pos.CENTER);
        submit.setPrefWidth(250.0);
        submit.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        submit.setTextFill(Color.DARKGREEN);
        submit.setOnMouseClicked(event -> {
            ControllerInterface addcomplain = null;
            try {
                addcomplain = (ControllerInterface) Naming.lookup("rmi://192.168.0.2/controller");
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            String id = ID.getText();
            String Complainer= complainer.getText();
            Random rand = new Random();
            int int_rand = rand.nextInt(10000);
            String complain_number = String.valueOf(int_rand);
            int status = 0;
            String found = "-";
            String gate = "-";
            String dorm = "-";
            String block = "-";
            Date date = new Date(System.currentTimeMillis());
            if(id.equals("")|| Complainer.equals("")){
                System.out.println("fill all the forms");
            }
            else{
                if(addcomplain.searchpossibleitem(id)) {
                    if (addcomplain.addcomplain(id, Complainer, complain_number, status, found, gate, dorm, block, String.valueOf(date))) {
                        addcomplainstage.close();
                        complain_model complain = new complain_model(complain_number, id, Complainer, String.valueOf(status), String.valueOf(date));
                        sample.Client.complain.tableView.getItems().add(complain);
                        try {
                            RmiInterface remote = (RmiInterface) Naming.lookup("rmi://localhost:7000/notification");
                            client.startMessageWriter(remote.echo());
                        } catch (Exception e) {
                            System.out.println("rmi error:"+e);
                        }
                    } else {
                        System.out.println("couldn't register, please try again.");
                    }
                }
                else{
                    System.out.println("there is no item registered with this serial number.");
                }
            }
        });


        container.setStyle("-fx-background-color:#262626 ");
        container.getChildren().addAll(IDlabel,ID,complainerlabel,complainer,submit);
        // additemstage.initModality(Modality.APPLICATION_MODAL);
        addcomplainstage.setOnCloseRequest(event -> {
            event.consume();
            addcomplainstage.close();
        });
        addcomplainstage.setScene(itemscene);
        addcomplainstage.setResizable(false);
        addcomplainstage.show();
    }



}


