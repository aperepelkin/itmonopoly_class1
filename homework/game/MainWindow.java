package test.test;

import javax.swing.*;

public class MainWindow extends JFrame {
    private static MainWindow wnd = null;
    private static final int X_SIZE = 690;
    private static final int Y_SIZE = 720;


    private MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");
        setSize(X_SIZE, Y_SIZE);
        setLocation(800,300);
        setResizable(false);
        add(new GameField());
        setVisible(true);
    }

    public static MainWindow createWindow() {
        if (wnd == null) {
            wnd = new MainWindow();
        }
        return wnd;
    }
}
