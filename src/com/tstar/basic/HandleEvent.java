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
 * @Date: 2018/2/3 0003
 */
public class HandleEvent extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Create a pane and set its properties
        HBox pane = new HBox(50);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancle = new Button("Cancle");
        OkHandlerClass okHandle = new OkHandlerClass();
        CancleHandleClass cancleHandle = new CancleHandleClass();
        btOK.setOnAction(okHandle);
        btCancle.setOnAction(cancleHandle);
        pane.getChildren().addAll(btOK, btCancle);

        // Create a scene and place ti in the stage
        Scene scene = new Scene(pane);
        stage.setTitle("HandleEvent");
        stage.setScene(scene);
        stage.show();
    }

    class CancleHandleClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            System.out.println("Cancle button clicked");
        }
    }

    private class OkHandlerClass implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent) {
            System.out.println("OK button clicked");
        }
    }
}
