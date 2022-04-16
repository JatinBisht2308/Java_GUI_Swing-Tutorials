package com.java.guiLearn;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ComboBox implements ActionListener{
    JFrame frame = new JFrame();
    JComboBox combo;//declaring the combo box globally
    ComboBox()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
//        Now implementing the java combo box
//        use the wrapper class version of the datatype because you have to pass the reference of a class(object yrr mtlab)
        String[] algorithm = {"FCFS","PSJF","NPSJF"};
        combo = new JComboBox(algorithm);
//        combo.getItemCount();
        combo.addItem("RR");
        combo.addActionListener(this);
        frame.add(combo);
        frame.pack();
        frame.setVisible(true);
    }
//    overriding the actionPerformed method
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == combo)
       {
//           System.out.println(combo.getSelectedItem());
           System.out.println(combo.getSelectedIndex());//gives the index of the selected item
       }
    }
}
