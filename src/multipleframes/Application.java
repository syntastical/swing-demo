package multipleframes;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        var frame1 = new JFrame();
        frame1.setSize(300, 300);
        frame1.setVisible(true);

        var frame2 = new JFrame();
        frame2.setSize(300, 300);
        frame2.setVisible(true);
    }
}    