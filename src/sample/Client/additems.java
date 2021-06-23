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

import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class additems {
        public void additem(){
                 TextField ID = new TextField();
                 TextField full_name = new TextField();
                 TextField email = new TextField();
                 TextField departement = new TextField();
                 TextField block_number  = new TextField();
                 TextField dorm_room = new TextField();
                 TextField phone_number = new TextField();
                 TextField computer_serial = new TextField();
                 TextField computer_type = new TextField();
                 Label IDlabel = new Label();
                 Label fullnamelabel = new Label();
                 Label emaillabel = new Label();
                 Label departementlabel = new Label();
                 Label blocknumberlabel = new Label();
                 Label dormroomlabel = new Label();
                 Label phonenumberlabel = new Label();
                 Label computer_seriallabel = new Label();
                 Label computer_typelabel = new Label();
                 Label computer_statuslabel = new Label();
                 VBox  container = new VBox();
                 Scene itemscene = new Scene(container,350,700);
                 Button submit = new Button();
                Stage additemstage = new Stage();

                //Id label and field.

                IDlabel.setAlignment(javafx.geometry.Pos.CENTER);
                IDlabel.setText("ID:");
                IDlabel.setStyle("-fx-background-color:#262626");
                IDlabel.setTextFill(Color.WHITE);

                ID.setAlignment(javafx.geometry.Pos.CENTER);
                ID.setPrefHeight(48.0);
                ID.setPrefWidth(50.0);
                ID.setPromptText("ID Number");
                ID.setStyle("-fx-background-color:gray");

                //full_name label and field.

                fullnamelabel.setAlignment(javafx.geometry.Pos.CENTER);
                fullnamelabel.setText("full-name:");
                fullnamelabel.setStyle("-fx-background-color:#262626");
                fullnamelabel.setTextFill(Color.WHITE);

                full_name.setAlignment(javafx.geometry.Pos.CENTER);
                full_name.setPrefHeight(48.0);
                full_name.setPrefWidth(50.0);
                full_name.setPromptText("Full-Name");
                full_name.setStyle("-fx-background-color:gray");

                //email label and field.

                emaillabel.setAlignment(javafx.geometry.Pos.CENTER);
                emaillabel.setText("Email:");
                emaillabel.setStyle("-fx-background-color:#262626");
                emaillabel.setTextFill(Color.WHITE);

                email.setAlignment(javafx.geometry.Pos.CENTER);
                email.setPrefHeight(48.0);
                email.setPrefWidth(50.0);
                email.setPromptText("email");
                email.setStyle("-fx-background-color:gray");

                //departement label and field.

                departementlabel.setAlignment(javafx.geometry.Pos.CENTER);
                departementlabel.setText("Department:");
                departementlabel.setStyle("-fx-background-color:#262626");
                departementlabel.setTextFill(Color.WHITE);

                departement.setAlignment(javafx.geometry.Pos.CENTER);
                departement.setPrefHeight(48.0);
                departement.setPrefWidth(50.0);
                departement.setPromptText("Department");
                departement.setStyle("-fx-background-color:gray");

                //block-number label and field.

                blocknumberlabel.setAlignment(javafx.geometry.Pos.CENTER);
            blocknumberlabel.setText("Block-Number:");
            blocknumberlabel.setStyle("-fx-background-color:#262626");
            blocknumberlabel.setTextFill(Color.WHITE);

                block_number.setAlignment(javafx.geometry.Pos.CENTER);
                block_number.setPrefHeight(48.0);
            block_number.setPrefWidth(50.0);
            block_number.setPromptText("Block-Number");
            block_number.setStyle("-fx-background-color:gray");

                //dorm_room label and field.

            dormroomlabel.setAlignment(javafx.geometry.Pos.CENTER);
            dormroomlabel.setText("Dorm-Room:");
            dormroomlabel.setStyle("-fx-background-color:#262626");
            dormroomlabel.setTextFill(Color.WHITE);

            dorm_room.setAlignment(javafx.geometry.Pos.CENTER);
            dorm_room.setPrefHeight(48.0);
            dorm_room.setPrefWidth(50.0);
            dorm_room.setPromptText("Dorm-Room");
            dorm_room.setStyle("-fx-background-color:gray");

                //phone_number label and field.

            phonenumberlabel.setAlignment(javafx.geometry.Pos.CENTER);
            phonenumberlabel.setText("Phone-Number:");
            phonenumberlabel.setStyle("-fx-background-color:#262626");
            phonenumberlabel.setTextFill(Color.WHITE);

            phone_number.setAlignment(javafx.geometry.Pos.CENTER);
            phone_number.setPrefHeight(48.0);
            phone_number.setPrefWidth(50.0);
            phone_number.setPromptText("Phone-Number");
            phone_number.setStyle("-fx-background-color:gray");

                //computer_serial label and field.

            computer_seriallabel.setAlignment(javafx.geometry.Pos.CENTER);
            computer_seriallabel.setText("Computer-Serial:");
            computer_seriallabel.setStyle("-fx-background-color:#262626");
            computer_seriallabel.setTextFill(Color.WHITE);

            computer_serial.setAlignment(javafx.geometry.Pos.CENTER);
            computer_serial.setPrefHeight(48.0);
            computer_serial.setPrefWidth(50.0);
            computer_serial.setPromptText("Computer-Serial");
            computer_serial.setStyle("-fx-background-color:gray");
                //computer_type label and field.

            computer_typelabel.setAlignment(javafx.geometry.Pos.CENTER);
            computer_typelabel.setText("Computer-type:");
            computer_typelabel.setStyle("-fx-background-color:#262626");
            computer_typelabel.setTextFill(Color.WHITE);

            computer_type.setAlignment(javafx.geometry.Pos.CENTER);
            computer_type.setPrefHeight(48.0);
            computer_type.setPrefWidth(50.0);
            computer_type.setPromptText("Computer-type");
            computer_type.setStyle("-fx-background-color:gray");



            //submit button
            submit.setText("Add Item");
            submit.setAlignment(javafx.geometry.Pos.CENTER);
            submit.setPrefWidth(250.0);
            submit.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
            submit.setTextFill(Color.DARKGREEN);
            submit.setOnMouseClicked(event -> {
               // System.out.println("submit button is clicked.");
               // Controller additem = new Controller();
                ControllerInterface additem = null;
                try {
                    additem = (ControllerInterface) Naming.lookup("rmi://192.168.0.2/controller");
                } catch (NotBoundException e) {
                    e.printStackTrace();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                String id = ID.getText();
                String fullname = full_name.getText();
                String Email = email.getText();
                String dep = departement.getText();
                String block = block_number.getText();
                String dorm = dorm_room.getText();
                String phone = phone_number.getText();
                String serial = computer_serial.getText();
                String type = computer_type.getText();
                if(id.equals("")|| fullname.equals("")||Email.equals("")||dep.equals("")||block.equals("")||dorm.equals("")||phone.equals("")||serial.equals("")||type.equals("")){
                    System.out.println("fill all the forms");
                }
                else{
                    if(additem.additems(id,fullname,Email,dep,block,dorm,phone,serial,type)){
                        additemstage.close();
                        sample.Client.items item = new sample.Client.items(serial, "1",type,id,fullname,dep,block,dorm,phone);
                        dashboard.tableView.getItems().add(item);
                    }
                    else{
                        System.out.println("couldn't register, please try again.");
                    }
                }

            });


                container.setStyle("-fx-background-color:#262626 ");
                container.getChildren().addAll(IDlabel,ID,fullnamelabel,full_name,emaillabel,email,departementlabel,departement,blocknumberlabel,block_number,dormroomlabel,dorm_room,phonenumberlabel,phone_number,computer_seriallabel,computer_serial,computer_typelabel,computer_type,submit);
               // additemstage.initModality(Modality.APPLICATION_MODAL);
                additemstage.setOnCloseRequest(event -> {
                        event.consume();
                        additemstage.close();
                });
                additemstage.setScene(itemscene);
                additemstage.setResizable(false);
                additemstage.show();
        }



}

