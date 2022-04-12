package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fifth implements ActionListener{
JFrame frame;
JButton btn;
JLabel label;
//  use constructor to make frame and button
    Fifth()
    {
        frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane()
        frame.setLayout(null);
        frame.setVisible(true);

        btn = new JButton();
        btn.setBounds(0,0,200,100);
//        btn.setVerticalAlignment(btn.CENTER);
//        btn.setHorizontalAlignment(JButton.CENTER);
        btn.setForeground(Color.GREEN);//sets the color of the text in the butoon
        btn.setBackground(Color.BLACK);// sets the color of the background of the button
        btn.setText("Click Me!!!");// sets the text to the button
        btn.setFont(new Font("Comic Sans", Font.BOLD,25));
        frame.add(btn);
        btn.addActionListener(this);//you have to use this because this will call the overrided method actionPerformed()
        label = new JLabel();
        label.setText("You just Clicked Me!!");
        label.setVisible(false);
        label.setBounds(150,250,150,150);
        frame.add(label);

    }
// this is must you have to override this method because this method will provide you to built the logic behind the buttons
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()== btn)
     {
         System.out.println("HI JIHIHIHIHIHIHIHIHIHIH!!!");
         label.setVisible(true);
     }
    }
    public static void main(String[] args) {
     new Fifth();
    }
}