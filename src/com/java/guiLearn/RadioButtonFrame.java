package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtonFrame implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("Click ME");
    JRadioButton radioIOT = new JRadioButton("IOT");
    JRadioButton radioAIML = new JRadioButton("AI & ML");
    JRadioButton radioDevops = new JRadioButton("Devops");
    RadioButtonFrame()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        radioIOT.addActionListener(this);
//        creating new button group which help in selection only one radio button at the same time
        ButtonGroup group = new ButtonGroup();
        group.add(radioIOT);
        group.add(radioAIML);
        group.add(radioDevops);
//        removes the order around the radio buttons
        radioIOT.setFocusable(false);
        radioIOT.setFocusable(false);
        radioIOT.setFocusable(false);
        radioAIML.addActionListener(this);
        radioDevops.addActionListener(this);
        frame.add(radioIOT);
        frame.add(radioAIML);
        frame.add(radioDevops);
        frame.pack();
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource() == radioIOT)
      {
          System.out.println("You are taking IOT as your specialization");
      }
      else if(e.getSource() == radioAIML)
      {
          System.out.println("You are taking AI & ML as your specialization");
      }
      else{
          System.out.println("You are taking Devops as your specialization");
      }
    }
}
