package sample;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



public class additems {
        private static Stage additemstage = new Stage();
        private static TextField request = new TextField();
        private static TextField appending = new TextField();
        private static TextField approved = new TextField();
        private static TextField denied = new TextField();
        private static TextField full_name = new TextField();
        private static TextField block_number = new TextField();
        private static Label requestlabel = new Label();
        private static Label appendinglabel = new Label();
        private static Label approvedlabel = new Label();
        private static Label deniedlabel = new Label();
        private static Label full_namelabel = new Label();
        private static Label block_numberlabel = new Label();
        private static VBox  container = new VBox();
        private static Scene itemscene = new Scene(container,350,500);
        private static Button submit = new Button();
        public void additem(){
                request.setAlignment(javafx.geometry.Pos.CENTER);
                request.setPrefHeight(48.0);
                request.setPrefWidth(50.0);
                request.setPromptText("request");
                request.setStyle("-fx-background-color:#262626");
                container.setStyle("-fx-background-color: gray");
                container.getChildren().addAll(request);
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
