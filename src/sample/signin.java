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
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//import sun.plugin.com.BeanCustomizer;

import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;


public class signin {
    private static AnchorPane anchorPane;
    private static Pane pane;
    private static  Label label;
    private static  Label label0;
    private static  VBox vBox;
    private static  TextField txtUsername;
    private static  PasswordField txtPassword;
    private static  Separator separator;
    private static  Button btnSignup;
    private static  Blend blend;
    static String username;
    static String password;
    static String ID;
    static String Email;
    static String phonenumber;
    private static Stage window=Main.window;
    private static TextField txtID;
    private static TextField email;
    private static TextField phone_number;
    protected  static Stage signin;
    private static Button go_back;
    private static ImageView imageview;
    private static Label warning;

    public static void display(){
        warning = new Label();
        signin =new Stage();
        imageview = new ImageView();
        go_back = new Button();
        anchorPane = new AnchorPane();
        pane = new Pane();
        label = new Label();
        label0 = new Label();
        vBox = new VBox();
        txtUsername = new TextField();
        txtPassword = new PasswordField();
        txtID= new TextField();
        separator = new Separator();
        btnSignup = new Button();
        blend = new Blend();
        email = new TextField();
        phone_number = new TextField();

        anchorPane.setMaxHeight(Region.USE_PREF_SIZE);
        anchorPane.setMaxWidth(Region.USE_PREF_SIZE);
        anchorPane.setMinHeight(Region.USE_PREF_SIZE);
        anchorPane.setMinWidth(Region.USE_PREF_SIZE);
        anchorPane.setPrefHeight(490.0);
        anchorPane.setPrefWidth(696.0);
        anchorPane.setStyle("-fx-background-color: #262626");

        pane.setLayoutX(-2.0);
        pane.setPrefHeight(500.0);
        pane.setPrefWidth(209.0);
        pane.setStyle("-fx-background-color: black");

        imageview.setFitHeight(170.0);
        imageview.setFitWidth(150.0);
        imageview.setLayoutX(35.0);
        imageview.setLayoutY(105.0);
        imageview.setImage(new Image(signin.class.getResource("/images/photo_2020-09-24_19-38-11.jpg").toExternalForm()));

        label.setAlignment(Pos.TOP_RIGHT);
        label.setLayoutX(5.0);
        label.setLayoutY(318.0);
        label.setPrefHeight(23.0);
        label.setPrefWidth(173.0);
        label.setText(" A.A.S.T.U   Inventory ");
        label.setTextFill(Color.valueOf("#bd7400"));
        label.setFont(new Font("Segoe UI", 18.0));

        label0.setAlignment(Pos.CENTER);
        label0.setLayoutX(-11.0);
        label0.setLayoutY(365.0);
        label0.setPrefHeight(23.0);
        label0.setPrefWidth(205.0);
        label0.setText("  Manage your inventory here.");
        label0.setTextFill(Color.valueOf("#bd7400"));
        label0.setFont(new Font("Segoe UI", 12.0));

        vBox.setAlignment(Pos.CENTER);
        vBox.setLayoutX(310.0);
        vBox.setLayoutY(65.0);
        vBox.setPrefHeight(199.0);
        vBox.setPrefWidth(275.0);
        vBox.setSpacing(20.0);

        warning.setTextFill(Color.RED);
        warning.setText("Fill all the Forms please!");
        warning.setVisible(false);

        txtUsername.setAlignment(Pos.CENTER);
        txtUsername.setPrefHeight(48.0);
        txtUsername.setPrefWidth(275.0);
        txtUsername.setPromptText("Username");
        txtUsername.setStyle("-fx-background-color: black");

        txtID.setAlignment(Pos.CENTER);
        txtID.setPrefHeight(53.0);
        txtID.setPrefWidth(275.0);
        txtID.setPromptText("ID Number");
        txtID.setStyle("-fx-background-color: black");

        email.setAlignment(Pos.CENTER);
        email.setPrefHeight(53.0);
        email.setPrefWidth(275.0);
        email.setPromptText("Email");
        email.setStyle("-fx-background-color: black");

        phone_number.setAlignment(Pos.CENTER);
        phone_number.setPrefHeight(53.0);
        phone_number.setPrefWidth(275.0);
        phone_number.setPromptText("phone-number");
        phone_number.setStyle("-fx-background-color: black");

        VBox.setVgrow(txtPassword, Priority.ALWAYS);
        txtPassword.setAlignment(Pos.CENTER);
        txtPassword.setPrefHeight(58.0);
        txtPassword.setPrefWidth(275.0);
        txtPassword.setPromptText("password");
        txtPassword.setStyle("-fx-background-color: black");

        separator.setPrefHeight(7.0);
        separator.setPrefWidth(275.0);
        separator.setStyle("-fx-background-color: ");



        btnSignup.setMnemonicParsing(false);
        btnSignup.setPrefHeight(58.0);
        btnSignup.setPrefWidth(275.0);
        btnSignup.setStyle("-fx-background-color: #bf7600");
        btnSignup.setText("Sign up");
        btnSignup.setTextFill(Color.WHITE);
        btnSignup.setOnAction(e -> {
            username = txtUsername.getText();
            password = txtPassword.getText();
            ID = txtID.getText();
            Email = email.getText();
            phonenumber = phone_number.getText();
            System.out.println(username);
            Controller signup = new Controller();
            if(username.equals("") || password.equals("") || ID.equals("")||Email.equals("")||phonenumber.equals("")) {
                warning.setVisible(true);
            }
            else {
                if (signup.signup(username, password, ID,Email,phonenumber)) {
                    try {
                        dashboard.newdashboard();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    signin.close();
                } else {
                    System.out.println("couldn't register.please try again.");
                }
            }
        });
        btnSignup.setEffect(blend);

        go_back.setMnemonicParsing(false);
        go_back.setStyle("-fx-background-color:black");
        go_back.setText("Go back.");
        go_back.setTextFill(Color.WHITE);
        go_back.setOnAction(event -> {
            signin.close();
            window.show();
        });
        go_back.setEffect(blend);

        pane.getChildren().addAll(imageview,label,label0);
        anchorPane.getChildren().add(pane);
        vBox.getChildren().add(warning);
        vBox.getChildren().add(txtID);
        vBox.getChildren().add(txtUsername);
        vBox.getChildren().add(email);
        vBox.getChildren().add(txtPassword);
        vBox.getChildren().add(phone_number);
        vBox.getChildren().add(separator);
        vBox.getChildren().add(btnSignup);
        vBox.getChildren().add(go_back);
        anchorPane.getChildren().add(vBox);


        Scene scene = new Scene(anchorPane);
        signin.setScene(scene);
        signin.setResizable(false);
        signin.show();
    }

}