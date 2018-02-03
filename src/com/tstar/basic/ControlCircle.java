package com.tstar.basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/4 0004
 */
public class ControlCircle extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage stage) throws Exception {
        // Hold two buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().addAll(btEnlarge, btShrink);

        // Create and register the handler
        btEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(new ShrinkHandler());

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 150);
        stage.setTitle("ControlCircle");
        stage.setScene(scene);
        stage.show();

    }

    class ShrinkHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            circlePane.shrink();
        }
    }
    class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            circlePane.enlarge();
        }

    }
}
class CirclePane extends StackPane {
    private Circle circle = new Circle(50);

    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.WHITE);
    }

    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink() {
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
    }

}
