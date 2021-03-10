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

//    public static void display(){
//        System.out.println("display");
//        dashboard = new Stage();
//        anchorpane = new AnchorPane();
//        vBox = new VBox();
//        imageView = new ImageView();
//        label = new Label();
//        btnOverview = new Button();
//        imageView0 = new ImageView();
//        btnOrders = new Button();
//        imageView1 = new ImageView();
//        btnCustomers = new Button();
//        imageView2 = new ImageView();
//        btnSettings = new Button();
//        imageView3 = new ImageView();
//        btnSignout = new Button();
//        imageView4 = new ImageView();
//        stackPane = new StackPane();
//        pnlCustomer = new Pane();
//        pnlOrders = new Pane();
//        pnlMenus = new Pane();
//        pnlOverview = new Pane();
//        textField = new TextField();
//        label0 = new Label();
//        hBox = new HBox();
//        vBox0 = new VBox();
//        label1 = new Label();
//        label2 = new Label();
//        vBox1 = new VBox();
//        label3 = new Label();
//        label4 = new Label();
//        vBox2 = new VBox();
//        vBox3 = new VBox();
//        hBox0 = new HBox();
//        label5 = new Label();
//        label6 = new Label();
//        label7 = new Label();
//        label8 = new Label();
//        label9 = new Label();
//        scrollPane = new ScrollPane();
//        pnItems = new VBox();
//        imageView5 = new ImageView();
//        dropShadow = new DropShadow();
//        controller = new Controller();
//
//
//        anchorpane.setMaxHeight(Region.USE_COMPUTED_SIZE);
//        anchorpane.setMaxWidth(Region.USE_COMPUTED_SIZE);
//        anchorpane.setMinHeight(Region.USE_COMPUTED_SIZE);
//        anchorpane.setMinWidth(Region.USE_COMPUTED_SIZE);
//        anchorpane.setPrefHeight(576.0);
//        anchorpane.setPrefWidth(1050.0);
//        anchorpane.setStyle("-fx-background-color: #02030A;");
//
//
//        AnchorPane.setBottomAnchor(vBox, 0.0);
//        AnchorPane.setTopAnchor(vBox, 0.0);
//        vBox.setAlignment(Pos.TOP_CENTER);
//        vBox.setPrefHeight(576.0);
//        vBox.setPrefWidth(256.0);
//        vBox.setStyle("-fx-background-color: black;");
//
//        imageView.setFitHeight(73.0);
//        imageView.setFitWidth(67.0);
//        imageView.setPickOnBounds(true);
//        imageView.setPreserveRatio(true);
//        imageView.setImage(new Image(dashboard.class.getResource("../images/icon123.png").toExternalForm()));
//        VBox.setMargin(imageView, new Insets(50.0, 0.0, 10.0, 0.0));
//
//        label.setText(userdata[0][0]);
//        label.setTextFill(Color.valueOf("#bf7600"));
//        VBox.setMargin(label, new Insets(0.0, 0.0, 20.0, 0.0));
//
//        btnOverview.setAlignment(Pos.BASELINE_LEFT);
//        btnOverview.setGraphicTextGap(22.0);
//        btnOverview.setMnemonicParsing(false);
//        btnOverview.setOnAction(event -> {
//
//        });
//        btnOverview.setPrefHeight(42.0);
//        btnOverview.setPrefWidth(259.0);
//        btnOverview.setStyle("-fx-background-color: black;");
//        btnOverview.getStylesheets().add("/sample/style.css");
//        btnOverview.setText("Overview");
//        btnOverview.setTextFill(Color.valueOf("#bf7600"));
//
//        imageView0.setFitHeight(23.0);
//        imageView0.setFitWidth(27.0);
//        imageView0.setPickOnBounds(true);
//        imageView0.setPreserveRatio(true);
//        imageView0.setImage(new Image(dashboard.class.getResource("../images/icons8_Home_32px.png").toExternalForm()));
//        btnOverview.setGraphic(imageView0);
//        btnOverview.setOpaqueInsets(new Insets(0.0));
//        VBox.setMargin(btnOverview, new Insets(0.0));
//        btnOverview.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        btnOrders.setAlignment(Pos.BASELINE_LEFT);
//        btnOrders.setGraphicTextGap(22.0);
//        btnOrders.setMnemonicParsing(false);
//        btnOrders.setOnAction(event -> {
//
//        });
//        btnOrders.setPrefHeight(42.0);
//        btnOrders.setPrefWidth(259.0);
//        btnOrders.setStyle("-fx-background-color: black;");
//        btnOrders.getStylesheets().add("/sample/style.css");
//        btnOrders.setText("Requests");
//
//        imageView1.setFitHeight(23.0);
//        imageView1.setFitWidth(27.0);
//        imageView1.setPickOnBounds(true);
//        imageView1.setPreserveRatio(true);
//        imageView1.setImage(new Image(dashboard.class.getResource("../images/icons8_Open_Envelope_32px.png").toExternalForm()));
//        btnOrders.setGraphic(imageView1);
//        btnOrders.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        btnCustomers.setAlignment(Pos.BASELINE_LEFT);
//        btnCustomers.setGraphicTextGap(22.0);
//        btnCustomers.setMnemonicParsing(false);
//        btnCustomers.setOnAction(event -> {
//
//        });
//        btnCustomers.setPrefHeight(42.0);
//        btnCustomers.setPrefWidth(259.0);
//        btnCustomers.setStyle("-fx-background-color: black;");
//        btnCustomers.getStylesheets().add("/sample/style.css");
//        btnCustomers.setText("Stolen Items");
//        btnCustomers.setOnAction(event -> {
//            dashboard show = new dashboard();
//            show.stolenitemsview();
//        });
//
//        imageView2.setFitHeight(23.0);
//        imageView2.setFitWidth(27.0);
//        imageView2.setPickOnBounds(true);
//        imageView2.setPreserveRatio(true);
//        imageView2.setImage(new Image(dashboard.class.getResource("../images/icons8_Search_52px.png").toExternalForm()));
//        btnCustomers.setGraphic(imageView2);
//        btnCustomers.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        btnSettings.setAlignment(Pos.BASELINE_LEFT);
//        btnSettings.setGraphicTextGap(22.0);
//        btnSettings.setMnemonicParsing(false);
//        btnSettings.setPrefHeight(42.0);
//        btnSettings.setPrefWidth(259.0);
//        btnSettings.setStyle("-fx-background-color: black;");
//        btnSettings.getStylesheets().add("/sample/style.css");
//        btnSettings.setText("Settings");
//
//        imageView3.setFitHeight(23.0);
//        imageView3.setFitWidth(27.0);
//        imageView3.setPickOnBounds(true);
//        imageView3.setPreserveRatio(true);
//        imageView3.setImage(new Image(dashboard.class.getResource("../images/icons8_Slider__32px.png").toExternalForm()));
//        btnSettings.setGraphic(imageView3);
//        btnSettings.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        btnSignout.setAlignment(Pos.BASELINE_LEFT);
//        btnSignout.setGraphicTextGap(22.0);
//        btnSignout.setMnemonicParsing(false);
//        btnSignout.setPrefHeight(42.0);
//        btnSignout.setPrefWidth(259.0);
//        btnSignout.setStyle("-fx-background-color: black;");
//        btnSignout.getStylesheets().add("/sample/style.css");
//        btnSignout.setText("Sign Out");
//        btnSignout.setOnAction(event -> {
//            alertbox close = new alertbox();
//            close.signout();
//
//        });
//
//        imageView4.setFitHeight(23.0);
//        imageView4.setFitWidth(27.0);
//        imageView4.setPickOnBounds(true);
//        imageView4.setPreserveRatio(true);
//        imageView4.setImage(new Image(dashboard.class.getResource("../images/icons8_Sign_Out_32px.png").toExternalForm()));
//        btnSignout.setGraphic(imageView4);
//        btnSignout.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        stackPane.setLayoutX(258.0);
//        stackPane.setMaxHeight(Region.USE_COMPUTED_SIZE);
//        stackPane.setMaxWidth(Region.USE_COMPUTED_SIZE);
//        stackPane.setMinHeight(Region.USE_COMPUTED_SIZE);
//        stackPane.setMinWidth(Region.USE_COMPUTED_SIZE);
//        stackPane.setPrefHeight(576.0);
//        stackPane.setPrefWidth(793.0);
//        stackPane.setStyle("-fx-background-color: #02030A;");
//
//        pnlCustomer.setPrefHeight(200.0);
//        pnlCustomer.setPrefWidth(200.0);
//
//        pnlOrders.setPrefHeight(200.0);
//        pnlOrders.setPrefWidth(200.0);
//
//        pnlMenus.setPrefHeight(200.0);
//        pnlMenus.setPrefWidth(200.0);
//
//        pnlOverview.setMaxHeight(Region.USE_COMPUTED_SIZE);
//        pnlOverview.setMaxWidth(Region.USE_COMPUTED_SIZE);
//        pnlOverview.setMinHeight(Region.USE_COMPUTED_SIZE);
//        pnlOverview.setMinWidth(Region.USE_COMPUTED_SIZE);
//        pnlOverview.setPrefHeight(576.0);
//        pnlOverview.setPrefWidth(850.0);
//        pnlOverview.setStyle("-fx-background-color: #262626;");
//
//        textField.setLayoutX(590.0);
//        textField.setLayoutY(47.0);
//        textField.setPrefHeight(27.0);
//        textField.setPrefWidth(183.0);
//        textField.setPromptText("search");
//        textField.setStyle("-fx-background-color: #262626; -fx-border-color: #bf7600; -fx-border-radius: 2em; -fx-text-inner-color: white;");
//
//        label0.setLayoutX(57.0);
//        label0.setLayoutY(25.0);
//        label0.setText("Orders");
//        label0.setTextFill(Color.valueOf("white"));
//        label0.setFont(new Font(24.0));
//
//        hBox.setAlignment(Pos.CENTER_LEFT);
//        hBox.setLayoutX(45.0);
//        hBox.setLayoutY(72.0);
//        hBox.setPrefHeight(92.0);
//        hBox.setPrefWidth(661.0);
//        hBox.setSpacing(50.0);
//
//        vBox0.setAlignment(Pos.CENTER);
//        vBox0.setPrefHeight(200.0);
//        vBox0.setPrefWidth(100.0);
//
//        label1.setText(String.valueOf(requestcounter));
//        label1.setTextFill(Color.valueOf("#008000"));
//        label1.setFont(new Font("System Bold", 26.0));
//
//        label2.setText("total");
//        label2.setTextFill(Color.valueOf("white"));
//
//        vBox1.setAlignment(Pos.CENTER);
//        vBox1.setPrefHeight(200.0);
//        vBox1.setPrefWidth(100.0);
//
//        label3.setText(String.valueOf(counterstolen));
//        label3.setTextFill(Color.valueOf("#800000"));
//        label3.setFont(new Font("System Bold", 26.0));
//
//        label4.setText("Stolen Items");
//        label4.setTextFill(Color.valueOf("white"));
//
//        vBox2.setAlignment(Pos.CENTER);
//        vBox2.setPrefHeight(200.0);
//        vBox2.setPrefWidth(100.0);
//
//        vBox3.setAlignment(Pos.CENTER);
//        vBox3.setPrefHeight(200.0);
//        vBox3.setPrefWidth(100.0);
//
//        hBox0.setAlignment(Pos.CENTER_LEFT);
//        hBox0.setLayoutX(41.0);
//        hBox0.setLayoutY(179.0);
//        hBox0.setPrefHeight(42.0);
//        hBox0.setPrefWidth(712.0);
//        hBox0.setSpacing(75.0);
//        hBox0.setStyle("-fx-background-color: #262626;");
//
//        label5.setPrefHeight(18.0);
//        label5.setPrefWidth(61.0);
//        label5.setText("Request");
//        label5.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label5, new Insets(0.0, 0.0, 0.0, 50.0));
//
//        label6.setText("Appending");
//        label6.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label6, new Insets(0.0));
//
//        label7.setPrefHeight(18.0);
//        label7.setPrefWidth(58.0);
//        label7.setText("Approved");
//        label7.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label7, new Insets(0.0));
//
//        label8.setText("Denied");
//        label8.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label8, new Insets(0.0));
//
//        label9.setText(" Delete");
//        label9.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label9, new Insets(0.0));
//        hBox0.setPadding(new Insets(0.0, 20.0, 0.0, 20.0));
//
//        scrollPane.setLayoutX(14.0);
//        scrollPane.setLayoutY(232.0);
//        scrollPane.setPrefHeight(320.0);
//        scrollPane.setPrefWidth(746.0);
//        scrollPane.getStylesheets().add("/sample/style.css");
//
//
//        //items start
//        //items end
//        pnItems.setMaxHeight(Region.USE_PREF_SIZE);
//        pnItems.setMaxWidth(Region.USE_PREF_SIZE);
//        pnItems.setMinHeight(Region.USE_PREF_SIZE);
//        pnItems.setMinWidth(Region.USE_PREF_SIZE);
//        pnItems.setPrefHeight(326.0);
//        pnItems.setPrefWidth(782.0);
//        pnItems.setSpacing(5.0);
//        pnItems.setStyle("-fx-background-color: #262626;");
//        pnItems.setPadding(new Insets(5.0));
//        HBox[] items = new HBox[10];
//        Label[] label10 = new Label[10];
//        Label[] label11 = new Label[10];
//        Label[] label12 = new Label[10];
//        Label[] label13 = new Label[10];
//        Button[] button10 = new Button[10];
//        DropShadow[] dropShadow10 = new DropShadow[10];
//        for (int i = 0; i < requestcounter; i++) {
//            final int j = i;
//            // items[i] = items[i];
//            items[i]=new HBox();
//            //give the items some effect
//            //hbox start
//            label10[i] = new Label();
//            label11[i] = new Label();
//            label12[i] = new Label();
//            label13[i] = new Label();
//            button10[i] = new Button();
//            dropShadow10[i] = new DropShadow();
//            items[i].setAlignment(Pos.CENTER_LEFT);
//            items[i].setMaxHeight(Region.USE_PREF_SIZE);
//            items[i].setMaxWidth(Region.USE_PREF_SIZE);
//            items[i].setMinHeight(Region.USE_PREF_SIZE);
//            items[i].setMinWidth(Region.USE_PREF_SIZE);
//            items[i].setPrefHeight(53.0);
//            items[i].setPrefWidth(719.0);
//            items[i].setSpacing(90.0);
//            items[i].setStyle("-fx-background-color: black; -fx-background-radius: 5; -fx-background-insets: 0;");
//            //ye tad hasab start
//            label10[i].setPrefHeight(18.0);
//            label10[i].setPrefWidth(13.0);
//            label10[i].setAlignment(Pos.CENTER);
//            label10[i].setText(data[i][0]);
//            label10[i].setTextFill(Color.valueOf("#b7c3d7"));
//
//            label11[i].setMinHeight(Region.USE_PREF_SIZE);
//            label11[i].setMinWidth(Region.USE_PREF_SIZE);
//            label11[i].setAlignment(Pos.CENTER);
//            label11[i].setText(((data[i][1].equals("0")) ? "No" : "Yes"));
//            label11[i].setTextFill(Color.valueOf("#b7c3d7"));
//            items[i].setMargin(label11[i], new Insets(0.0, 0.0, 0.0, 100.0));
//
//            label12[i].setText(((data[i][2].equals("0")) ? "No" : "Yes"));
//            label12[i].setTextFill(Color.valueOf("#b7c3d7"));
//            label12[i].setAlignment(Pos.CENTER);
//            items[i].setMargin(label12[i], new Insets(0.0, 0.0, 0.0, 50.0));
//
//            label13[i].setText(((data[i][3].equals("0")) ? "No" : "Yes"));
//            label13[i].setAlignment(Pos.CENTER);
//            label13[i].setTextFill(Color.valueOf("#b7c3d7"));
//            items[i].setMargin(label13[i], new Insets(0.0, 0.0, 0.0, 40.0));
//
//            button10[i].setMnemonicParsing(false);
//            button10[i].setAlignment(Pos.CENTER);
//            button10[i].setMinHeight(Region.USE_COMPUTED_SIZE);
//            button10[i].setMinWidth(Region.USE_COMPUTED_SIZE);
//            button10[i].setMaxHeight(Region.USE_COMPUTED_SIZE);
//            button10[i].setMaxWidth(Region.USE_COMPUTED_SIZE);
//            button10[i].setPrefHeight(27.0);
//            button10[i].setPrefWidth(90.0);
//            button10[i].setStyle("-fx-border-color: transparent; -fx-border-radius: 20; -fx-background-color: #800000;-fx-text-fill: white;");
//            button10[i].getStylesheets().add("/sample/style.css");
//            button10[i].setText("Delete");
//            items[i].setMargin(button10[i], new Insets(0.0));
//
//            dropShadow10[i].setBlurType(BlurType.GAUSSIAN);
//            dropShadow10[i].setHeight(5.0);
//            dropShadow10[i].setRadius(2.0);
//            dropShadow10[i].setWidth(5.0);
//            button10[i].setEffect(dropShadow10[i]);
//            button10[i].setPadding(new Insets(0.0, 0.0, 0.0, 10.0));
//            //ye tad hasab end
//            items[i].getChildren().add(label10[i]);
//            items[i].getChildren().add(label11[i]);
//            items[i].getChildren().add(label12[i]);
//            items[i].getChildren().add(label13[i]);
//            items[i].getChildren().add(button10[i]);
//            //hbox end
//            //items[i].getChildren().addAll(items[i].getChildren());
//            items[i].setOnMouseEntered(event -> {
//                items[j].setStyle("-fx-background-color : #bf7600");
//            });
//            items[i].setOnMouseExited(event -> {
//                items[j].setStyle("-fx-background-color : #02030A");
//            });
//            pnItems.getChildren().add(items[i]);
//            // pnItems.getChildren().clear();
//            //System.out.println(i);
//        }
//        scrollPane.setContent(pnItems);
//        imageView5.setFitHeight(17.0);
//        imageView5.setFitWidth(350.0);
//        imageView5.setLayoutX(749.0);
//        imageView5.setLayoutY(53.0);
//        imageView5.setPickOnBounds(true);
//        imageView5.setPreserveRatio(true);
//        imageView5.setImage(new Image(dashboard.class.getResource("../images/icons8_Search_52px.png").toExternalForm()));
//
//        dropShadow.setColor(Color.valueOf("#bf7600"));
//        vBox.setEffect(dropShadow);
//
//        vBox.getChildren().add(imageView);
//        vBox.getChildren().add(label);
//        vBox.getChildren().add(btnOverview);
//        vBox.getChildren().add(btnOrders);
//        vBox.getChildren().add(btnCustomers);
//        vBox.getChildren().add(btnSettings);
//        vBox.getChildren().add(btnSignout);
//        anchorpane.getChildren().add(vBox);
//        stackPane.getChildren().add(pnlCustomer);
//        stackPane.getChildren().add(pnlOrders);
//        stackPane.getChildren().add(pnlMenus);
//        pnlOverview.getChildren().add(textField);
//        pnlOverview.getChildren().add(label0);
//        vBox0.getChildren().add(label1);
//        vBox0.getChildren().add(label2);
//        hBox.getChildren().add(vBox0);
//        vBox1.getChildren().add(label3);
//        vBox1.getChildren().add(label4);
//        hBox.getChildren().add(vBox1);
//        hBox.getChildren().add(vBox2);
//        hBox.getChildren().add(vBox3);
//        pnlOverview.getChildren().add(hBox);
//        hBox0.getChildren().add(label5);
//        hBox0.getChildren().add(label6);
//        hBox0.getChildren().add(label7);
//        hBox0.getChildren().add(label8);
//        hBox0.getChildren().add(label9);
//        pnlOverview.getChildren().add(hBox0);
//        pnlOverview.getChildren().add(scrollPane);
//        pnlOverview.getChildren().add(imageView5);
//        stackPane.getChildren().add(pnlOverview);
//        anchorpane.getChildren().add(stackPane);
//        Scene scene1= new Scene(anchorpane, 400, 400);
//        dashboard.setScene(scene1);
//        dashboard.setTitle("Dashboard");
//        dashboard.show();
//        dashboard.setOnCloseRequest(event ->{
//            event.consume();
//            alertbox close = new alertbox();
//            close.closeconfirmlogin();
//        } );
//    }
//    public static Scene stolenitemsview(){
//        System.out.println("stolenitemview");
//        AnchorPane  anchorpane = new AnchorPane();
//        VBox  vBox = new VBox();
//        ImageView  imageView = new ImageView();
//        Label  label = new Label();
//        Button btnOverview = new Button();
//        ImageView  imageView0 = new ImageView();
//        Button  btnOrders = new Button();
//        ImageView imageView1 = new ImageView();
//        Button  btnCustomers = new Button();
//        ImageView imageView2 = new ImageView();
//        Button btnSettings = new Button();
//        ImageView imageView3 = new ImageView();
//        Button btnSignout = new Button();
//        ImageView imageView4 = new ImageView();
//        StackPane stackPane = new StackPane();
//        Pane pnlCustomer = new Pane();
//        Pane pnlOrders = new Pane();
//        Pane pnlMenus = new Pane();
//        Pane pnlOverview = new Pane();
//        TextField textField = new TextField();
//        Label label0 = new Label();
//        HBox hBox = new HBox();
//        VBox vBox0 = new VBox();
//        Label label1 = new Label();
//        Label label2 = new Label();
//        VBox vBox1 = new VBox();
//        Label label3 = new Label();
//        Label label4 = new Label();
//        VBox vBox2 = new VBox();
//        VBox vBox3 = new VBox();
//        HBox hBox0 = new HBox();
//        Label label5 = new Label();
//        Label label6 = new Label();
//        Label label7 = new Label();
//        Label label8 = new Label();
//        Label label9 = new Label();
//        ScrollPane scrollPane = new ScrollPane();
//        VBox pnItems = new VBox();
//        ImageView imageView5 = new ImageView();
//        DropShadow dropShadow = new DropShadow();
//        Controller controller = new Controller();
//        ScrollPane scroll1 = new ScrollPane();
//
//        anchorpane.setMaxHeight(Region.USE_COMPUTED_SIZE);
//        anchorpane.setMaxWidth(Region.USE_COMPUTED_SIZE);
//        anchorpane.setMinHeight(Region.USE_COMPUTED_SIZE);
//        anchorpane.setMinWidth(Region.USE_COMPUTED_SIZE);
//        anchorpane.setPrefHeight(576.0);
//        anchorpane.setPrefWidth(1050.0);
//        anchorpane.setStyle("-fx-background-color: #02030A;");
////        dashboard.setOnCloseRequest(event ->{
////            event.consume();
////            alertbox close = new alertbox();
////            close.closeconfirmlogin();
////        } );
//
//        AnchorPane.setBottomAnchor(vBox, 0.0);
//        AnchorPane.setTopAnchor(vBox, 0.0);
//        vBox.setAlignment(Pos.CENTER);
//        vBox.setPrefHeight(1000.0);
//        vBox.setPrefWidth(256.0);
//        vBox.setStyle("-fx-background-color: black;");
//
//        imageView.setFitHeight(73.0);
//        imageView.setFitWidth(67.0);
//        imageView.setPickOnBounds(true);
//        imageView.setPreserveRatio(true);
//        VBox.setMargin(imageView, new Insets(50.0, 0.0, 10.0, 0.0));
//        imageView.setImage(new Image(dashboard.class.getResource("../images/icon123.png").toExternalForm()));
//
//        label.setText("label");
//        label.setTextFill(Color.valueOf("#bf7600"));
//        VBox.setMargin(label, new Insets(0.0, 0.0, 20.0, 0.0));
//
//        btnOverview.setAlignment(Pos.BASELINE_LEFT);
//        btnOverview.setGraphicTextGap(22.0);
//        btnOverview.setMnemonicParsing(false);
//        btnOverview.setOnAction(event -> {
//
//        });
//        btnOverview.setPrefHeight(42.0);
//        btnOverview.setPrefWidth(259.0);
//        btnOverview.setStyle("-fx-background-color: black;");
//        btnOverview.getStylesheets().add("/sample/style.css");
//        btnOverview.setText("Overview");
//        btnOverview.setTextFill(Color.valueOf("#bf7600"));
//
//        imageView0.setFitHeight(23.0);
//        imageView0.setFitWidth(27.0);
//        imageView0.setPickOnBounds(true);
//        imageView0.setPreserveRatio(true);
//        imageView0.setImage(new Image(dashboard.class.getResource("../images/icons8_Home_32px.png").toExternalForm()));
//        btnOverview.setGraphic(imageView0);
//        btnOverview.setOpaqueInsets(new Insets(0.0));
//        VBox.setMargin(btnOverview, new Insets(0.0));
//        btnOverview.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        btnOrders.setAlignment(Pos.BASELINE_LEFT);
//        btnOrders.setGraphicTextGap(22.0);
//        btnOrders.setMnemonicParsing(false);
//        btnOrders.setOnAction(event -> {
//
//        });
//        btnOrders.setPrefHeight(42.0);
//        btnOrders.setPrefWidth(259.0);
//        btnOrders.setStyle("-fx-background-color: black;");
//        btnOrders.getStylesheets().add("/sample/style.css");
//        btnOrders.setText("Requests");
//
//        imageView1.setFitHeight(23.0);
//        imageView1.setFitWidth(27.0);
//        imageView1.setPickOnBounds(true);
//        imageView1.setPreserveRatio(true);
//        imageView1.setImage(new Image(dashboard.class.getResource("../images/icons8_Open_Envelope_32px.png").toExternalForm()));
//        btnOrders.setGraphic(imageView1);
//        btnOrders.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        btnCustomers.setAlignment(Pos.BASELINE_LEFT);
//        btnCustomers.setGraphicTextGap(22.0);
//        btnCustomers.setMnemonicParsing(false);
//        btnCustomers.setOnAction(event -> {
//
//        });
//        btnCustomers.setPrefHeight(42.0);
//        btnCustomers.setPrefWidth(259.0);
//        btnCustomers.setStyle("-fx-background-color: black;");
//        btnCustomers.getStylesheets().add("/sample/style.css");
//        btnCustomers.setText("Stolen Items");
//        btnCustomers.setOnAction(event -> {
//            dashboard show = new dashboard();
//            show.stolenitemsview();
//        });
//
//
//        imageView2.setFitHeight(23.0);
//        imageView2.setFitWidth(27.0);
//        imageView2.setPickOnBounds(true);
//        imageView2.setPreserveRatio(true);
//        imageView2.setImage(new Image(dashboard.class.getResource("../images/icons8_Search_52px.png").toExternalForm()));
//        btnCustomers.setGraphic(imageView2);
//        btnCustomers.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        btnSettings.setAlignment(Pos.BASELINE_LEFT);
//        btnSettings.setGraphicTextGap(22.0);
//        btnSettings.setMnemonicParsing(false);
//        btnSettings.setPrefHeight(42.0);
//        btnSettings.setPrefWidth(259.0);
//        btnSettings.setStyle("-fx-background-color: black;");
//        btnSettings.getStylesheets().add("/sample/style.css");
//        btnSettings.setText("Settings");
//
//        imageView3.setFitHeight(23.0);
//        imageView3.setFitWidth(27.0);
//        imageView3.setPickOnBounds(true);
//        imageView3.setPreserveRatio(true);
//        imageView3.setImage(new Image(dashboard.class.getResource("../images/icons8_Slider__32px.png").toExternalForm()));
//        btnSettings.setGraphic(imageView3);
//        btnSettings.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        btnSignout.setAlignment(Pos.BASELINE_LEFT);
//        btnSignout.setGraphicTextGap(22.0);
//        btnSignout.setMnemonicParsing(false);
//        btnSignout.setPrefHeight(42.0);
//        btnSignout.setPrefWidth(259.0);
//        btnSignout.setStyle("-fx-background-color: black;");
//        btnSignout.getStylesheets().add("/sample/style.css");
//        btnSignout.setText("Sign Out");
//        btnSignout.setOnAction(event -> {
//            alertbox close = new alertbox();
//            close.signout();
//
//        });
//
//        imageView4.setFitHeight(23.0);
//        imageView4.setFitWidth(27.0);
//        imageView4.setPickOnBounds(true);
//        imageView4.setPreserveRatio(true);
//        imageView4.setImage(new Image(dashboard.class.getResource("../images/icons8_Sign_Out_32px.png").toExternalForm()));
//        btnSignout.setGraphic(imageView4);
//        btnSignout.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
//
//        stackPane.setLayoutX(258.0);
//        stackPane.setMaxHeight(Region.USE_COMPUTED_SIZE);
//        stackPane.setMaxWidth(Region.USE_COMPUTED_SIZE);
//        stackPane.setMinHeight(Region.USE_COMPUTED_SIZE);
//        stackPane.setMinWidth(Region.USE_COMPUTED_SIZE);
//        stackPane.setPrefHeight(576.0);
//        stackPane.setPrefWidth(793.0);
//        stackPane.setStyle("-fx-background-color: #02030A;");
//
//        pnlCustomer.setPrefHeight(200.0);
//        pnlCustomer.setPrefWidth(200.0);
//
//        pnlOrders.setPrefHeight(200.0);
//        pnlOrders.setPrefWidth(200.0);
//
//        pnlMenus.setPrefHeight(200.0);
//        pnlMenus.setPrefWidth(200.0);
//
//        pnlOverview.setMaxHeight(Region.USE_COMPUTED_SIZE);
//        pnlOverview.setMaxWidth(Region.USE_COMPUTED_SIZE);
//        pnlOverview.setMinHeight(Region.USE_COMPUTED_SIZE);
//        pnlOverview.setMinWidth(Region.USE_COMPUTED_SIZE);
//        pnlOverview.setPrefHeight(576.0);
//        pnlOverview.setPrefWidth(850.0);
//        pnlOverview.setStyle("-fx-background-color: #262626;");
//
//        textField.setLayoutX(590.0);
//        textField.setLayoutY(47.0);
//        textField.setPrefHeight(27.0);
//        textField.setPrefWidth(183.0);
//        textField.setPromptText("search");
//        textField.setStyle("-fx-background-color: #262626; -fx-border-color: #bf7600; -fx-border-radius: 2em; -fx-text-inner-color: white;");
//
//        label0.setLayoutX(57.0);
//        label0.setLayoutY(25.0);
//        label0.setText("Stolen Items");
//        label0.setTextFill(Color.valueOf("white"));
//        label0.setFont(new Font(24.0));
//
//        hBox.setAlignment(Pos.CENTER_LEFT);
//        hBox.setLayoutX(45.0);
//        hBox.setLayoutY(72.0);
//        hBox.setPrefHeight(92.0);
//        hBox.setPrefWidth(661.0);
//        hBox.setSpacing(50.0);
//
//        vBox0.setAlignment(Pos.CENTER);
//        vBox0.setPrefHeight(200.0);
//        vBox0.setPrefWidth(100.0);
//
//        label1.setText(String.valueOf(counterstolen));
//        label1.setTextFill(Color.valueOf("#008000"));
//        label1.setFont(new Font("System Bold", 26.0));
//
//        label2.setText("Total Stolen Items");
//        label2.setTextFill(Color.valueOf("white"));
//
//        vBox1.setAlignment(Pos.CENTER);
//        vBox1.setPrefHeight(200.0);
//        vBox1.setPrefWidth(100.0);
//
//
//        vBox2.setAlignment(Pos.CENTER);
//        vBox2.setPrefHeight(200.0);
//        vBox2.setPrefWidth(100.0);
//
//        vBox3.setAlignment(Pos.CENTER);
//        vBox3.setPrefHeight(200.0);
//        vBox3.setPrefWidth(100.0);
//
//        hBox0.setAlignment(Pos.CENTER_LEFT);
//        hBox0.setLayoutX(41.0);
//        hBox0.setLayoutY(179.0);
//        hBox0.setPrefHeight(42.0);
//        hBox0.setPrefWidth(712.0);
//        hBox0.setSpacing(75.0);
//        hBox0.setStyle("-fx-background-color: #262626;");
//
//        label5.setPrefHeight(18.0);
//        label5.setPrefWidth(61.0);
//        label5.setText("Item Name");
//        label5.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label5, new Insets(0.0, 0.0, 0.0, 50.0));
//
//        label6.setText("Status");
//        label6.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label6, new Insets(0.0));
//
//        label7.setPrefHeight(18.0);
//        label7.setPrefWidth(58.0);
//        label7.setText("Reported By");
//        label7.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label7, new Insets(0.0));
//
//        label8.setText("Reporter Block No.");
//        label8.setTextFill(Color.valueOf("#bf7600"));
//        HBox.setMargin(label8, new Insets(0.0));
//
//        scrollPane.setLayoutX(14.0);
//        scrollPane.setLayoutY(232.0);
//        scrollPane.setPrefHeight(320.0);
//        scrollPane.setPrefWidth(746.0);
//        scrollPane.getStylesheets().add("/sample/style.css");
//        scroll1.setLayoutX(14.0);
//        scroll1.setLayoutY(553.0);
//        scroll1.setPrefHeight(320);
//        scroll1.setPrefWidth(746);
//        scroll1.getStylesheets().add("/sample/style.css");
//        //items start
//        //items end
//        pnItems.setMaxHeight(Region.USE_PREF_SIZE);
//        pnItems.setMaxWidth(Region.USE_PREF_SIZE);
//        pnItems.setMinHeight(Region.USE_PREF_SIZE);
//        pnItems.setMinWidth(Region.USE_PREF_SIZE);
//        pnItems.setPrefHeight(326.0);
//        pnItems.setPrefWidth(782.0);
//        pnItems.setSpacing(5.0);
//        pnItems.setStyle("-fx-background-color: #262626;");
//        pnItems.setPadding(new Insets(5.0));
//        HBox[] items = new HBox[10];
//        Label[] label10 = new Label[10];
//        Label[] label11 = new Label[10];
//        Label[] label12 = new Label[10];
//        Label[] label13 = new Label[10];
//        Button[] button10 = new Button[10];
//        DropShadow[] dropShadow10 = new DropShadow[10];
//        for (int i = 0; i < counterstolen; i++) {
//            final int j = i;
//            // items[i] = items[i];
//            items[i]=new HBox();
//            //give the items some effect
//            //hbox start
//            label10[i] = new Label();
//            label11[i] = new Label();
//            label12[i] = new Label();
//            label13[i] = new Label();
//            button10[i] = new Button();
//            dropShadow10[i] = new DropShadow();
//            items[i].setAlignment(Pos.CENTER_LEFT);
//            items[i].setMaxHeight(Region.USE_PREF_SIZE);
//            items[i].setMaxWidth(Region.USE_PREF_SIZE);
//            items[i].setMinHeight(Region.USE_PREF_SIZE);
//            items[i].setMinWidth(Region.USE_PREF_SIZE);
//            items[i].setPrefHeight(53.0);
//            items[i].setPrefWidth(719.0);
//            items[i].setSpacing(90.0);
//            items[i].setStyle("-fx-background-color: black; -fx-background-radius: 5; -fx-background-insets: 0;");
//            //ye tad hasab start
//            label10[i].setPrefHeight(18.0);
//            label10[i].setPrefWidth(13.0);
//            label10[i].setAlignment(Pos.CENTER);
//            label10[i].setText(stolen_items[i][0]);
//            label10[i].setTextFill(Color.valueOf("#b7c3d7"));
//
//            label11[i].setMinHeight(Region.USE_PREF_SIZE);
//            label11[i].setMinWidth(Region.USE_PREF_SIZE);
//            label11[i].setAlignment(Pos.CENTER);
//            label11[i].setText(((stolen_items[i][1].equals("0")) ? "No" : "Yes"));
//            label11[i].setTextFill(Color.valueOf("#b7c3d7"));
//            items[i].setMargin(label11[i], new Insets(0.0, 0.0, 0.0, 100.0));
//
//            label12[i].setText(stolen_items[i][2]);
//            label12[i].setTextFill(Color.valueOf("#b7c3d7"));
//            label12[i].setAlignment(Pos.CENTER);
//            items[i].setMargin(label12[i], new Insets(0.0, 0.0, 0.0, 50.0));
//
//            label13[i].setText(stolen_items[i][3]);
//            label13[i].setAlignment(Pos.CENTER);
//            label13[i].setTextFill(Color.valueOf("#b7c3d7"));
//            items[i].setMargin(label13[i], new Insets(0.0, 0.0, 0.0, 40.0));
//
////            dropShadow10[i].setBlurType(BlurType.GAUSSIAN);
////            dropShadow10[i].setHeight(5.0);
////            dropShadow10[i].setRadius(2.0);
////            dropShadow10[i].setWidth(5.0);
////            button10[i].setEffect(dropShadow10[i]);
////            button10[i].setPadding(new Insets(0.0, 0.0, 0.0, 10.0));
//            //ye tad hasab end
//            items[i].getChildren().add(label10[i]);
//            items[i].getChildren().add(label11[i]);
//            items[i].getChildren().add(label12[i]);
//            items[i].getChildren().add(label13[i]);
//            //items[i].getChildren().add(button10[i]);
//            //hbox end
//            //items[i].getChildren().addAll(items[i].getChildren());
//            items[i].setOnMouseEntered(event -> {
//                items[j].setStyle("-fx-background-color : #bf7600");
//            });
//            items[i].setOnMouseExited(event -> {
//                items[j].setStyle("-fx-background-color : #02030A");
//            });
//            pnItems.getChildren().add(items[i]);
//            // pnItems.getChildren().clear();
//            //System.out.println(i);
//        }
//        scrollPane.setContent(pnItems);
//        imageView5.setFitHeight(17.0);
//        imageView5.setFitWidth(350.0);
//        imageView5.setLayoutX(749.0);
//        imageView5.setLayoutY(53.0);
//        imageView5.setPickOnBounds(true);
//        imageView5.setPreserveRatio(true);
//        imageView5.setImage(new Image(dashboard.class.getResource("../images/icons8_Search_52px.png").toExternalForm()));
//
//        dropShadow.setColor(Color.valueOf("#bf7600"));
//        vBox.setEffect(dropShadow);
//
//        vBox.getChildren().add(imageView);
//        vBox.getChildren().add(label);
//        vBox.getChildren().add(btnOverview);
//        vBox.getChildren().add(btnOrders);
//        vBox.getChildren().add(btnCustomers);
//        vBox.getChildren().add(btnSettings);
//        vBox.getChildren().add(btnSignout);
//        anchorpane.getChildren().add(vBox);
//        stackPane.getChildren().add(pnlCustomer);
//        stackPane.getChildren().add(pnlOrders);
//        stackPane.getChildren().add(pnlMenus);
//        pnlOverview.getChildren().add(textField);
//        pnlOverview.getChildren().add(label0);
//        vBox0.getChildren().add(label1);
//        vBox0.getChildren().add(label2);
//        hBox.getChildren().add(vBox0);
//        vBox1.getChildren().add(label3);
//        vBox1.getChildren().add(label4);
//        hBox.getChildren().add(vBox1);
//        hBox.getChildren().add(vBox2);
//        hBox.getChildren().add(vBox3);
//        pnlOverview.getChildren().add(hBox);
//        hBox0.getChildren().add(label5);
//        hBox0.getChildren().add(label6);
//        hBox0.getChildren().add(label7);
//        hBox0.getChildren().add(label8);
//        hBox0.getChildren().add(label9);
//        pnlOverview.getChildren().add(hBox0);
//        pnlOverview.getChildren().add(scrollPane);
//        pnlOverview.getChildren().add(scroll1);
//        pnlOverview.getChildren().add(imageView5);
//        stackPane.getChildren().add(pnlOverview);
//        anchorpane.getChildren().add(stackPane);
//        scene2= new Scene(anchorpane, 400, 400);
////        dashboard.setScene(scene2);
////        dashboard.setTitle("Dashboard");
////        dashboard.show();
////        System.out.println("it works again.");
//        return scene2;
//    }

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
       // vBox.getChildren().add(icon);
        vBox.getChildren().add(button0);
        vBox.getChildren().add(button1);
        vBox.getChildren().add(button2);
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

