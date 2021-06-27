package sample.Client;
import javafx.collections.ObservableList;
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

import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Random;


public class found{
    public static void found(sample.Client.complain_model complainitem){
        TextField found = new TextField();
        TextField gate = new TextField();
        TextField dorm = new TextField();
        TextField block = new TextField();
        Label foundlabel = new Label();
        Label gatelabel = new Label();
        Label dormlabel = new Label();
        Label blocklabel = new Label();
        VBox  container = new VBox();
        Scene itemscene = new Scene(container);
        Button submit = new Button();
        Stage addcomplainstage = new Stage();

        //Id label and field.


        dormlabel.setAlignment(javafx.geometry.Pos.CENTER);
        dormlabel.setText("Found dorm:");
        dormlabel.setStyle("-fx-background-color:#262626");
        dormlabel.setTextFill(Color.WHITE);

        dorm.setAlignment(javafx.geometry.Pos.CENTER);
        dorm.setPrefHeight(48.0);
        dorm.setPrefWidth(50.0);
        dorm.setPromptText("Found dorm");
        dorm.setStyle("-fx-background-color:gray");

        blocklabel.setAlignment(javafx.geometry.Pos.CENTER);
        blocklabel.setText("Found block:");
        blocklabel.setStyle("-fx-background-color:#262626");
        blocklabel.setTextFill(Color.WHITE);

        block.setAlignment(javafx.geometry.Pos.CENTER);
        block.setPrefHeight(48.0);
        block.setPrefWidth(50.0);
        block.setPromptText("Found block");
        block.setStyle("-fx-background-color:gray");

        gatelabel.setAlignment(javafx.geometry.Pos.CENTER);
        gatelabel.setText("Found gate:");
        gatelabel.setStyle("-fx-background-color:#262626");
        gatelabel.setTextFill(Color.WHITE);

        gate.setAlignment(javafx.geometry.Pos.CENTER);
        gate.setPrefHeight(48.0);
        gate.setPrefWidth(50.0);
        gate.setPromptText("Found gate");
        gate.setStyle("-fx-background-color:gray");



        //submit button
        submit.setText("Found");
        submit.setAlignment(javafx.geometry.Pos.CENTER);
        submit.setPrefWidth(250.0);
        submit.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        submit.setTextFill(Color.DARKGREEN);
        submit.setOnMouseClicked(event -> {
            // System.out.println("submit button is clicked.");
            //Controller foundct = new Controller();
            ControllerInterface foundct= null;
            try {
                foundct = (ControllerInterface) Naming.lookup("rmi://192.168.0.2/controller");
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            // String founded = found.getText();
            String gated= gate.getText();
            String dormed = dorm.getText();
            String blocked = block.getText();
            Date date = new Date(System.currentTimeMillis());
            String id = complainitem.getItem_ID();
            if(gated.equals("")||dormed.equals("")||blocked.equals("")){
                System.out.println("fill all the forms");
            }
            else{
                try {
                    if(foundct.addfound(String.valueOf(date),gated,dormed,blocked,id)){
                        foundct.deletecomplain(complainitem.getComplain_number());
                        addcomplainstage.close();
                    }
                    else{
                        System.out.println("couldn't register, please try again.");
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

        });


        container.setStyle("-fx-background-color:#262626 ");
        container.getChildren().addAll(gatelabel,gate,dormlabel,dorm,blocklabel,block,submit);
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


