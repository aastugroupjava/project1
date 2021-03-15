package sample;


import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconName;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.text.GlyphView;
import javax.xml.crypto.Data;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static sample.Controller.*;

public class dashboard {
    public static Scene scene;
    public static Scene scene2;
    public static TableView<items> tableView;
    protected static  VBox vBox;
    protected static  ImageView imageView;
    protected static  Button button;
    public static  Button button0;
    public static  Button button1;
    public static Button search;
    protected static  Button button2;
    protected static  Button button3;
    protected static  Button button4;
    protected static  VBox vBox0;
    protected static  VBox vBox1;
    protected static  VBox vBox2;
    protected static  AnchorPane anchorPane;
    protected static  Label label;
    protected static  TextField textField;
    protected static AnchorPane anchorPane0;
    protected static  Label label0;
    protected static  Label label1;
    protected static  Label label2;
    protected static  Label label3;
    private static String id;
    protected static TableView<Data> tableView1;
    protected static  TableColumn tableColumn;
    protected static  TableColumn tableColumn0;
    protected static  TableColumn tableColumn1;
    protected static  TableColumn tableColumn2;
    protected static  TableColumn tableColumn3;
    protected static  TableColumn tableColumn4;
    protected static TableColumn tableColumn5;
    protected static  HBox mainBox;
    protected static  AnchorPane anchorpane;
    protected static  Button btnOverview;
    protected static  ImageView imageView0;
    protected static  Button btnOrders;
    protected static  ImageView imageView1;
    protected static  Button btnCustomers;
    protected static  ImageView imageView2;
    protected static  Button btnSettings;
    protected static  ImageView imageView3;
    protected static  Button btnSignout;
    protected static  ImageView imageView4;
    protected static  StackPane stackPane;
    protected static  Pane pnlCustomer;
    protected static  Pane pnlOrders;
    protected static  Pane pnlMenus;
    protected static  Pane pnlOverview;
    protected static  Label label4;
    protected static  VBox vBox3;
    protected static  HBox hBox0;
    protected static  Label label5;
    protected static  Label label6;
    protected static  Label label7;
    protected static  Label label8;
    protected static  Label label9;
    protected static  ScrollPane scrollPane;
    protected static  VBox pnItems;
    protected static  ImageView imageView5;
    protected static  DropShadow dropShadow;
    protected static Controller controller;
    protected static Stage dashboard;
    private static HBox hBox;
    public  static Stage newdashboard = new Stage();
    private static Button additem = new Button();
    private static Button delete = new Button();
    private static Button checkout = new Button();
    private static Button edit = new Button();
    private static Button checkin = new Button();
    private static Button reset = new Button();
    public static ResultSet counter1= null;
    public static ResultSet counter2= null;
    public static ResultSet counter3= null;
    public static int stolen=0,all = 0,complain=0;



