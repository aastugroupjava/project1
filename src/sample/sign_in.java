package sample;
import javafx.application.Application;
import javafx.fxml.Initializable;
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
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;


public class sign_in implements Initializable {

    protected AnchorPane anchorPane;
    protected  Pane pane;
    protected  Label label;
    protected  Label label0;
    protected  VBox vBox;
    protected  TextField txtUsername;
    protected  PasswordField txtPassword;
    protected  Separator separator;
    protected  Button btnSignup;
    protected  Blend blend;
    public void initialize (URL url, ResourceBundle rb){

    }
    public void start(Stage primaryStage) throws Exception{

        anchorPane = new AnchorPane();
        pane = new Pane();
        label = new Label();
        label0 = new Label();
        vBox = new VBox();
        txtUsername = new TextField();
        txtPassword = new PasswordField();
        separator = new Separator();
        btnSignup = new Button();
        blend = new Blend();

        anchorPane.setMaxHeight(Region.USE_PREF_SIZE);
        anchorPane.setMaxWidth(Region.USE_PREF_SIZE);
        anchorPane.setMinHeight(Region.USE_PREF_SIZE);
        anchorPane.setMinWidth(Region.USE_PREF_SIZE);
        anchorPane.setPrefHeight(490.0);
        anchorPane.setPrefWidth(696.0);
        anchorPane.setStyle("-fx-background-color: #262626;");

        pane.setLayoutX(-2.0);
        pane.setPrefHeight(500.0);
        pane.setPrefWidth(209.0);
        pane.setStyle("-fx-background-color: black;");

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(5.0);
        label.setLayoutY(318.0);
        label.setPrefHeight(23.0);
        label.setPrefWidth(173.0);
        label.setText("A.A.S.T.U   Inventory  ");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#bd7400"));
        label.setFont(new Font("Segoe UI", 18.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(-11.0);
        label0.setLayoutY(365.0);
        label0.setPrefHeight(23.0);
        label0.setPrefWidth(205.0);
        label0.setText("Manage your inventory here.");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#bd7400"));
        label0.setFont(new Font("Segoe UI", 12.0));

        vBox.setAlignment(javafx.geometry.Pos.CENTER);
        vBox.setLayoutX(310.0);
        vBox.setLayoutY(136.0);
        vBox.setPrefHeight(199.0);
        vBox.setPrefWidth(275.0);
        vBox.setSpacing(20.0);

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

        separator.setPrefHeight(7.0);
        separator.setPrefWidth(275.0);
        separator.setStyle("-fx-background-color: ;");

        btnSignup.setMnemonicParsing(false);
        btnSignup.setPrefHeight(58.0);
        btnSignup.setPrefWidth(275.0);
        btnSignup.setStyle("-fx-background-color: #bf7600;");
        btnSignup.setText("Sign up");
        btnSignup.setTextFill(javafx.scene.paint.Color.WHITE);

        btnSignup.setEffect(blend);

        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        anchorPane.getChildren().add(pane);
        vBox.getChildren().add(txtUsername);
        vBox.getChildren().add(txtPassword);
        vBox.getChildren().add(separator);
        vBox.getChildren().add(btnSignup);
        anchorPane.getChildren().add(vBox);


        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();



    }

    public void handleClicks(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == btnSignup) {
            pane.setStyle("-fx-background-color : #1620A1;");
            pane.toFront();
        }
    }

}


