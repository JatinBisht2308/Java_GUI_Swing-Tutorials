package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;

public class First{
    public static void main(String[] args) {
//        JFrame = a GUI window to add components in it
        JFrame frame  = new JFrame();//Constructs a new frame that is initially invisible.
        frame.setTitle("First Frame of Tutorial");//sets title of the frame
        frame.setSize(420,420);//sets the size of x(width) and y(height) dimension(strictly follows order).
        //        You can see that when we are closing the frame window then our program is not getting terminated so to make our program terinated automatically.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out application.
        frame.setResizable(false);//stops the user to resize our frame by default it is resizable.
        frame.setVisible(true);//Shows or hides the window/frame depending upon the parameter passed to it i.e (true/flase).

//        You can set the image occuring in the top left of the frame by using the below code snippet.
        ImageIcon image = new ImageIcon("TimeTable.png");
        frame.setIconImage(image.getImage()); //change the icon of the frame
    }
}