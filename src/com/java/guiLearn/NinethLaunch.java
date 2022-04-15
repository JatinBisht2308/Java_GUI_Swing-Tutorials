package com.java.guiLearn;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NinethLaunch implements ActionListener{
//    Creating object of the necessary classes
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
//    constructor
    NinethLaunch() {
        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }
//    overriding the actionPerformed method inside the ActionListener interface
        public void actionPerformed(ActionEvent e) {
          if(e.getSource() == button)
          {
//              Making the object of the NinethNewWindow
              NinethNewWindow window = new NinethNewWindow();
              frame.dispose();
          }
        }
}
