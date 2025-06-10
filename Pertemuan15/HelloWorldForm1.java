package Pertemuan15;

import javax.swing.*;

public class HelloWorldForm1 extends JFrame {
    private JLabel label; //2

    //3
    public HelloWorldForm1() {
        label = new JLabel("Hello World");
        label.setText("Hello World!");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}
