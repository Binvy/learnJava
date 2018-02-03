package com.tstar.basic;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/4 0004
 */
public class BounceBallControl extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final BallPane ballPane = new BallPane();

        // Pause and resume animation
        ballPane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                ballPane.pause();
            }
        });

        ballPane.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                ballPane.play();
            }
        });

        ballPane.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.UP) {
                    ballPane.increaseSpeed();
                } else if (keyEvent.getCode() == KeyCode.DOWN) {
                    ballPane.decreaseSpeed();
                }
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(ballPane, 250, 150);
        scene.setFill(Color.GREEN);
        stage.setTitle("BounceBallControl");
        stage.setScene(scene);
        stage.show();

        // Must request focus after the stage is displayed
        ballPane.requestFocus();
    }
}
