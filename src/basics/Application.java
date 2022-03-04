package basics;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        var submit = new JButton("submit");
        submit.setBounds(1,1, 100, 40);

        var frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(submit);
    }
}
