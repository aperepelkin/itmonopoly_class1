package lesson14.painting.views;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import jp.uphy.javafx.console.ConsoleView;

public class Main {

    public AnchorPane leftPane;
    public AnchorPane rightPane;

    private GraphicsContext gc;
    private Canvas canvas;

    @FXML
    public void initialize() {
        ConsoleView consoleView = new ConsoleView();
        System.setErr(consoleView.getOut());
        System.setOut(consoleView.getOut());
        System.setIn(consoleView.getIn());

        AnchorPane.setBottomAnchor(consoleView, 0D);
        AnchorPane.setTopAnchor(consoleView, 0D);
        AnchorPane.setLeftAnchor(consoleView, 0D);
        AnchorPane.setRightAnchor(consoleView, 0D);

        leftPane.getChildren().addAll(consoleView);

        canvas = new CustomCanvas();
        gc = canvas.getGraphicsContext2D();

        AnchorPane.setBottomAnchor(canvas, 0D);
        AnchorPane.setTopAnchor(canvas, 0D);
        AnchorPane.setLeftAnchor(canvas, 0D);
        AnchorPane.setRightAnchor(canvas, 0D);

        rightPane.getChildren().addAll(canvas);
    }

    public GraphicsContext getGc() {
        return gc;
    }

    public Canvas getCanvas() {
        return canvas;
    }
}