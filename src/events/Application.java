package events;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Application {
    public static void main(String[] args) {
        var button1 = new JButton("button1");
        button1.setBounds(1, 1, 100, 40);
        button1.addActionListener(action -> {
            System.out.println("Modifier: " + action.getModifiers());
        });

        var button2 = new JButton("button2");
        button2.setBounds(120, 1, 100, 40);
        button2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("focus gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("focus lost");
            }
        });

        var button3 = new JButton("button3");
        button3.setBounds(240, 1, 100, 40);
        button3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(e);
            }
        });

        var frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
    }
}
