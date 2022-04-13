package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;

public class Sixth {
    public static void main(String[] args) {
//        BorderLayout: It is used to place components i.e panels in 5 areas in a frame
//        NORTH,SOUTH,EAST,WEST,CENTER all extra space is placed in the center area.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
//        setting the color of the panels
        p1.setBackground(Color.red);
        p2.setBackground(Color.green);
        p3.setBackground(Color.yellow);
        p4.setBackground(Color.magenta);
        p5.setBackground(Color.cyan);
//        setting the size of the panel using setPreferredSize() function
        p1.setPreferredSize(new Dimension(100,100));//dimension class is used to provide the dimension
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));


//        to set the position of the panels in a frame we use the BorderLayout.etc etc things
        frame.add(p1,BorderLayout.NORTH);
        frame.add(p2,BorderLayout.WEST);
        frame.add(p3,BorderLayout.SOUTH);
        frame.add(p4,BorderLayout.EAST);
        frame.add(p5,BorderLayout.CENTER);

    }
}
