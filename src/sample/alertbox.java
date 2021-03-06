package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class alertbox {
    protected static Button button;
    protected static Label label;
    protected static VBox anchorPane;
    protected static Button button1;
    protected static Label label1;
    protected static Button button0;
    protected static Button button02;
    protected static Button button12;
    protected static Label label12;
    protected static AnchorPane anchorPane1;
    protected static AnchorPane anchorPane12;

    public static  void passwordrecovery(String password){
        Stage ok = new Stage();
        button = new Button();
        label = new Label();
        anchorPane = new VBox();
        ok.initModality(Modality.APPLICATION_MODAL);

        anchorPane.setStyle("-fx-background-color: #262626;");
        anchorPane.setAlignment(Pos.CENTER);
        anchorPane.setSpacing(25);

        button.setLayoutX(93.0);
        button.setLayoutY(114.0);
        button.setMnemonicParsing(false);
        button.setStyle("-fx-background-color: #bf7600;");
        button.setText("OK");
        button.setAlignment(javafx.geometry.Pos.CENTER);
        button.setOnAction(event -> {
                ok.close();
        });

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(27.0);
        label.setLayoutY(47.0);
        label.setText("Your password is: "+password);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        label.setFont(new Font("Times New Roman", 14.0));
        anchorPane.getChildren().addAll(label,button);

        Scene scene = new Scene(anchorPane);
        ok.setScene(scene);
        ok.setResizable(false);
        ok.show();

    }
    public static void closeconfirmlogin(){
        Stage confirm = new Stage();
        button1 = new Button();
        label1 = new Label();
        button0 = new Button();
        anchorPane1 = new AnchorPane();
        confirm.initModality(Modality.APPLICATION_MODAL);
        anchorPane1.setMaxHeight(Region.USE_PREF_SIZE);
        anchorPane1.setMaxWidth(Region.USE_PREF_SIZE);
        anchorPane1.setMinHeight(Region.USE_PREF_SIZE);
        anchorPane1.setMinWidth(Region.USE_PREF_SIZE);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(250.0);
        anchorPane1.setStyle("-fx-background-color: #262626;");

        button1.setLayoutX(56.0);
        button1.setLayoutY(115.0);
        button1.setMnemonicParsing(false);
        button1.setStyle("-fx-background-color: #800000;");
        button1.setText("Confirm");
        button1.setOnAction(e->{
            Main.window.close();
            confirm.close();
            //dashboard.dashboard.close();
        });

        label1.setAlignment(Pos.CENTER);
        label1.setLayoutX(10.0);
        label1.setLayoutY(47.0);
        label1.setPrefHeight(25.0);
        label1.setPrefWidth(250.0);
        label1.setText("Are you sure you want to quit?:(");
        label1.setTextFill(Color.valueOf("#fffdfd"));
        label1.setFont(new Font("Times New Roman", 14.0));

        button0.setLayoutX(149.0);
        button0.setLayoutY(115.0);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-background-color: #bf7600;");
        button0.setText("Cancel");
        button0.setOnAction(event -> {
            confirm.close();
        });

        anchorPane1.getChildren().add(button1);
        anchorPane1.getChildren().add(label1);
        anchorPane1.getChildren().add(button0);


        Scene scene = new Scene(anchorPane1);
        confirm.setScene(scene);
        confirm.setResizable(false);
        confirm.show();
    }
    public static void signout(){
        Stage signout = new Stage();
        button12 = new Button();
        label12 = new Label();
        button02 = new Button();
        anchorPane12 = new AnchorPane();
        signout.initModality(Modality.APPLICATION_MODAL);
        anchorPane12.setMaxHeight(Region.USE_PREF_SIZE);
        anchorPane12.setMaxWidth(Region.USE_PREF_SIZE);
        anchorPane12.setMinHeight(Region.USE_PREF_SIZE);
        anchorPane12.setMinWidth(Region.USE_PREF_SIZE);
        anchorPane12.setPrefHeight(200.0);
        anchorPane12.setPrefWidth(250.0);
        anchorPane12.setStyle("-fx-background-color: #262626;");

        button12.setLayoutX(56.0);
        button12.setLayoutY(115.0);
        button12.setMnemonicParsing(false);
        button12.setStyle("-fx-background-color: #800000;");
        button12.setText("Confirm");
        button12.setOnAction(e->{
            signout.close();
            Main.window.show();
            dashboard.dashboard.close();
        });

        label12.setAlignment(Pos.CENTER);
        label12.setLayoutX(10.0);
        label12.setLayoutY(47.0);
        label12.setPrefHeight(25.0);
        label12.setPrefWidth(250.0);
        label12.setText("Are you sure you want to sign-out?:(");
        label12.setTextFill(Color.valueOf("#fffdfd"));
        label12.setFont(new Font("Times New Roman", 14.0));

        button02.setLayoutX(149.0);
        button02.setLayoutY(115.0);
        button02.setMnemonicParsing(false);
        button02.setStyle("-fx-background-color: #bf7600;");
        button02.setText("Cancel");
        button02.setOnAction(event -> {
            signout.close();
        });

        anchorPane12.getChildren().add(button12);
        anchorPane12.getChildren().add(label12);
        anchorPane12.getChildren().add(button02);


        Scene scene = new Scene(anchorPane12);
        signout.setScene(scene);
        signout.setResizable(false);
        signout.show();
    }

    public void closeconfirmdashboard() {
        Stage confirm = new Stage();
        button1 = new Button();
        label1 = new Label();
        button0 = new Button();
        anchorPane1 = new AnchorPane();
        confirm.initModality(Modality.APPLICATION_MODAL);
        anchorPane1.setMaxHeight(Region.USE_PREF_SIZE);
        anchorPane1.setMaxWidth(Region.USE_PREF_SIZE);
        anchorPane1.setMinHeight(Region.USE_PREF_SIZE);
        anchorPane1.setMinWidth(Region.USE_PREF_SIZE);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(250.0);
        anchorPane1.setStyle("-fx-background-color: #262626;");

        button1.setLayoutX(56.0);
        button1.setLayoutY(115.0);
        button1.setMnemonicParsing(false);
        button1.setStyle("-fx-background-color: #800000;");
        button1.setText("Confirm");
        button1.setOnAction(e->{
            confirm.close();
            dashboard.newdashboard.close();
            studDash.studentdashboard.close();
        });

        label1.setAlignment(Pos.CENTER);
        label1.setLayoutX(10.0);
        label1.setLayoutY(47.0);
        label1.setPrefHeight(25.0);
        label1.setPrefWidth(250.0);
        label1.setText("Are you sure you want to quit?:(");
        label1.setTextFill(Color.valueOf("#fffdfd"));
        label1.setFont(new Font("Times New Roman", 14.0));

        button0.setLayoutX(149.0);
        button0.setLayoutY(115.0);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-background-color: #bf7600;");
        button0.setText("Cancel");
        button0.setOnAction(event -> {
            confirm.close();
        });

        anchorPane1.getChildren().add(button1);
        anchorPane1.getChildren().add(label1);
        anchorPane1.getChildren().add(button0);


        Scene scene = new Scene(anchorPane1);
        confirm.setScene(scene);
        confirm.initStyle(StageStyle.TRANSPARENT);
        confirm.setResizable(false);
        confirm.show();
    }
}
