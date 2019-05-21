package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


import static javafx.application.Application.launch;


public class Colours extends Application {


    public void start(Stage primaryStage) throws Exception {
        Scene scene1 = MyNameJeff(primaryStage);
        Group layoutScene1 = new Group();
        scene1 = new Scene(layoutScene1, 600, 600);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public Scene MyNameJeff(Stage primaryStage) {
        Rectangle rect1 = new Rectangle(100, 100, 100, 100);
        rect1.setFill(Color.BLUE);

        rect1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (rect1.contains(event.getX(), event.getY())) {
                    rect1.setFill(Color.ORANGE);
                }


                BorderPane borderPane = new BorderPane();
                Scene scene = new Scene(borderPane, 500, 500);
                primaryStage.setTitle("My Name Jeff");
            }

            public void main(String[] args) {
                launch(args);
            }
        });

        return null;
    }
}