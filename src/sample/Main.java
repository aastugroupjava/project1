package sample;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.effect.Blend;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.io.*;
import java.net.*;
import java.sql.SQLException;
import java.lang.*;


public class Main extends Application {
    private  ObjectOutputStream toServer;
    private  DataInputStream fromServer;
    protected String username= null;
    protected String password= null;
    protected  Pane pane;
    protected  Label label;
    protected  Label label0;
    protected  ImageView imageView;
    protected  VBox vBox;
    protected  TextField txtUsername;
    protected  PasswordField txtPassword;
    protected  Button btnSignin;
    protected  Blend blend;
    protected  Label btnForgot;
    protected  Separator separator;
    protected  Button btnSignup;
    protected  Blend blend0;
    protected  HBox hbox;
    public static Stage window;
    protected Scene login;
    protected Scene Signup;
    protected Label warning;
    private ScriptObjectMirror EventAll;
    private ScriptObjectMirror list;
    public String[][] userdata;
    public String in;
    public int b= 0,c=0,usercount=7;
    // public Object userdata;


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        pane = new Pane();
        label = new Label();
        label0 = new Label();
        imageView = new ImageView();
        vBox = new VBox();
        txtUsername = new TextField();
        txtPassword = new PasswordField();
        btnSignin = new Button();
        blend = new Blend();
        btnForgot = new Label();
        separator = new Separator();
        btnSignup = new Button();
        blend0 = new Blend();
        hbox = new HBox();
        warning = new Label();

        window.setOnCloseRequest(event -> {
            event.consume();
            alertbox close = new alertbox();
            close.closeconfirm();
        });

        hbox.setMaxHeight(Double.MAX_VALUE);
        hbox.setMaxWidth(Double.MAX_VALUE);
        hbox.setPrefHeight(558.0);
        hbox.setPrefWidth(749.0);
        hbox.setSpacing(100.0);
        hbox.setStyle("-fx-background-color: #262626;");

