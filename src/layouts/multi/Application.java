package layouts.multi;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        var b1 = new JButton("1");
        var b2 = new JButton("2");
        var b3 = new JButton("3");
        var b4 = new JButton("4");

        var leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.add(b1);
        leftPanel.add(b2);


        var rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.add(b3);
        rightPanel.add(b4);

        var frame = new JFrame();
        frame.add(leftPanel);
        frame.add(rightPanel);

        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(1, 2));
        frame.setVisible(true);
    }
}    