package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
public class Fourth {
    public static void main(String[] args) {
        //    In this tutorial we will learn about the JPanel class which is used to add containers in an frame
//    Firstly prepare a frame
        JFrame frame  = new JFrame();
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setVisible(true);

//        now its turn to use the JPanel class and add some panel to our frame
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel footerPanel = new JPanel();

        panel1.setLayout(new GridLayout(1,4,10,10));
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.CYAN);
        footerPanel.setBackground(Color.GREEN);

        panel1.setBounds(0,0,200,200);
        panel2.setBounds(200,0,200,200);
        footerPanel.setBounds(0,200,400,100);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(footerPanel);

//        let add some label in the panel
        JLabel label1 = new JLabel();
        label1.setText("Hi im red");
//        label1.setVerticalAlignment(JLabel.CENTER);
        JLabel label2 = new JLabel();
        label2.setText("Hi im cyan");
//        label2.setVerticalAlignment(JLabel.CENTER);
        JLabel label3 = new JLabel();
        label3.setText("Hi im green");
//        label3.setVerticalAlignment(JLabel.CENTER);
        panel1.add(label1);
        panel2.add(label2);
        footerPanel.add(label3);
    }
    }
