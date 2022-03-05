package layouts.border;

import java.awt.*;
import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        var b1 = new JButton("NORTH");
        var b2 = new JButton("SOUTH");
        var b3 = new JButton("EAST");
        var b4 = new JButton("WEST");
        var b5 = new JButton("CENTER");

        var frame = new JFrame();
        frame.add(b5, BorderLayout.CENTER);
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}    