    public static void newdashboard() throws SQLException {
        System.out.println("newdashboard(after the login page redirection.)");
          VBox vBox;
        ImageView imageView;
         Button button;
        // Button button1;

          Button button3;

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
          TableColumn<items,String> tableColumn;
          TableColumn<items,String> tableColumn0;
          TableColumn<items,String> tableColumn1;
          TableColumn<items,String> tableColumn2;
          TableColumn<items,String> tableColumn3;
          TableColumn<items,String> tableColumn4;
          TableColumn tableColumn5;
        TableColumn<items,String> tableColumn6;
        TableColumn<items,String> tableColumn7;
        TableColumn<items,String> tableColumn8;
         HBox mainBox;
        vBox = new VBox();
        imageView = new ImageView("images/icon123.png");
        //Text icon = GlyphsDude.createIcon(FontAwesomeIconName.LIST_ALT,"10px");
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        search = new Button();
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
        tableView = new TableView<items>();
        tableColumn = new TableColumn<>();
        tableColumn0 = new TableColumn<>();
        tableColumn1 = new TableColumn<>();
        tableColumn2 = new TableColumn<>();
        tableColumn3 = new TableColumn<>();
        tableColumn4 = new TableColumn<>();
        tableColumn5 = new TableColumn<>();
        tableColumn6 = new TableColumn<>();
        tableColumn7 = new TableColumn<>();
        tableColumn8 = new TableColumn<>();
        Label label5=new Label(),label6=new Label(),label7=new Label();

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

        imageView.setFitHeight(73.0);
        imageView.setFitWidth(67.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        VBox.setMargin(imageView, new Insets(50.0, 50.0, 10.0, 70.0));


        VBox.setVgrow(button, Priority.ALWAYS);
        button.setAlignment(Pos.CENTER);
        button.setContentDisplay(ContentDisplay.CENTER);
        button.setMnemonicParsing(false);
        button.setStyle("-fx-background-color: black;-fx-text-fill:#bf7600");
        button.setText("All Items");
        button.setGraphic(new ImageView("images/icons8_Home_32px.png"));
        button.setContentDisplay(ContentDisplay.LEFT);
        button.setTextFill(Color.valueOf("#bf7600"));
        VBox.setMargin(button, new Insets(0.0, 0.0, 0.0, 30.0));

        VBox.setVgrow(button3, Priority.ALWAYS);
        button3.setAlignment(Pos.CENTER);
        button3.setContentDisplay(ContentDisplay.CENTER);
        button3.setMnemonicParsing(false);
        button3.setStyle("-fx-background-color: black;-fx-text-fill:#bf7600");
        button3.setText("Chat");
        button3.setGraphic(new ImageView("images/icons8_Xbox_Menu_32px.png"));
        button3.setContentDisplay(ContentDisplay.LEFT);
        button3.setTextFill(Color.valueOf("#bf7600"));
        button3.setOnMouseClicked(event -> {
            chatgui chat = new chatgui();
            chat.display();
        });
        VBox.setMargin(button3, new Insets(0.0, 0.0, 0.0, 30.0));

        //additem.setText("Add");
        //additem.setAlignment(Pos.BASELINE_LEFT);
        additem.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 25;");
        additem.setTextFill(Color.DARKGREEN);
        additem.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.USER_PLUS,"30px"));
        additem.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //delete.setText("Delete");
        //delete.setAlignment(Pos.TOP_RIGHT);
        delete.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 10;");
        delete.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.TRASH,"30px"));
        delete.setTextFill(Color.DARKRED);
        delete.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //checkout.setText("Checkout");
       // checkout.setAlignment(Pos.TOP_RIGHT);
        checkout.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 10;");
        checkout.setTextFill(Color.DARKBLUE);
        checkout.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.SIGN_OUT,"30px"));
        checkout.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

       // checkin.setText("Checkin");
       // checkin.setAlignment(Pos.CENTER);
        checkin.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 10;");
        checkin.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.SIGN_IN,"30px"));
        checkin.setTextFill(Color.AZURE);
        checkin.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //edit.setText("Edit");
        //edit.setAlignment(Pos.TOP_RIGHT);
        edit.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 10;");
        edit.setTextFill(Color.DARKCYAN);
        edit.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.EDIT,"30px"));
        edit.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        VBox.setVgrow(button0, Priority.ALWAYS);
        button0.setAlignment(Pos.CENTER);
        button0.setContentDisplay(ContentDisplay.CENTER);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-background-color: black;");
        button0.setText("Stolen Items");
        button0.setGraphic(new ImageView("images/icons8_Slider__32px.png"));
        button0.setContentDisplay(ContentDisplay.LEFT);
        button0.setTextFill(Color.valueOf("#bf7600"));
        button0.setOnMouseClicked(event -> {
                    System.out.println("button is clicked");

                    try {
                        onAction(event);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
//
        }
        );
        VBox.setMargin(button0, new Insets(0.0, 0.0, 0.0, 30.0));

        VBox.setVgrow(button1, Priority.ALWAYS);
        button1.setAlignment(Pos.CENTER);
        button1.setContentDisplay(ContentDisplay.CENTER);
        button1.setMnemonicParsing(false);
        button1.setStyle("-fx-background-color: black;");
        button1.setText("Student List");
        button1.setGraphic(new ImageView("images/icons8_Open_Envelope_32px.png"));
        button1.setContentDisplay(ContentDisplay.LEFT);
        button1.setTextFill(Color.valueOf("#bf7600"));
        button1.setOnMouseClicked(event->{
            try {
                onAction(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        VBox.setMargin(button1, new Insets(0.0, 0.0, 0.0, 30.0));

        VBox.setVgrow(button2, Priority.ALWAYS);
        button2.setAlignment(Pos.CENTER);
        button2.setContentDisplay(ContentDisplay.CENTER);
        button2.setMnemonicParsing(false);
        button2.setStyle("-fx-background-color: black;");
        button2.setText("Complain Alerts");
        button2.setGraphic(new ImageView("images/icons8_Box_32px.png"));
        button2.setContentDisplay(ContentDisplay.LEFT);
        button2.setTextFill(Color.valueOf("#bf7600"));
        button2.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        VBox.setMargin(button2, new Insets(0.0, 0.0, 0.0, 30.0));



        VBox.setVgrow(button4, Priority.ALWAYS);
        button4.setAlignment(Pos.CENTER);
        button4.setContentDisplay(ContentDisplay.CENTER);
        button4.setMnemonicParsing(false);
        button4.setStyle("-fx-background-color: black;");
        button4.setText("Sign-Out");
        button4.setGraphic(new ImageView("images/icons8_Sign_Out_32px.png"));
        button4.setContentDisplay(ContentDisplay.LEFT);
        button4.setTextFill(Color.valueOf("#bf7600"));
        button4.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        VBox.setMargin(button4, new Insets(0.0, 0.0, 0.0, 30.0));

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

        search.setMnemonicParsing(false);
        search.setPrefHeight(58.0);
        search.setPrefWidth(25.0);
        search.setStyle("-fx-background-color: #bf7600");
        //search.setText("search");
        search.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.SEARCH,"20px"));
        search.setTextFill(javafx.scene.paint.Color.WHITE);
        search.setOnMouseClicked(event -> {
            if(textField.equals(null)||textField.getText()==null){

            }
            else {
                id = textField.getText();
                try {
                    onAction(event);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                reset.setVisible(true);
            }
        });

        reset.setMnemonicParsing(false);
        reset.setPrefHeight(58.0);
        reset.setPrefWidth(25.0);
        reset.setStyle("-fx-background-color: #FF0000");
        reset.setText("X");
        reset.setTextFill(javafx.scene.paint.Color.WHITE);
        reset.setVisible(false);
        reset.setOnMouseClicked(event -> {
            ObservableList<items> allitems=tableView.getItems();
            tableView.getItems().removeAll(allitems);
            getrefresh();
            textField.clear();
            reset.setVisible(false);
        });

        anchorPane0.setPrefHeight(62.0);
        anchorPane0.setPrefWidth(434.0);
        anchorPane0.setSpacing(100);

        all= Controller.itemnumbers();
        stolen= Controller.stolennumbers();
        complain=Controller.complainnumber();


        label0.setText(String.valueOf(stolen));
        label0.setTextFill(Color.RED);
        label0.setFont(new Font("System Bold",26.0));
        VBox.setVgrow(label0, Priority.ALWAYS);
        label0.setAlignment(Pos.CENTER);
        label0.setContentDisplay(ContentDisplay.CENTER);
        label0.setMnemonicParsing(false);
        label0.setStyle("-fx-background-color: black;");
        VBox.setMargin(label0, new Insets(0.0, 0.0, 0.0, 20.0));

        label5.setText("Stolen Items");
        label5.setTextFill(Color.valueOf("#bf7600"));
        label5.setFont(new Font("System Bold",22.0));
        VBox.setVgrow(label5, Priority.ALWAYS);
        label5.setAlignment(Pos.CENTER);
        label5.setContentDisplay(ContentDisplay.CENTER);
        label5.setMnemonicParsing(false);
        label5.setStyle("-fx-background-color: black;");
        VBox.setMargin(label5, new Insets(0.0, 0.0, 0.0, 20.0));


        label1.setText(String.valueOf(all));
        label1.setTextFill(Color.valueOf("#008000"));
        label1.setFont(new Font("System Bold",26.0));
        VBox.setVgrow(label1, Priority.ALWAYS);
        label0.setAlignment(Pos.CENTER);
        label0.setContentDisplay(ContentDisplay.CENTER);
        label0.setMnemonicParsing(false);
        label0.setStyle("-fx-background-color: black;");
        VBox.setMargin(label1, new Insets(0.0, 0.0, 0.0, 20.0));

        label6.setText("All Items");
        label6.setTextFill(Color.valueOf("#bf7600"));
        label6.setFont(new Font("System Bold",22.0));
        VBox.setVgrow(label6, Priority.ALWAYS);
        label6.setAlignment(Pos.CENTER);
        label6.setContentDisplay(ContentDisplay.CENTER);
        label6.setMnemonicParsing(false);
        label6.setStyle("-fx-background-color: black;");
        VBox.setMargin(label6, new Insets(0.0, 0.0, 0.0, 20.0));



        label3.setText(String.valueOf(complain));
        label3.setTextFill(Color.BLUE);
        label3.setFont(new Font("System Bold",26.0));
        VBox.setVgrow(label3, Priority.ALWAYS);
        label0.setAlignment(Pos.CENTER);
        label0.setContentDisplay(ContentDisplay.CENTER);
        label0.setMnemonicParsing(false);
        label0.setStyle("-fx-background-color: black;");
        VBox.setMargin(label3, new Insets(0.0, 0.0, 0.0, 20.0));

        label7.setText("Complain Alerts");
        label7.setTextFill(Color.valueOf("#bf7600"));
        label7.setFont(new Font("System Bold",22.0));
        VBox.setVgrow(label7, Priority.ALWAYS);
        label7.setAlignment(Pos.CENTER);
        label7.setContentDisplay(ContentDisplay.CENTER);
        label7.setMnemonicParsing(false);
        label7.setStyle("-fx-background-color: black;");
        VBox.setMargin(label7, new Insets(0.0, 0.0, 0.0, 20.0));

        VBox.setVgrow(tableView, Priority.ALWAYS);
//        tableView.setPrefHeight(278.0);
//        tableView.setPrefWidth(434.0);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tableView.setStyle("-fx-textcolor:black");


        tableColumn.setPrefWidth(58.0);
        tableColumn.setText("Serial Number");
        tableColumn.setCellValueFactory(new PropertyValueFactory<>("Serial"));


        tableColumn0.setPrefWidth(76.0);
        tableColumn0.setText("Status");
        tableColumn0.setCellValueFactory(new PropertyValueFactory<>("Status"));

        tableColumn1.setPrefWidth(76.0);
        tableColumn1.setText("Type");
        tableColumn1.setCellValueFactory(new PropertyValueFactory<>("Type"));

        tableColumn2.setPrefWidth(74.0);
        tableColumn2.setText("Id");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<>("Id"));

        tableColumn3.setPrefWidth(76.0);
        tableColumn3.setText("Full_Name");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<>("Full_name"));

        tableColumn4.setPrefWidth(72.0);
        tableColumn4.setText("Delete");

        tableColumn5.setPrefWidth(72.0);
        tableColumn5.setText("Block_number");
        tableColumn5.setCellValueFactory(new PropertyValueFactory<>("Block"));

        tableColumn6.setPrefWidth(72.0);
        tableColumn6.setText("Dep");
        tableColumn6.setCellValueFactory(new PropertyValueFactory<>("Dep"));

        tableColumn7.setPrefWidth(72.0);
        tableColumn7.setText("Dorm");
        tableColumn7.setCellValueFactory(new PropertyValueFactory<>("Dorm"));

        tableColumn8.setPrefWidth(72.0);
        tableColumn8.setText("Phone_number");
        tableColumn8.setCellValueFactory(new PropertyValueFactory<>("Phonenumber"));

        //tableColumn5.setStyle("-fx-background-color:black");
        //tableColumn5.setStyle("-fx-text-color:black");
        vBox.setSpacing(20);
        vBox.getChildren().add(imageView);
        vBox.getChildren().add(button);
        vBox.getChildren().add(button0);
        vBox.getChildren().add(button1);
        vBox.getChildren().add(button2);
        vBox.getChildren().add(button3);
        vBox.getChildren().add(button4);
        vBox.getChildren().add(label0);
        vBox.getChildren().add(label5);
        vBox.getChildren().add(label1);
        vBox.getChildren().add(label6);
        vBox.getChildren().add(label3);
        vBox.getChildren().add(label7);
        mainBox.getChildren().add(vBox);
        //anchorPane.getChildren().add(label);
        anchorPane.getChildren().addAll(textField,search,reset);
        vBox2.getChildren().add(anchorPane);
//        anchorPane0.getChildren().add(label0);
//        anchorPane0.getChildren().add(label1);
//        anchorPane0.getChildren().add(label3);
        anchorPane0.getChildren().add(additem);
        anchorPane0.getChildren().add(delete);
        anchorPane0.getChildren().add(edit);
        anchorPane0.getChildren().add(checkout);
        anchorPane0.getChildren().add(checkin);
        vBox2.getChildren().add(anchorPane0);
        vBox1.getChildren().add(vBox2);
        tableView.getColumns().add(tableColumn);
        tableView.getColumns().add(tableColumn0);
        tableView.getColumns().add(tableColumn1);
        tableView.getColumns().add(tableColumn2);
        tableView.getColumns().add(tableColumn3);
        tableView.getColumns().add(tableColumn5);
        tableView.getColumns().add(tableColumn6);
        tableView.getColumns().add(tableColumn7);
        tableView.getColumns().add(tableColumn8);


       // tablevbox.getChildren().add(tableView);
        vBox1.getChildren().add(tableView);
        vBox0.getChildren().add(vBox1);
        mainBox.getChildren().add(vBox0);

        Controller item = new Controller();
        ResultSet items = item.getitemdata();
        try{
            ObservableList<items> itemlist = FXCollections.observableArrayList();
            while(items.next()){
              String serial = items.getString("serial_number");
              String status = items.getString("current_status");
              String type = items.getString("computer_type");
              String id = items.getString("ID");
              String full_name = items.getString("full_name");
              String dep = items.getString("departement");
              String block_number = items.getString("block_number");
              String dorm = items.getString("dorm_room");
              String phone = items.getString("phone_number");
//                System.out.println(request);
//                System.out.println(appending);
                itemlist.add(new items(serial,status,type,id,full_name,dep,block_number,dorm,phone));


                //tableView.getItems().add(itemclass);
               // tableView.setVisible(true);
            }
            tableView.getItems().addAll(itemlist);
        }
        catch(Exception e){
            System.out.println("error_on_table:"+e);
        }

         scene = new Scene(mainBox);
        newdashboard.setScene(scene);

        newdashboard.setResizable(true);
        newdashboard.show();
       // newdashboard.initStyle(StageStyle.TRANSPARENT);
     //   newdashboard.setResizable(false);
       // newdashboard.setFullScreen(true);
        newdashboard.setMaximized(true);
        newdashboard.setOnCloseRequest(event ->{
            event.consume();
            alertbox close = new alertbox();
            close.closeconfirmdashboard();
        } );

    }


    private static void onAction (MouseEvent event) throws Exception{
        additems additems = new additems();
        Controller cont = new Controller();
        if(event.getSource()==button2){
            System.out.println("button is clicked");
            newdashboard.setScene(sample.complain.display());
        }
        if(event.getSource()==button4){
            System.out.println("signout is clicked");
            newdashboard.close();
            Main.window.show();
        }
        if(event.getSource()==search){
            ObservableList<items> allitems=null;
           ResultSet searched= cont.searchitem(id);
           allitems= tableView.getItems();
           items item=null;
           try{
               while (searched.next()){
                   String serial = searched.getString("serial_number");
                   String status = searched.getString("current_status");
                   String type = searched.getString("computer_type");
                   String ids = searched.getString("ID");
                   String full_name = searched.getString("full_name");
                   String dep = searched.getString("departement");
                   String block_number = searched.getString("block_number");
                   String dorm = searched.getString("dorm_room");
                   String phone = searched.getString("phone_number");
                   item = new items(serial,status,type,ids,full_name,dep,block_number,dorm,phone);
               }
           }catch (Exception e){
               System.out.println(e);
           }
           tableView.getItems().removeAll(allitems);
           tableView.getItems().add(item);
        }
        if(event.getSource()==button1){

            newdashboard.setScene(studDash.display());
            //newdashboard.close();
            //newdashboard.setResizable(false);
            //newdashboard.show();
            //newdashboard.setMaximized(true);
//            newdashboard.setOnCloseRequest(ev ->{
//                ev.consume();
//                alertbox close = new alertbox();
//                close.closeconfirmdashboard();
//            } );
           // newdashboard.setFullScreen(true);

        }
        if(event.getSource()==additem){
            additems.additem();
        }
        else if (event.getSource()==delete){
            ObservableList<items> itemselected = null;
            ObservableList<items>allitems=null;
            int index = tableView.getSelectionModel().getSelectedIndex();
            items item = tableView.getItems().get(index);
            allitems=tableView.getItems();
            itemselected = tableView.getSelectionModel().getSelectedItems();
            //System.out.println(item.getSerial());
            if(cont.deleteitems(item)){
                itemselected.forEach(allitems::remove);
            }
            else{
                System.out.println("deletion failed.");
            }
        }
         if(event.getSource()==button0){
            System.out.println("before");
            //stolenitemsview();
             //stolenitem.display();
           //  newdashboard.setMaximized(true);
            newdashboard.setScene(stolenitem.display());

            System.out.println("after");
        }
        else if(event.getSource()==checkout){
            ObservableList<items> itemselected = null;
            ObservableList<items>allitems=null;
            int index = tableView.getSelectionModel().getSelectedIndex();
            items item = tableView.getItems().get(index);
            allitems=tableView.getItems();
            itemselected = tableView.getSelectionModel().getSelectedItems();
            ResultSet search = cont.searchcomplain(item.getSerial());
            if(search.next()){
                System.out.println("this computer is reported to be stolen!");
            }
            else {
                if (item.getStatus() == "Outside school") {
                    System.out.println("u can't checkout");
                } else if (item.getStatus() == "Inside school") {
                    if (cont.checkout(item)) {
                        System.out.println("u can checkout now.");
                        tableView.getItems().removeAll(allitems);
                        getrefresh();
                    } else {
                        System.out.println("error, try again later.");
                    }
                }
            }
            //System.out.println(item.getSerial());

        }
        else if(event.getSource()==edit){
            ObservableList<items> itemselected = null;
            ObservableList<items>allitems=null;
            int index = tableView.getSelectionModel().getSelectedIndex();
            items item = tableView.getItems().get(index);
            if(cont.deleteitems(item)&&cont.deletestudent(item.getId())) {
                edititem.edititems(item);
            }
            else{
                System.out.println("couldn't edit");
            }
        }
        else if (event.getSource()==checkin){
            ObservableList<items> itemselected = null;
            ObservableList<items>allitems=null;
            int index = tableView.getSelectionModel().getSelectedIndex();
            items item = tableView.getItems().get(index);
            allitems=tableView.getItems();
            itemselected = tableView.getSelectionModel().getSelectedItems();
            ResultSet search = cont.searchcomplain(item.getSerial());
            if(search.next()){
                    System.out.println("this computer is  reported to be stolen!");
            }
            else {
                if (item.getStatus() == "Outside school") {
                    if (cont.check_in(item)) {
                        System.out.println("u can checkin now.");
                        tableView.getItems().removeAll(allitems);
                        getrefresh();
                    } else {
                        System.out.println("error, try again later.");
                    }
                } else if (item.getStatus() == "Inside school") {
                    System.out.println("u can't checkout");
                }
            }
        }




    }
    public static void getrefresh(){
        Controller item = new Controller();
        ResultSet items = item.getitemdata();
        try{
            ObservableList<items> itemlist = FXCollections.observableArrayList();
            while(items.next()){
                String serial = items.getString("serial_number");
                String status = items.getString("current_status");
                String type = items.getString("computer_type");
                String id = items.getString("ID");
                String full_name = items.getString("full_name");
                String dep = items.getString("departement");
                String block_number = items.getString("block_number");
                String dorm = items.getString("dorm_room");
                String phone = items.getString("phone_number");
//                System.out.println(request);
//                System.out.println(appending);
                itemlist.add(new items(serial,status,type,id,full_name,dep,block_number,dorm,phone));


                //tableView.getItems().add(itemclass);
                // tableView.setVisible(true);
            }
            tableView.getItems().addAll(itemlist);
        }
        catch(Exception e){
            System.out.println("error_on_table:"+e);
        }


    }


}

