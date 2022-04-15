package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Eighth {
    public static void main(String[] args) {
//        JLayeredPane -> swing container that provides a 3-d for positioning components


//        Firstly we will create a frame
        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);//mandatory in layered pane
        frame.setVisible(true);

//        create an object of the JLayeredPane class
        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0,0,500,500);
        frame.add(layer);
//     Creating some labels
        JLabel label1 = new JLabel();
        label1.setBackground(Color.GREEN);
        label1.setOpaque(true);
        label1.setBounds(50,50,300,200);
//        another label
        JLabel label2 = new JLabel();
        label2.setBackground(Color.RED);
        label2.setOpaque(true);
        label2.setBounds(100,100,300,200);
//        another label
        JLabel label3 = new JLabel();
        label3.setBackground(Color.BLUE);
        label3.setOpaque(true);
        label3.setBounds(150,150,300,200);


//        add all the label to the layered pane
        layer.add(label1);
        layer.add(label2);
        layer.add(label3);

    }
}
