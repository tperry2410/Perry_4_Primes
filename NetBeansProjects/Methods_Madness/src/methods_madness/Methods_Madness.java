package methods_madness;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;
import static java.lang.Math.random;


public class Methods_Madness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.WHITE);
        primaryStage.setScene(scene);
        Group circles = new Group();
        for (int i = 0; i < 40; i++) {
            Circle circle = new Circle(150, Color.web("gray", 0.2));
            circle.setStrokeType(StrokeType.OUTSIDE);
            circle.setStroke(Color.web("green", 0.16));
            circle.setStrokeWidth(9);
            circles.getChildren().add(circle);
        }
        Rectangle colors = new Rectangle(scene.getWidth(), scene.getHeight(),
                new LinearGradient(2f, 1f, 1f, 2f, true, CycleMethod.NO_CYCLE, new Stop[]{
                    new Stop(0, Color.web("#3f00ff")),
                    new Stop(0.14, Color.web("#fd1c15")),
                    new Stop(0.28, Color.web("#f15d25")),
                    new Stop(0.43, Color.web("#0b5394")),
                    new Stop(0.57, Color.web("#c62104")),
                    new Stop(0.71, Color.web("#ed5fc2")),
                    new Stop(0.85, Color.web("#ef504c")),
                    new Stop(1, Color.web("#000000")),}));
        colors.widthProperty().bind(scene.widthProperty());
        colors.heightProperty().bind(scene.heightProperty());
        Group blendModeGroup =
                new Group(new Group(new Rectangle(scene.getWidth(), scene.getHeight(),
                     Color.GREY), circles), colors);
        colors.setBlendMode(BlendMode.OVERLAY);
        root.getChildren().add(blendModeGroup);      
        circles.setEffect(new BoxBlur(10, 5, 10));
        Timeline timeline = new Timeline();
        for (Node circle : circles.getChildren()) {
            timeline.getKeyFrames().addAll(
                    new KeyFrame(Duration.ZERO, // set start position at 0
                    new KeyValue(circle.translateXProperty(), random() * 800),
                    new KeyValue(circle.translateYProperty(), random() * 800)),
                    new KeyFrame(new Duration(40000), // set end position at 40s
                    new KeyValue(circle.translateXProperty(), random() * 800),
                    new KeyValue(circle.translateYProperty(), random() * 800)));
        }
        // play 40s of animation
        timeline.play();
        primaryStage.show();
    }
}
