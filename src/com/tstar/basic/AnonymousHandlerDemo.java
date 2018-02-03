package com.tstar.basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/4 0004
 */
public class AnonymousHandlerDemo extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Hold four buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        Button btSave = new Button("Svae");
        Button btPrint = new Button("Print");

        hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);

        // Create and register the handler
        btNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Process New");
            }
        });

        btOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Process Open");
            }
        });

        btSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Process Save");
            }
        });

        btPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Process Print");
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(hBox, 300, 100);
        stage.setTitle("AnonymousHandlerDemo");
        stage.setScene(scene);
        stage.show();
    }
}