        pane.setPrefHeight(558.0);
        pane.setPrefWidth(266.0);
        pane.setStyle("-fx-background-color: black;");


        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(39.0);
        label.setLayoutY(354.0);
        label.setPrefHeight(23.0);
        label.setPrefWidth(173.0);
        label.setText("A.A.S.T.U   Inventory  ");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#bd7400"));
        label.setFont(new Font("Segoe UI", 18.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(23.0);
        label0.setLayoutY(389.0);
        label0.setPrefHeight(23.0);
        label0.setPrefWidth(205.0);
        label0.setText("Manage your inventory here.");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#bd7400"));
        label0.setFont(new Font("Segoe UI", 12.0));

        imageView.setFitHeight(200.0);
        imageView.setFitWidth(199.0);
        imageView.setLayoutX(31.0);
        imageView.setLayoutY(117.0);
        imageView.setImage(new Image(getClass().getResource("/images/photo_2020-09-24_19-38-11.jpg").toExternalForm()));

        vBox.setAlignment(javafx.geometry.Pos.CENTER);
        vBox.setPrefHeight(0.0);
        vBox.setPrefWidth(275.0);
        vBox.setSpacing(20.0);

        warning.setAlignment(Pos.CENTER);
        warning.setPrefHeight(10);
        warning.setPrefWidth(500);
        warning.setText("Wrong username or Password.");
        warning.setStyle("-fx-background-color: #262626");
        warning.setTextFill(Paint.valueOf("Red"));
        warning.setVisible(false);

        txtUsername.setAlignment(javafx.geometry.Pos.CENTER);
        txtUsername.setPrefHeight(48.0);
        txtUsername.setPrefWidth(275.0);
        txtUsername.setPromptText("username or email");
        txtUsername.setStyle("-fx-background-color: black;");

        VBox.setVgrow(txtPassword, javafx.scene.layout.Priority.ALWAYS);
        txtPassword.setAlignment(javafx.geometry.Pos.CENTER);
        txtPassword.setPrefHeight(53.0);
        txtPassword.setPrefWidth(275.0);
        txtPassword.setPromptText("password");
        txtPassword.setStyle("-fx-background-color: black;");

        btnSignin.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btnSignin.setMnemonicParsing(false);
        btnSignin.setOnMouseClicked(this::handleClicks);
        btnSignin.setPrefHeight(34.0);
        btnSignin.setPrefWidth(137.0);
        btnSignin.setStyle("-fx-background-color: #bf7600;");
        btnSignin.setText("Sign in");
        btnSignin.setTextFill(javafx.scene.paint.Color.valueOf("#f7f7f7"));

        btnSignin.setEffect(blend);

        VBox.setVgrow(btnForgot, javafx.scene.layout.Priority.ALWAYS);
        btnForgot.setAlignment(javafx.geometry.Pos.CENTER);
        btnForgot.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btnForgot.setPrefHeight(23.0);
        btnForgot.setPrefWidth(93.0);
        btnForgot.setText("Forgot Password");
        btnForgot.setTextFill(javafx.scene.paint.Color.valueOf("#2868dd"));
        btnForgot.setFont(new Font("Segoe UI", 12.0));
        btnForgot.setOnMouseClicked(this::handleClicks);

        separator.setPrefHeight(7.0);
        separator.setPrefWidth(275.0);
        separator.setStyle("-fx-background-color: ;");

        btnSignup.setMnemonicParsing(false);
        btnSignup.setPrefHeight(58.0);
        btnSignup.setPrefWidth(275.0);
        btnSignup.setStyle("-fx-background-color: #bf7600;");
        btnSignup.setText("Sign up");
        btnSignup.setTextFill(javafx.scene.paint.Color.WHITE);
        btnSignup.setOnMouseClicked(this::handleClicks);
        btnSignup.setEffect(blend0);

        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(imageView);
        hbox.getChildren().add(pane);
        vBox.getChildren().add(warning);
        vBox.getChildren().add(txtUsername);
        vBox.getChildren().add(txtPassword);
        vBox.getChildren().add(btnSignin);
        vBox.getChildren().add(btnForgot);
        vBox.getChildren().add(separator);
        vBox.getChildren().add(btnSignup);
        hbox.getChildren().add(vBox);


        login = new Scene(hbox);
        window.setScene(login);
        window.setResizable(false);
        window.show();
        try {
            Socket socket = new Socket("127.0.0.1",8000);
            toServer = new ObjectOutputStream(socket.getOutputStream());
            fromServer = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void handleClicks(MouseEvent mouseEvent)  {
        if (mouseEvent.getSource() == btnSignup) {
            signin.display();
            window.close();

        }
        if (mouseEvent.getSource() == btnSignin) {
//            username = txtUsername.getText();
//            password = txtPassword.getText();
//            Controller validator = new Controller();
//            if(validator.validator(username, password)){
//                dashboard.newdashboard();
//                window.close();
//            }
//            else{
//                warning.setVisible(true);
//            }
            //c = new String[4][3];
//            Object[][] userdata= new Object[EventAll.size()][];

//
            try {
                 //toServer.writeInt(1);
                 usercount = fromServer.readInt();
                //int t = fromServer.readInt();
               // System.out.println(t);
                System.out.println(usercount);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[][] userdata = new String[usercount][3];
            for(int i =0;i<usercount;i++) {
                for(int j=0;j<3;j++) {
                    try {
//                   System.out.println(Controller.userdata[0][0]);
                       // toServer.writeInt(2);
                        userdata[i][j] = fromServer.readUTF();
//                    c++;
//                    b++;
                        System.out.println(userdata[i][j]);
                        //System.out.println(userdata);
                        // c = fromServer.readLine();
                        // System.out.println(c);


                    } catch (IOException e) {
                        System.out.println("error1:" + e);
                    }
                }
            }
        }
        if(mouseEvent.getSource()==btnForgot)
        {
            forgetpassword.display();
            window.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        launch(args);
        Controller connect = new Controller();
        //connect.getData();

    }
}

