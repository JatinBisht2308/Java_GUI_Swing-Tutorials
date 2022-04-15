package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;

public class NinethNewWindow {
//    defining the constructor
    JFrame frame = new JFrame();
    JLabel label  = new JLabel("Welcome to New Window");
    NinethNewWindow()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(null);
//        adding label to the frame
        label.setBounds(0,0,300,100);
        label.setFont(new Font(null,Font.BOLD,25));
        frame.add(label);
        frame.setVisible(true);

    }
}
