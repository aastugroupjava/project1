package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.sql.ResultSet;

public  class studDash {
    public static  Scene scene;
    protected static  Button button0;
    protected static Button button;
    private static TableView<stModel> tableView;
    private static Button additem = new Button();
    private static Button delete = new Button();
    private static Button checkout = new Button();
    private static Button edit = new Button();
    private static Button checkin = new Button();
    public  static Stage newdashboardd = new Stage();
    public static Scene student()
    {
        System.out.println("newdashboard(after the login page redirection.)");
        VBox vBox;
        ImageView imageView;
        Button button1;
        Button button2;
        Button button3;
        Button button4;
        VBox vBox0;
        VBox vBox1;
        VBox vBox2;
        HBox anchorPane;
        Label label;
        TextField textField;
        HBox anchorPane0;
        Label label0;
        Label label1;
        Label label2;
        Label label3;
        TableColumn tableColumn;
        TableColumn<stModel,String> tableColumn0;
        TableColumn<stModel,String> tableColumn1;
        TableColumn<stModel,String> tableColumn2;
        TableColumn<stModel,String> tableColumn3;
        TableColumn<stModel,String> tableColumn4;
        TableColumn<stModel,String> tableColumn5;

        HBox mainBox;
        vBox = new VBox();
        imageView = new ImageView();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        Button btnSignup = new Button();
        vBox0 = new VBox();
        vBox1 = new VBox();
        vBox2 = new VBox();
        anchorPane = new HBox();
        label = new Label();
        textField = new TextField();
        anchorPane0 = new HBox();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        tableView = new TableView<stModel>();
        tableColumn = new TableColumn<>();
        tableColumn0 = new TableColumn<>();
        tableColumn1 = new TableColumn<>();
        tableColumn2 = new TableColumn<>();
        tableColumn3 = new TableColumn<>();
        tableColumn4 = new TableColumn<>();
        tableColumn5 = new TableColumn<>();




        mainBox = new HBox();

        mainBox.setMaxHeight(Region.USE_PREF_SIZE);
        mainBox.setMaxWidth(Region.USE_PREF_SIZE);
        mainBox.setMinHeight(Region.USE_PREF_SIZE);
        mainBox.setMinWidth(Region.USE_PREF_SIZE);
        mainBox.setPrefHeight(400.0);
        mainBox.setPrefWidth(600.0);

        vBox.setPrefHeight(400.0);
        vBox.setPrefWidth(230.0);
        vBox.setSpacing(15.0);
        vBox.setStyle("-fx-background-color: black;");

        imageView.setFitHeight(124.0);
        imageView.setFitWidth(167.0);
        imageView.setImage(new Image(dashboard.class.getResource("").toExternalForm()));


        VBox.setVgrow(button, Priority.ALWAYS);
        button.setAlignment(Pos.CENTER);
        button.setContentDisplay(ContentDisplay.CENTER);
        button.setMnemonicParsing(false);
        button.setStyle("-fx-background-color: black;");
        button.setText("All Items");
        button.setTextFill(Color.valueOf("#bf7600"));
        button.setOnMouseClicked(event -> {
            onAction(event);
        });
        VBox.setMargin(button, new Insets(0.0, 0.0, 0.0, 60.0));

        additem.setText("Add");
        //additem.setAlignment(Pos.BASELINE_LEFT);
        additem.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        additem.setTextFill(Color.DARKGREEN);
        additem.setOnMouseClicked(event -> {
            onAction(event);
        });

        delete.setText("Delete");
        //delete.setAlignment(Pos.TOP_RIGHT);
        delete.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        delete.setTextFill(Color.DARKRED);
        delete.setOnMouseClicked(event -> {
            onAction(event);
        });

        checkout.setText("Checkout");
        // checkout.setAlignment(Pos.TOP_RIGHT);
        checkout.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        checkout.setTextFill(Color.DARKBLUE);
        checkout.setOnMouseClicked(event -> {
            onAction(event);
        });

        checkin.setText("Checkin");
        // checkin.setAlignment(Pos.CENTER);
        checkin.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        checkin.setTextFill(Color.AZURE);
        checkin.setOnMouseClicked(event -> {
            onAction(event);
        });

        edit.setText("Edit");
        //edit.setAlignment(Pos.TOP_RIGHT);
        edit.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        edit.setTextFill(Color.DARKCYAN);
        edit.setOnMouseClicked(event -> {
            onAction(event);
        });

        VBox.setVgrow(button0, Priority.ALWAYS);
        button0.setAlignment(Pos.CENTER);
        button0.setContentDisplay(ContentDisplay.CENTER);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-background-color: black;");
        button0.setText("Stolen Items");
        button0.setTextFill(Color.valueOf("#bf7600"));
        button0.setOnMouseClicked(event -> {
                    onAction(event);
                    //dashboard.getScene(scene2);
                    //stolenitemsview();
                }
        );
        VBox.setMargin(button0, new Insets(0.0, 0.0, 0.0, 60.0));

        VBox.setVgrow(button1, Priority.ALWAYS);
        button1.setAlignment(Pos.CENTER);
        button1.setContentDisplay(ContentDisplay.CENTER);
        button1.setMnemonicParsing(false);
        button1.setStyle("-fx-background-color: black;");
        button1.setText("Student List");
        button1.setTextFill(Color.valueOf("#bf7600"));
        VBox.setMargin(button1, new Insets(0.0, 0.0, 0.0, 60.0));

        VBox.setVgrow(button2, Priority.ALWAYS);
        button2.setAlignment(Pos.CENTER);
        button2.setContentDisplay(ContentDisplay.CENTER);
        button2.setMnemonicParsing(false);
        button2.setStyle("-fx-background-color: black;");
        button2.setText("Appending Items");
        button2.setTextFill(Color.valueOf("#bf7600"));
        VBox.setMargin(button2, new Insets(0.0, 0.0, 0.0, 60.0));

        VBox.setVgrow(button3, Priority.ALWAYS);
        button3.setAlignment(Pos.CENTER);
        button3.setContentDisplay(ContentDisplay.CENTER);
        button3.setMnemonicParsing(false);
        button3.setStyle("-fx-background-color: black;");
        button3.setText("Setting");
        button3.setTextFill(Color.valueOf("#bf7600"));
        VBox.setMargin(button3, new Insets(0.0, 0.0, 0.0, 60.0));

        VBox.setVgrow(button4, Priority.ALWAYS);
        button4.setAlignment(Pos.CENTER);
        button4.setContentDisplay(ContentDisplay.CENTER);
        button4.setMnemonicParsing(false);
        button4.setStyle("-fx-background-color: black;");
        button4.setText("Sign-Out");
        button4.setTextFill(Color.valueOf("#bf7600"));
        VBox.setMargin(button4, new Insets(0.0, 0.0, 0.0, 60.0));

        HBox.setHgrow(vBox0, Priority.ALWAYS);
        vBox0.setPrefHeight(296.0);
        vBox0.setPrefWidth(434.0);

        VBox.setVgrow(vBox1, Priority.ALWAYS);
        vBox1.setPrefHeight(125.0);
        vBox1.setPrefWidth(434.0);
        vBox1.setStyle("-fx-background-color: #262626;");

        vBox2.setPrefHeight(124.0);
        vBox2.setPrefWidth(434.0);
        vBox2.setSpacing(35);

        anchorPane.setPrefHeight(Region.USE_PREF_SIZE);
        anchorPane.setPrefWidth(Region.USE_PREF_SIZE);
        anchorPane.setMaxWidth(Region.USE_COMPUTED_SIZE);
        anchorPane.setSpacing(5);



        label.setLayoutX(42.0);
        label.setLayoutY(23.0);
        label.setText("Welcome");
        label.setTextFill(Color.valueOf("#bf7600"));

        textField.setLayoutX(257.0);
        textField.setLayoutY(19.0);
        textField.setPromptText("search");
        textField.setAlignment(Pos.CENTER);

        btnSignup.setMnemonicParsing(false);
        btnSignup.setPrefHeight(58.0);
        btnSignup.setPrefWidth(25.0);
        btnSignup.setStyle("-fx-background-color: #bf7600");
        btnSignup.setText("search");
        btnSignup.setTextFill(javafx.scene.paint.Color.WHITE);

        anchorPane0.setPrefHeight(62.0);
        anchorPane0.setPrefWidth(434.0);
        anchorPane0.setSpacing(100);


        label0.setLayoutX(42.0);
        label0.setLayoutY(14.0);
        label0.setText("stolen items number");
        label0.setTextFill(Color.valueOf("#bf7600"));

        label1.setLayoutX(42.0);
        label1.setLayoutY(40.0);
        label1.setText("total items number");
        label1.setTextFill(Color.valueOf("#bf7600"));

        label2.setLayoutX(343.0);
        label2.setLayoutY(14.0);
        label2.setText("found items number");
        label2.setTextFill(Color.valueOf("#bf7600"));

        label3.setLayoutX(343.0);
        label3.setLayoutY(40.0);
        label3.setText("complain alerts");
        label3.setTextFill(Color.valueOf("#bf7600"));

        VBox.setVgrow(tableView, Priority.ALWAYS);
//        tableView.setPrefHeight(278.0);
//        tableView.setPrefWidth(434.0);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tableView.setStyle("-fx-textcolor:black");


        tableColumn.setPrefWidth(58.0);
        tableColumn.setText("ID");
        tableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));


        tableColumn0.setPrefWidth(76.0);
        tableColumn0.setText("Full Name");
        tableColumn0.setCellValueFactory(new PropertyValueFactory<>("Full_Name"));

        tableColumn1.setPrefWidth(76.0);
        tableColumn1.setText("Email");
        tableColumn1.setCellValueFactory(new PropertyValueFactory<>("Email"));

        tableColumn2.setPrefWidth(74.0);
        tableColumn2.setText("Department");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<>("Department"));

        tableColumn3.setPrefWidth(76.0);
        tableColumn3.setText("Block_number");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<>("Block_Number"));

        tableColumn4.setPrefWidth(72.0);
        tableColumn4.setText("Dorm room");
        tableColumn4.setCellValueFactory(new PropertyValueFactory<>("Dorm_Number"));

        tableColumn5.setPrefWidth(72.0);
        tableColumn5.setText("Phone_number");
        tableColumn5.setCellValueFactory(new PropertyValueFactory<>("Phonenumber"));

        //tableColumn5.setStyle("-fx-background-color:black");
        //tableColumn5.setStyle("-fx-text-color:black");
        vBox.getChildren().add(imageView);
        vBox.getChildren().add(button);
        vBox.getChildren().add(button0);
        vBox.getChildren().add(button1);
        vBox.getChildren().add(button2);
        vBox.getChildren().add(button3);
        vBox.getChildren().add(button4);
        mainBox.getChildren().add(vBox);
        //anchorPane.getChildren().add(label);
        anchorPane.getChildren().addAll(textField,btnSignup);
        vBox2.getChildren().add(anchorPane);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(label2);
        anchorPane0.getChildren().add(label3);


        vBox2.getChildren().add(anchorPane0);
        vBox1.getChildren().add(vBox2);
        tableView.getColumns().add(tableColumn);
        tableView.getColumns().add(tableColumn0);
        tableView.getColumns().add(tableColumn1);
        tableView.getColumns().add(tableColumn2);
        tableView.getColumns().add(tableColumn4);
        tableView.getColumns().add(tableColumn5);



        // tablevbox.getChildren().add(tableView);
        vBox1.getChildren().add(tableView);
        vBox0.getChildren().add(vBox1);
        mainBox.getChildren().add(vBox0);

        Controller item = new Controller();
        ResultSet students = item.getstudentdata();
        try{
            ObservableList<stModel> stdlist = FXCollections.observableArrayList();
            while(students.next()){
                String id = students.getString("ID");
                String fullName = students.getString("Full_Name");
                String Email = students.getString("Email");
                String Department= students.getString("Department");
                String Bnum = students.getString("Block_number");
                String phone = students.getString("phone_number");
//                System.out.println(request);
//                System.out.println(appending);
                stdlist.add(new stModel(id,fullName,Email,Department,Bnum,phone));


                //tableView.getItems().add(itemclass);
                // tableView.setVisible(true);
            }
            tableView.getItems().addAll(stdlist);
        }
        catch(Exception e){
            System.out.println("error_on_table:"+e);
        }
        scene = new Scene(mainBox);

       return scene;

    }

    private static void onAction (MouseEvent event){
        dashboard dash = new dashboard();
        if(event.getSource()==button){
            System.out.println("it is clicked fam.");
            dash.newdashboard.setScene(dash.scene);
            dash.newdashboard.show();
            dash.newdashboard.setFullScreen(true);
        }





    }

}
