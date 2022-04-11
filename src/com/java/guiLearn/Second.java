package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
public class Second {

    public static void main(String[] args) {
        //    Make an object of the frame class
        JFrame frame = new JFrame();
//        size of the frame
        frame.setSize(500,500);
//        termination on pressing cross
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        making the frame not resizable
        frame.setResizable(false);
        frame.setVisible(true);
//        changing the color of the background of the frame
//        frame.getContentPane().setBackground(Color.BLACK);//changes the color of the frame
//        another way of changing the color is using new Color and giving them rgb values
        frame.getContentPane().setBackground(new Color(123,50,250));



    }
}
