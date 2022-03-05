package layouts.grid;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        var b1 = new JButton("1");
        var b2 = new JButton("2");
        var b3 = new JButton("3");
        var b4 = new JButton("4");
        var b5 = new JButton("5");
        var b6 = new JButton("6");
        var b7 = new JButton("7");
        var b8 = new JButton("8");
        var b9 = new JButton("9");
        var b10 = new JButton("10");

        var frame = new JFrame();
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);

        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(3, 3));
        frame.setVisible(true);
    }
}    