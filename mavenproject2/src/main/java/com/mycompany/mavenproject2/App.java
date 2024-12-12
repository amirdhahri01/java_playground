package com.mycompany.mavenproject2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(20, 20, 20, 20));
        Scene scene = new Scene(grid , 400 , 500);
        Text text = new Text("Login");
        text.setFont(Font.font("Tahoma"));
        Label userName = new Label("User Name");
        TextField userNameInputField = new TextField("Your user name");
        Label password = new Label("Password");
        PasswordField passwordInputField = new PasswordField();
        grid.add(userName, 0, 0);
        grid.add(userNameInputField, 1,0);
        grid.add(password ,0, 1);
        grid.add(passwordInputField,1,1);
        grid.setGridLinesVisible(true);
        Button btn = new Button("Submit");
        HBox hbtns = new HBox(20);
        hbtns.setAlignment(Pos.BOTTOM_RIGHT );
        hbtns.getChildren().add(btn);
        grid.add(hbtns, 0, 2);
        Text actionText = new Text();
        grid.add(actionText, 1, 2);
        btn.setOnAction((event) -> {
            actionText.setFill(Color.BLUE);
            actionText.setText("Submited");
        });
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }

}