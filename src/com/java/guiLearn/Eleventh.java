package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Eleventh implements ActionListener{
    JButton button = new JButton("Submit");
    Eleventh()
    {
        //        Now adding the button which will check that you have checked the check box or not
        button.addActionListener(this);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,500);
//        Now adding the checkbox to the frame
        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Above 18");
//        remove the border around the checkbox
        checkBox.setFocusable(false);
//        set the font of the checkbox
        checkBox.setFont(new Font("Consolas",Font.BOLD,25));
        frame.add(checkBox);

        frame.pack();
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button)
        {
//         boolean age = checkBox.isSelected();
         if(age)
         {
             System.out.println("Selected");
         }
         else{
             System.out.println("Please check the check box");
         }
        }
    }
}
