package com.tstar.basic;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/4 0004
 */
public class ClockAnimation extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final ClockPane clock = new ClockPane();
        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                clock.setCurrrentTime();
            }
        };

        // Create an animation for a running clock
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        // Create a  scene and place it int the stage
        Scene scene = new Scene(clock, 500, 500);
        stage.setTitle("ClockAnimation");
        stage.setScene(scene);
        stage.show();
    }
}
