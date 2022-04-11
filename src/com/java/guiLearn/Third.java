//    JLabel => a GUI display area for adding text string, image or both text and image

package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class Third {
    public static void main(String[] args) {
        //    First Making a frame here
        JFrame frame = new JFrame();
        frame.setTitle("Third Tutorial");
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
//        Adding some text and image using the JLabel
        JLabel label  = new JLabel();
        label.setText("Hi this is Jatin Bisht from DIT!!");
        frame.add(label);
//        Adding Image to the frame
        ImageIcon logo = new ImageIcon("TimeTable.png");
        frame.setIconImage(logo.getImage());
        ImageIcon image = new ImageIcon("giphy.gif");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);// set text to the right ,left and center of the imageicon.
        label.setVerticalTextPosition(JLabel.TOP);// set text to the top, bottom, center of the image icon.
//        Now it is time to add styling to the text colors
        label.setForeground(Color.GREEN);//sets the font color
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set the font style
        label.setIconTextGap(10);//sets the text gap between the image(space between them)
//      Now it is time to add border to the frame
        Border border = BorderFactory.createLineBorder(Color.GREEN);
        label.setBorder(border);//sets the border to the frame.
        label.setVerticalAlignment(JLabel.CENTER);//sets the alignment of the text or images that you have added in it
        label.setHorizontalAlignment(JLabel.CENTER);//sets the alignment of the labels horizontally
//        frame.pack();//use it at the end of adding the things inside the frame because it will pack the frame according to the content inside it



//        Now if you wanted to  set the label size and alignment inside the frame in customized way u can use bounds and setLayout

        frame.setLayout(null);
        label.setBounds(10,0,500,330);
    }
}
