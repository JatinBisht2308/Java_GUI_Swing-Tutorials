package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Seventh {
    public static void main(String[] args) {
//        Grid-Layout -> places components in a grid of cells. Each component takes all the available space within its cell,
//        and each cell is having the same size.


//        Lets make a frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        This will help us to make the grid layout of a frame
        frame.setLayout(new GridLayout(3,3,10,10));
//        Let make a bunch of button

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        btn1.setBounds(0,0,100,100);
        btn2.setBounds(0,0,100,100);
        btn3.setBounds(0,0,100,100);
        btn4.setBounds(0,0,100,100);
        btn5.setBounds(0,0,100,100);
        btn6.setBounds(0,0,100,100);
        btn7.setBounds(0,0,100,100);
        btn8.setBounds(0,0,100,100);
        btn9.setBounds(0,0,100,100);

        frame.setVisible(true);

//
    }
}
