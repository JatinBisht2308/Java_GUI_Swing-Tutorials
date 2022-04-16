package com.java.guiLearn;
import javax.swing.*;
import java.awt.*;
public class Table {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(500,500);
        String[][] data = {
                {"A", "1", "6", "7", "6", "0"}, {"B", "1", "6", "7", "6", "0"}
        };
        String name[] = {"JOB","Arrival Time","Burst Time","Finish Time","Turnaround Time","Waiting Time"};
        JTable table = new JTable(data,name);
        table.setBounds(30,300,200,300);
        JScrollPane sp = new JScrollPane(table);
//        sp.setViewportView(table);
        sp.setBounds(10,200,400,200);
        JPanel panel = new JPanel();
        panel.setBounds(100,200,400,300);
        panel.add(sp);
        frame.add(panel);
        frame.setVisible(true);

    }
}
