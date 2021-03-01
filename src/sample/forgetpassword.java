package sample;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
public class forgetpassword {
    private static Stage window = Main.window;
    private static  Pane pane;
    private static  Label label;
    private static   Label label0;
    private static   VBox vBox;
    private static   TextField txtUsername;
    private static   Separator separator;
    private static   Button btnFindPassword;
    private static   Blend blend;
    private static  AnchorPane anchorPane;
    private static Button go_back;
    private static ImageView imageview;

    public static void display(){
        Stage forgetpassword = new Stage();
        imageview = new ImageView();
        pane = new Pane();
        label = new Label();
        label0 = new Label();
        vBox = new VBox();
        txtUsername = new TextField();
        separator = new Separator();
        btnFindPassword = new Button();
        blend = new Blend();
        anchorPane = new AnchorPane();
        go_back = new Button();

        anchorPane.setMaxHeight(Region.USE_PREF_SIZE);
        anchorPane.setMaxWidth(Region.USE_PREF_SIZE);
        anchorPane.setMinHeight(Region.USE_PREF_SIZE);
        anchorPane.setMinWidth(Region.USE_PREF_SIZE);
        anchorPane.setPrefHeight(490.0);
        anchorPane.setPrefWidth(696.0);
        anchorPane.setStyle("-fx-background-color: #262626;");

        pane.setLayoutX(-2.0);
        pane.setPrefHeight(490.0);
        pane.setPrefWidth(227.0);
        pane.setStyle("-fx-background-color: black;");

        imageview.setFitHeight(170.0);
        imageview.setFitWidth(150.0);
        imageview.setLayoutX(35.0);
        imageview.setLayoutY(105.0);
        imageview.setImage(new Image(forgetpassword.class.getResource("/images/photo_2020-09-24_19-38-11.jpg").toExternalForm()));


        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(27.0);
        label.setLayoutY(331.0);
        label.setPrefHeight(23.0);
        label.setPrefWidth(173.0);
        label.setText("A.A.S.T.U   Inventory  ");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#bd7400"));
        label.setFont(new Font("Segoe UI", 18.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(11.0);
        label0.setLayoutY(376.0);
        label0.setPrefHeight(23.0);
        label0.setPrefWidth(205.0);
        label0.setText("Manage your inventory here.");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#bd7400"));
        label0.setFont(new Font("Segoe UI", 12.0));

        vBox.setAlignment(javafx.geometry.Pos.CENTER);
        vBox.setLayoutX(310.0);
        vBox.setLayoutY(79.0);
        vBox.setPrefHeight(256.0);
        vBox.setPrefWidth(275.0);
        vBox.setSpacing(20.0);

        txtUsername.setAlignment(javafx.geometry.Pos.CENTER);
        txtUsername.setPrefHeight(48.0);
        txtUsername.setPrefWidth(275.0);
        txtUsername.setPromptText("Enter your phone number");
        txtUsername.setStyle("-fx-background-color: black;");

        separator.setPrefHeight(7.0);
        separator.setPrefWidth(275.0);
        separator.setStyle("-fx-background-color: ;");

        btnFindPassword.setMnemonicParsing(false);
        btnFindPassword.setPrefHeight(58.0);
        btnFindPassword.setPrefWidth(275.0);
        btnFindPassword.setStyle("-fx-background-color: #bf7600;");
        btnFindPassword.setText("Check.");
        btnFindPassword.setTextFill(javafx.scene.paint.Color.WHITE);
        btnFindPassword.setOnAction(e ->{
            String security = txtUsername.getText();
            Controller Forgetpassword =new Controller();
            String password = Forgetpassword.forgetpassword(security);
            alertbox.passwordrecovery(password);
        });
        btnFindPassword.setEffect(blend);

        go_back.setMnemonicParsing(false);
        go_back.setStyle("-fx-background-color:black");
        go_back.setText("Go back.");
        go_back.setTextFill(Color.WHITE);
        go_back.setOnAction(event -> {
            forgetpassword.close();
            window.show();
        });

        pane.getChildren().addAll(imageview,label,label0);
        anchorPane.getChildren().add(pane);
        vBox.getChildren().add(txtUsername);
        vBox.getChildren().add(separator);
        vBox.getChildren().add(btnFindPassword);
        vBox.getChildren().add(go_back);
        anchorPane.getChildren().add(vBox);


        Scene scene = new Scene(anchorPane);
        forgetpassword.setScene(scene);
        forgetpassword.setResizable(false);
        forgetpassword.show();
    }


}
