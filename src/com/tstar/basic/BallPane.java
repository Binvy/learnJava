package com.tstar.basic;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/4 0004
 */
public class BallPane extends Pane {
    public final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;
    private Circle circle = new Circle(x, y, radius);
    private Timeline animation;

    public BallPane() {
        circle.setFill(Color.YELLOW);
        getChildren().add(circle);

        animation = new Timeline(new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                moveBall();
            }
        }));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }

    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 0.1);
    }

    public void decreaseSpeed() {
        animation.setRate(animation.getRate() > 0.1 ? animation.getRate() - 0.1 : 0);
    }

    public DoubleProperty rateProperty() {
        return animation.rateProperty();
    }

    private void moveBall() {
        // Check boundaries
        if (x < radius || x > getWidth() - radius) {
            dx *= -1;
        }
        if (y < radius || y > getHeight() - radius) {
            dy *= -1;
        }

        // Adjust ball position
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }
}
