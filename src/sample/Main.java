package sample;

import javafx.application.Application;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();
       //Rectangle rect1 = new Rectangle(100, 100);
       //rect1.setFill(Color.BLUE); // top left
       //Rectangle rect2 = new Rectangle(100, 100);
       //rect2.setFill(Color.RED); // top right
       //Rectangle rect3 = new Rectangle(100, 100);
       //rect3.setFill(Color.GREEN); //bottom left
       //Rectangle rect4 = new Rectangle(100, 100);
       //rect4.setFill(Color.ORANGE); //bottom right

       //rect1.addEventHandler<MouseEvent> handler = new EventHandler<MouseEvent>()
       //        @Override
       //                public void handle(MouseEvent event) {

       //    if(event.getEventType()==MouseEvent.MOUSE_ENTERED){
       //        rect2.setFill(rect1.getFill());
       //        rect3.setFill(rect1.getFill());
       //        rect4.setFill(rect1.getFill());

       //    }

       //    else if (event.getEventType()==MouseEvent.MOUSE_EXITED) {
       //        rect2.setFill(Color.RED());
       //        rect3.setFill(Color.GREEN());
       //        rect4.setFill(Color.ORANGE());
       //    }
       //}
       //rect1.addEventFilter(MouseEvent.MOUSE_ENTERED, handler);
       //rect1.addEventFilter(MouseEvent.MOUSE_EXITED, handler);

       //GridPane layout1 = new GridPane();
       //layout1.setAlignment(Pos.CENTER);
       //layout1.setHgap(200);
       //layout1.setVgap(200);
       //layout1.setGridLinesVisible(true);
       //layout1.add(rect1, 0, 0);
       //layout1.add(rect2, 1, 0);
       //layout1.add(rect3, 0, 1);
       //layout1.add(rect4, 1, 3);
       //Scene scene1 = new Scene(layout1, 500, 300);
       //primaryStage.setScene(scene1);
       //primaryStage.setTitle("Four Choices");
       Scene scene1 = EvaniaWindow(primaryStage);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }
    public Scene EvaniaWindow(Stage primaryStage){
        Image monkey = new Image("Monkey.jpg",200,200,true,true);
        ImageView monkeyView = new ImageView(monkey);
        Button button1 = new Button("Monkey",monkeyView);
        String monkeyText = "This is some text about a monkey.";

        Image elephant = new Image("Elephant.jpg",200,200,true,true);
        ImageView elephantView = new ImageView(elephant);
        Button button2 = new Button("Elephant",elephantView);
        String elephantText = "This is some text about a elephant .";

        Image dog = new Image("Dog.jpg",200,200,true,true);
        ImageView dogView = new ImageView(dog);
        Button button3 = new Button("Dog",dogView);
        String dogText = "This is some text about a dog.";

        Label label = new Label("Click on an image");

        VBox vbox = new VBox(button1,button2,button3);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(vbox);
        borderPane.setCenter(label);

        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setTitle("Animal Information");
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
