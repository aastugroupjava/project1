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
import sun.plugin.com.BeanCustomizer;

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
    static String security;
    private static Stage window=Main.window;
    private static TextField txtSecurity;
    protected  static Stage signin;
    private static Button go_back;

    public static void display(){
        signin =new Stage();

        go_back = new Button();
        anchorPane = new AnchorPane();
        pane = new Pane();
        label = new Label();
        label0 = new Label();
        vBox = new VBox();
        txtUsername = new TextField();
        txtPassword = new PasswordField();
        txtSecurity = new TextField();
        separator = new Separator();
        btnSignup = new Button();
        blend = new Blend();

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

        label.setAlignment(Pos.CENTER);
        label.setLayoutX(5.0);
        label.setLayoutY(318.0);
        label.setPrefHeight(23.0);
        label.setPrefWidth(173.0);
        label.setText("A.A.S.T.U   Inventory  ");
        label.setTextFill(Color.valueOf("#bd7400"));
        label.setFont(new Font("Segoe UI", 18.0));

        label0.setAlignment(Pos.CENTER);
        label0.setLayoutX(-11.0);
        label0.setLayoutY(365.0);
        label0.setPrefHeight(23.0);
        label0.setPrefWidth(205.0);
        label0.setText("Manage your inventory here.");
        label0.setTextFill(Color.valueOf("#bd7400"));
        label0.setFont(new Font("Segoe UI", 12.0));

        vBox.setAlignment(Pos.CENTER);
        vBox.setLayoutX(310.0);
        vBox.setLayoutY(136.0);
        vBox.setPrefHeight(199.0);
        vBox.setPrefWidth(275.0);
        vBox.setSpacing(20.0);

        txtUsername.setAlignment(Pos.CENTER);
        txtUsername.setPrefHeight(48.0);
        txtUsername.setPrefWidth(275.0);
        txtUsername.setPromptText("username or email");
        txtUsername.setStyle("-fx-background-color: black");

        txtSecurity.setAlignment(Pos.CENTER);
        txtSecurity.setPrefHeight(53.0);
        txtSecurity.setPrefWidth(275.0);
        txtSecurity.setPromptText("Security word");
        txtSecurity.setStyle("-fx-background-color: black");

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
            security = txtSecurity.getText();
            System.out.println(username);
            Controller signup = new Controller();
            if(username.equals("") || password.equals("") || security.equals("")) {
                System.out.println("fill all the forms");
            }
            else {
                if (signup.signup(username, password, security)) {
                    dashboard.newdashboard();
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

        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        anchorPane.getChildren().add(pane);
        vBox.getChildren().add(txtUsername);
        vBox.getChildren().add(txtPassword);
        vBox.getChildren().add(txtSecurity);
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