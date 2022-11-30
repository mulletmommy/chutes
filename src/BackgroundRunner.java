import java.awt.*;
import javax.swing.*;

public class BackgroundRunner extends JFrame {
    private static final int WIDTH = 2560;
    private static final int HEIGHT = 1440;

    public BackgroundRunner() {
        super("MouseBob Runner");

        setSize(WIDTH, HEIGHT);


        getContentPane().add(new background());


        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        BackgroundRunner run = new BackgroundRunner();
    }
}

