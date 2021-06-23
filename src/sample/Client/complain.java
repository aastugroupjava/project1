package sample.Client;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconName;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.*;
import sample.Server.Controller;
import sample.complain_model;
import sample.editcomplain;
import sample.found;
import sample.stolenitem;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.util.Date;

public  class complain {
    public static  Scene scenecomplain;
    protected static  Button button0;
    protected static Button button;
    public static TableView<complain_model> tableView;
    private static Button additem = new Button();
    private static Button delete = new Button();
    private static Button status = new Button();
    private static Button edit = new Button();
    private static Button checkin = new Button();
    public  static Stage newdashboardd = new Stage();
    public static int stolen=0,all = 0,complain=0;
    private static Button search=new Button(),reset=new Button();
    private static String id;
    public static Stage studentdashboard = new Stage();
    private static Button button1;
    private static Button button2;
    private static Button button4;
    public static Scene display() throws RemoteException, NotBoundException, MalformedURLException {
        Button button3;
        VBox vBox;
        ImageView imageView;
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
        Label label5;
        Label label6;
        Label label7;
        TableColumn tableColumn;
        TableColumn<complain_model,String> tableColumn0;
        TableColumn<complain_model,String> tableColumn1;
        TableColumn<complain_model,String> tableColumn2;
        TableColumn<complain_model,String> tableColumn3;

        HBox mainBox;
        vBox = new VBox();
        imageView = new ImageView("images/icon123.png");
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
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        tableView = new TableView<complain_model>();
        tableColumn = new TableColumn<>();
        tableColumn0 = new TableColumn<>();
        tableColumn1 = new TableColumn<>();
        tableColumn2 = new TableColumn<>();
        tableColumn3 = new TableColumn<>();





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
        button.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        });
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
        additem.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        additem.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.USER_PLUS,"30px"));
        additem.setTextFill(Color.DARKGREEN);
        additem.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        });

        //delete.setText("Delete");
        //delete.setAlignment(Pos.TOP_RIGHT);
        delete.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        delete.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.TRASH,"30px"));
        delete.setTextFill(Color.DARKRED);
        delete.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        });


       // edit.setText("Edit");
        //edit.setAlignment(Pos.TOP_RIGHT);
        edit.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        edit.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.EDIT,"30px"));
        edit.setTextFill(Color.DARKCYAN);
        edit.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        });

        //status.setText("Found");
        //edit.setAlignment(Pos.TOP_RIGHT);
        status.setStyle("-fx-background-color: #bf7600; -fx-border-radius: 5;");
        status.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.LAPTOP,"30px"));
        status.setTextFill(Color.BLUE);
        status.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
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
            try {
                onAction(event);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            //dashboard.getScene(scene2);
                    //stolenitemsview();
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
        button1.setOnMouseClicked(event -> {
            try {
                onAction(event);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
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
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
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
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
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
        search.setTextFill(javafx.scene.paint.Color.WHITE);
        search.setGraphic(GlyphsDude.createIcon(FontAwesomeIconName.SEARCH,"20px"));
        search.setOnMouseClicked(event -> {
            if(textField.equals(null)||textField.getText()==null){
                System.out.println("do nothing.");
            }
            else {
                id = textField.getText();
                try {
                    onAction(event);
                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (NotBoundException e) {
                    e.printStackTrace();
                } catch (MalformedURLException e) {
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
            ObservableList<complain_model> allitems=tableView.getItems();
            tableView.getItems().removeAll(allitems);
            try {
                getrefresh();
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
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
        tableColumn.setText("Complain Number");
        tableColumn.setCellValueFactory(new PropertyValueFactory<>("Complain_number"));


        tableColumn0.setPrefWidth(76.0);
        tableColumn0.setText("Id");
        tableColumn0.setCellValueFactory(new PropertyValueFactory<>("Item_ID"));

        tableColumn1.setPrefWidth(76.0);
        tableColumn1.setText("Complainer");
        tableColumn1.setCellValueFactory(new PropertyValueFactory<>("Complainer"));

        tableColumn2.setPrefWidth(74.0);
        tableColumn2.setText("Status");
        tableColumn2.setCellValueFactory(new PropertyValueFactory<>("Status"));

        tableColumn3.setPrefWidth(76.0);
        tableColumn3.setText("Date of complain");
        tableColumn3.setCellValueFactory(new PropertyValueFactory<>("Date_of_complain"));



        //tableColumn5.setStyle("-fx-background-color:black");
        //tableColumn5.setStyle("-fx-text-color:black");
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

        anchorPane0.getChildren().addAll(additem,edit,delete,status);

        vBox2.getChildren().add(anchorPane0);
        vBox1.getChildren().add(vBox2);
        tableView.getColumns().add(tableColumn);
        tableView.getColumns().add(tableColumn0);
        tableView.getColumns().add(tableColumn1);
        tableView.getColumns().add(tableColumn2);
        tableView.getColumns().add(tableColumn3);




        // tablevbox.getChildren().add(tableView);
        vBox1.getChildren().add(tableView);
        vBox0.getChildren().add(vBox1);
        mainBox.getChildren().add(vBox0);

        //Controller item = new Controller();
        ControllerInterface item= (ControllerInterface) Naming.lookup("rmi://192.168.0.2/controller");
        ResultSet complain = item.getcomplaindata();
        try{
            ObservableList<complain_model> stdlist = FXCollections.observableArrayList();
            while(complain.next()){
                String complain_number = complain.getString("complain_number");
                String item_id = complain.getString("item_ID");
                String complainer = complain.getString("complainer");
                String status = String.valueOf(complain.getInt("status"));
                String date = complain.getString("date_of_complain");
//                System.out.println(request);
//                System.out.println(appending);
                stdlist.add(new complain_model(complain_number,item_id,complainer,status,date));


                //tableView.getItems().add(itemclass);
                // tableView.setVisible(true);
            }
            tableView.getItems().addAll(stdlist);
        }
        catch(Exception e){
            System.out.println("error_on_table:"+e);
        }
        scenecomplain= new Scene(mainBox);
        return scenecomplain;
//        studentdashboard.setScene(scenestud);
//        studentdashboard.setResizable(true);
//        studentdashboard.show();
//        studentdashboard.setMaximized(true);
//        studentdashboard.setOnCloseRequest(event -> {
//            event.consume();
//            alertbox close = new alertbox();
//            close.closeconfirmdashboard();
//        });



    }
    public static void getrefresh() throws RemoteException, NotBoundException, MalformedURLException {
        //Controller item = new Controller();
        ControllerInterface item = (ControllerInterface) Naming.lookup("rmi://192.168.0.2/controller");
        ResultSet complain = item.getcomplaindata();
        try{
            ObservableList<complain_model> itemlist = FXCollections.observableArrayList();
            while(complain.next()){
                String complain_number = complain.getString("complain_number");
                String item_id = complain.getString("item_ID");
                String complainer = complain.getString("complainer");
                String status = String.valueOf(complain.getInt("status"));
                String date = complain.getString("date_of_complain");
//                System.out.println(request);
//                System.out.println(appending);
                itemlist.add(new complain_model(complain_number,item_id,complainer,status,date));


                //tableView.getItems().add(itemclass);
                // tableView.setVisible(true);
            }
            tableView.getItems().addAll(itemlist);
            tableView.getItems().removeAll(itemlist);
            tableView.getItems().addAll(itemlist);
        }
        catch(Exception e){
            System.out.println("error_on_table:"+e);
        }


    }

    private static void onAction (MouseEvent event) throws RemoteException, NotBoundException, MalformedURLException {
        dashboard dash = new dashboard();
        ControllerInterface cont = (ControllerInterface) Naming.lookup("rmi://192.168.0.2/controller");
        if(event.getSource()==button0){
            dash.newdashboard.setScene(stolenitem.display());
        }
        if(event.getSource()==button1){
            dash.newdashboard.setScene(sample.studDash.display());
        }
        if(event.getSource()==button2){
            System.out.println("do nothing");
        }
        if(event.getSource()==button4){
            dash.newdashboard.close();
            Main.window.show();
        }
        if(event.getSource()==status){
            int index = tableView.getSelectionModel().getSelectedIndex();
            complain_model item = tableView.getItems().get(index);
            found.found(item);
            sample.stolenitem.getrefresh();
            getrefresh();
        }
        if(event.getSource()==edit){
            ObservableList<complain_model> itemselected = null;
            ObservableList<complain_model>allitems=null;
            int index = tableView.getSelectionModel().getSelectedIndex();
            complain_model item = tableView.getItems().get(index);
            if(cont.deletecomplain(item.getComplain_number())&&cont.delete_stolen(item.getItem_ID())) {
                editcomplain.editcomplain(item);
            }
            else{
                System.out.println("couldn't edit");
            }
        }
        if(event.getSource()==additem){
            addcomplain.addcomplain();
        }
        if(event.getSource()==delete){
            ObservableList<complain_model> itemselected = null;
            ObservableList<complain_model>allitems=null;
            int index = tableView.getSelectionModel().getSelectedIndex();
            complain_model item = tableView.getItems().get(index);
            allitems=tableView.getItems();
            itemselected = tableView.getSelectionModel().getSelectedItems();
            //System.out.println(item.getSerial());
            if(cont.deletecomplain(item.getComplain_number())){
                itemselected.forEach(allitems::remove);
            }
            else{
                System.out.println("deletion failed.");
            }
        }
        if(event.getSource()==button){
            System.out.println("it is clicked fam.");
            dash.newdashboard.setScene(dash.scene);
            dash.newdashboard.show();
           // dash.newdashboard.setFullScreen(true);
        }
        if(event.getSource()==search){
            ObservableList<complain_model> allitems=null;
            ResultSet searched= cont.searchcomplain(id);
            allitems= tableView.getItems();
            complain_model st=null;
            try{
                while (searched.next()){
                    String complain_number =searched.getString("complain_number");
                    String item_id = searched.getString("item_ID");
                    String complainer = searched.getString("complainer");
                    String status = String.valueOf(searched.getInt("status"));
                    String date = searched.getString("date_of_complain");
                    st = new complain_model(complain_number,item_id,complainer,status,date);
                }
            }catch (Exception e){
                System.out.println(e);
            }
            tableView.getItems().removeAll(allitems);
            tableView.getItems().add(st);
        }





    }

}

