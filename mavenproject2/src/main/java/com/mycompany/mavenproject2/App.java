package com.mycompany.mavenproject2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Circle circle1 = new Circle(50);
        circle1.setFill(Color.PINK);
        circle1.setStroke(Color.BLUE);
        Button btn = new Button();
        btn.setText("Change Circle Raduis");
        btn.setOnAction((ActionEvent t) -> {
            circle1.setRadius(60);
        });
        root.getChildren().add(circle1);
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}