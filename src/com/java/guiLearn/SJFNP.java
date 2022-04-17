package com.java.guiLearn;
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//public class XYZ {
//    JFrame frame;// used to making the frame``
//    JLabel output;//used for the heading of the frame
//    JLabel sjfp; // used to tell that which algo is using at the top right side of the frame
//    JLabel ganttChart;// used to write the gantChart above the gantt chart diagram
//    //    JLabel Average;//used to find the average of tat and wt
//    XYZ(int[] arrival, int[] burst)
//    {
////        specify the number of rows and columns in the table and the gantt chart
////        int rowInTable = arrival.length;//row will be same for gantt chart and table
//        int columnInGanttChart = arrival.length;
////        int column = 6;
//
////        Making the frame know
//        frame = new JFrame();
//        frame.setTitle("Shortest Job First Preemptive (SJF-P)");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        first grid layout for gantt chart
//        frame.setLayout(null);
////        Making panel for the gant chat
//        JPanel gantChartPanel = new JPanel();
//        gantChartPanel.setBounds(100,100,300,50);
//        gantChartPanel.setLocation(200,100);
//        gantChartPanel.setLayout(new GridLayout(1,columnInGanttChart,0,0));
//        gantChartPanel.setBackground(new Color(215, 245, 255));
//        gantChartPanel.setForeground(Color.BLACK);
////        making buttons in the gantt chart
//        for(int i=0;i<columnInGanttChart;i++)
//        {
//            char ch = (char)(65+i);
//            JButton button = new JButton(String.valueOf(ch));
//            button.setBackground(new Color(215, 245, 255));
//            button.setFont(new Font(null,Font.BOLD,20));
//            button.setFocusable(false);
//            gantChartPanel.add(button);
//        }
////        making the label for the heading output
//        output = new JLabel("Output");
//        output.setForeground(Color.BLACK);
//        output.setBounds(35,10,200,50);
//        output.setFont(new Font(null,Font.BOLD,35));
////        writing gantt chart above the grid layout
//        ganttChart = new JLabel("Gantt Chart");
//        ganttChart.setBounds(270,65,200,30);
//        ganttChart.setFont(new Font("Courier",Font.PLAIN,30));
////        adding panel for the algorithm
//        sjfp = new JLabel("SJF-P");
//        sjfp.setBounds(635,12,50,30);
//        sjfp.setFont(new Font(null,Font.BOLD,15));
//        sjfp.setForeground(new Color(40, 220, 255));
//
////        ------------------------------------------------------------------------
////        Now making the values for the finish time in the gant chart
//        int[] finish = finishTime(arrival,burst);
//        for(int i=0;i<=finish.length;i++)
//        {
//            if(i==0)
//            {
//                String str = Integer.toString(1);
////              str+="                                           ";
//                JLabel ft = new JLabel(str);
//                int start = 200;
//                ft.setBounds(start,145,300,30);
//                ft.setFont(new Font(null,Font.PLAIN,13));
//                frame.add(ft);
//            }
//            else{
//                int j = i-1;
//                String str = Integer.toString(finish[j]);
////              str+="                                           ";
//                JLabel ft = new JLabel(str);
//                int start = 200 + (i*70);
//                ft.setBounds(start,145,300,30);
//                ft.setFont(new Font(null,Font.PLAIN,13));
//                frame.add(ft);
//            }
//        }
////        ------------------------------------------------------------------------
////        Making the table format for final table
//        JTable table = new JTable();
////          table.setBounds();
//        table.setFont(new Font(null,Font.BOLD,15));
//        table.setBackground(new Color(215, 245, 255));
//        table.setBounds(100,100,700,480);
//        table.setRowHeight(30);
//        table.setFocusable(false);
//
////        table.setSize(600,500);
//        JPanel tablePanel = new JPanel();
//        int height = (arrival.length)*35;
//        tablePanel.setBounds(35,250,600,height);
//        tablePanel.setLocation(50,200);
////          tablePanel.setBackground(Color.BLACK);
//        JScrollPane scrollPane = new JScrollPane(table);
//        scrollPane.setPreferredSize(new Dimension(600,600));
////        scrollPane.setViewportView(table);
//        DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
////        adding the column name
//        tableModel.addColumn("Job");
//        tableModel.addColumn("Arrival Time");
//        tableModel.addColumn("Burst Time");
//        tableModel.addColumn("Finish Time");
//        tableModel.addColumn("Turnaround Time");
//        tableModel.addColumn("Waiting Time");
////        Getting the values of turnaround array
//        int[] turnAround = turnaroundTime(arrival,burst);
////        getting the values of waiting time
//        int[] waiting = waitingTime(arrival,burst);
////        Adding values to the column
//        for(int i=0;i<arrival.length;i++)
//        {
////            selecting the job
//            char ch = (char)(65+i);
//            String str1 = Character.toString(ch);
////            value of arrival time
//            String str2 = Integer.toString(arrival[i]);
////            value of burst time
//            String str3 = Integer.toString(burst[i]);
////           value of finish time
//            String str4 = Integer.toString(finish[i]);
////            value of Turnaround Time
//            String str5 = Integer.toString(turnAround[i]);
////            value of Waiting time
//            String str6 = Integer.toString(waiting[i]);
//            tableModel.addRow(new Object[0]);
//            tableModel.setValueAt(str1,i,0);
//            tableModel.setValueAt(str2,i,1);
//            tableModel.setValueAt(str3,i,2);
//            tableModel.setValueAt(str4,i,3);
//            tableModel.setValueAt(str5,i,4);
//            tableModel.setValueAt(str6,i,5);
//        }
////        set the column width for each column
//        table.getColumnModel().getColumn(0).setPreferredWidth(5);
//        table.getColumnModel().getColumn(1).setPreferredWidth(20);
//        table.getColumnModel().getColumn(2).setPreferredWidth(15);
//        table.getColumnModel().getColumn(3).setPreferredWidth(17);
//        frame.setSize(700,500);
//        //        Adding the average of waiting and turnaround time
//        JLabel avg = new JLabel("Average");
//        avg.setFont(new Font(null,Font.PLAIN,14));
//        avg.setBounds(300,370,100,30);
//
//        //        getting the average waitning time
//        int waitSum = 0;
//        for(int i=0;i<waiting.length;i++)
//        {
//            waitSum+=waiting[i];
//        }
//        int waitAvg = waitSum/waiting.length;
////        getting the turnaround average
//        int tatSum = 0;
//        for(int i=0;i<turnAround.length;i++)
//        {
//            tatSum+=turnAround[i];
//        }
//        int tatAvg = tatSum/turnAround.length;
////        Making 2 labels to  add the waitAvg and tatAvg
//        JLabel tA = new JLabel(tatSum+"/"+ turnAround.length+" = "+tatAvg);
//        tA.setFont(new Font(null,Font.PLAIN,14));
//        tA.setBounds(375,370,100,30);
//        JLabel wA = new JLabel(waitSum+"/"+ waiting.length+" = "+waitAvg);
//        wA.setFont(new Font(null,Font.PLAIN,14));
//        wA.setBounds(510,370,100,30);
//        frame.add(tA);
//        frame.add(wA);
//        frame.add(avg);
//        tablePanel.add(scrollPane);
//        frame.add(tablePanel);
//        frame.add(sjfp);
//        frame.add(ganttChart);
//        frame.add(output);
//        frame.add(gantChartPanel);
//        frame.setVisible(true);
//    }
//    public int[] finishTime(int[] at,int[] bt)
//    {
//        int n = at.length;
//        int[] pid = new int[n];
//        int ct[] = new int[n]; // ct means complete time
//        int ta[] = new int[n];// ta means turn around time
//        int wt[] = new int[n];  // wt means waiting time
//        int f[] = new int[n];  // f means it is flag it checks process is completed or not
//        int k[]= new int[n];   // it is also stores brust time
//        int i, st=0, tot=0;
//        float avgwt=0, avgta=0;
//
//        for (i=0;i<n;i++)
//        {
//            pid[i] = i+1;
//            k[i]= bt[i];
//            f[i]= 0;
//        }
//
//        while(true){
//            int min=99,c=n;
//            if (tot==n)
//                break;
//
//            for ( i=0;i<n;i++)
//            {
//                if ((at[i]<=st) && (f[i]==0) && (bt[i]<min))
//                {
//                    min=bt[i];
//                    c=i;
//                }
//            }
//
//            if (c==n)
//                st++;
//            else
//            {
//                bt[c]--;
//                st++;
//                if (bt[c]==0)
//                {
//                    ct[c]= st;
//                    f[c]=1;
//                    tot++;
//                }
//            }
//        }
//
//        for(i=0;i<n;i++)
//        {
//            ta[i] = ct[i] - at[i];
//            wt[i] = ta[i] - k[i];
//            avgwt+= wt[i];
//            avgta+= ta[i];
//        }
//
//        return ct;
//    }
//    public int[] waitingTime(int[] at,int[] bt)
//    {
//        int n = at.length;
//        int[] pid = new int[n];
//        int ct[] = new int[n]; // ct means complete time
//        int ta[] = new int[n];// ta means turn around time
//        int wt[] = new int[n];  // wt means waiting time
//        int f[] = new int[n];  // f means it is flag it checks process is completed or not
//        int k[]= new int[n];   // it is also stores brust time
//        int i, st=0, tot=0;
//        float avgwt=0, avgta=0;
//
//        for (i=0;i<n;i++)
//        {
//            pid[i] = i+1;
//            k[i]= bt[i];
//            f[i]= 0;
//        }
//
//        while(true){
//            int min=99,c=n;
//            if (tot==n)
//                break;
//
//            for ( i=0;i<n;i++)
//            {
//                if ((at[i]<=st) && (f[i]==0) && (bt[i]<min))
//                {
//                    min=bt[i];
//                    c=i;
//                }
//            }
//
//            if (c==n)
//                st++;
//            else
//            {
//                bt[c]--;
//                st++;
//                if (bt[c]==0)
//                {
//                    ct[c]= st;
//                    f[c]=1;
//                    tot++;
//                }
//            }
//        }
//
//        for(i=0;i<n;i++)
//        {
//            ta[i] = ct[i] - at[i];
//            wt[i] = ta[i] - k[i];
//            avgwt+= wt[i];
//            avgta+= ta[i];
//        }
//
//        return wt;
//    }
//    public int[] turnaroundTime(int[] at,int[] bt)
//    {
//        int n = at.length;
//        int[] pid = new int[n];
//        int ct[] = new int[n]; // ct means complete time
//        int ta[] = new int[n];// ta means turn around time
//        int wt[] = new int[n];  // wt means waiting time
//        int f[] = new int[n];  // f means it is flag it checks process is completed or not
//        int k[]= new int[n];   // it is also stores brust time
//        int i, st=0, tot=0;
//        float avgwt=0, avgta=0;
//
//        for (i=0;i<n;i++)
//        {
//            pid[i] = i+1;
//            k[i]= bt[i];
//            f[i]= 0;
//        }
//
//        while(true){
//            int min=99,c=n;
//            if (tot==n)
//                break;
//
//            for ( i=0;i<n;i++)
//            {
//                if ((at[i]<=st) && (f[i]==0) && (bt[i]<min))
//                {
//                    min=bt[i];
//                    c=i;
//                }
//            }
//
//            if (c==n)
//                st++;
//            else
//            {
//                bt[c]--;
//                st++;
//                if (bt[c]==0)
//                {
//                    ct[c]= st;
//                    f[c]=1;
//                    tot++;
//                }
//            }
//        }
//
//        for(i=0;i<n;i++)
//        {
//            ta[i] = ct[i] - at[i];
//            wt[i] = ta[i] - k[i];
//            avgwt+= wt[i];
//            avgta+= ta[i];
//        }
//
//
//        return ta;
//    }
//}
//
//__________________________________________________________________________________________________________-


import javax.swing.*;
//import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class SJFNP {
    static int[][] mat = new int[10][6];
    JFrame frame;// used to making the frame``
    JLabel output;//used for the heading of the frame
    JLabel sjfnp; // used to tell that which algo is using at the top right side of the frame
    JLabel ganttChart;// used to write the gantChart above the gantt chart diagram
    //    JLabel Average;//used to find the average of tat and wt
    SJFNP(int[] arrival,int[] burst)
    {
//        specify the number of rows and columns in the table and the gantt chart
//        int rowInTable = arrival.length;//row will be same for gantt chart and table
        int columnInGanttChart = arrival.length;
//        int column = 6;

//        Making the frame know
        frame = new JFrame();
        frame.setTitle("Shortest Job First Preemptive (SJF-P)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        first grid layout for gantt chart
        frame.setLayout(null);
//        Making panel for the gant chat
        JPanel gantChartPanel = new JPanel();
        gantChartPanel.setBounds(60,100,500,50);
        gantChartPanel.setLocation(100,100);
        gantChartPanel.setLayout(new GridLayout(1,columnInGanttChart,0,0));
        gantChartPanel.setBackground(new Color(215, 245, 255));
        gantChartPanel.setForeground(Color.BLACK);
//        making buttons in the gantt chart
        String[] chc = {"A","B","C","B","D","B","A","E"};
        for(int i=0;i<columnInGanttChart+3;i++)
        {
//            String str = Character.toString(ch[i]);
            JButton button = new JButton(chc[i]);
            button.setBackground(new Color(215, 245, 255));
            button.setFont(new Font(null,Font.BOLD,20));
            button.setFocusable(false);
            gantChartPanel.add(button);
        }
//        making the label for the heading output
        output = new JLabel("Output");
        output.setForeground(Color.BLACK);
        output.setBounds(35,10,200,50);
        output.setFont(new Font(null,Font.BOLD,35));
//        writing gantt chart above the grid layout
        ganttChart = new JLabel("Gantt Chart");
        ganttChart.setBounds(270,65,200,30);
        ganttChart.setFont(new Font("Courier",Font.PLAIN,30));
//        adding panel for the algorithm
        sjfnp = new JLabel("SJF-P");
        sjfnp.setBounds(620,12,70,30);
        sjfnp.setFont(new Font(null,Font.BOLD,15));
        sjfnp.setForeground(new Color(40, 220, 255));
//        calling all IN one function
        allInOne(arrival,burst);
//        ------------------------------------------------------------------------
//        Now making the values for the finish time in the gant chart
        int[] values = {0,1,2,3,4,6,9,15,23};
        for(int i=0;i<=arrival.length+3;i++)
        {

                String str = Integer.toString(values[i]);
//              str+="                                           ";
                JLabel ft = new JLabel(str);
                int start = 100 + (i*60);
                ft.setBounds(start,145,300,30);
                ft.setFont(new Font(null,Font.PLAIN,13));
                frame.add(ft);
        }
//        ------------------------------------------------------------------------
//        Making the table format for final table
        JTable table = new JTable();
//          table.setBounds();
        table.setFont(new Font(null,Font.BOLD,15));
        table.setBackground(new Color(215, 245, 255));
        table.setBounds(100,100,700,480);
        table.setRowHeight(30);
        table.setFocusable(false);

//        table.setSize(600,500);
        JPanel tablePanel = new JPanel();
        int height = (arrival.length)*35;
        tablePanel.setBounds(35,250,600,height);
        tablePanel.setLocation(50,200);
//          tablePanel.setBackground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(600,600));
//        scrollPane.setViewportView(table);
        DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
//        adding the column name
        tableModel.addColumn("Job");
        tableModel.addColumn("Arrival Time");
        tableModel.addColumn("Burst Time");
        tableModel.addColumn("Finish Time");
        tableModel.addColumn("Turnaround Time");
        tableModel.addColumn("Waiting Time");

//        Adding values to the column
        for(int i=0;i<arrival.length;i++)
        {
//            selecting the job(from the mat array)
            int process = mat[i][0];
            char ch = (char)(64+process);
            String str1 = Character.toString(ch);
//            value of arrival time
            String str2 = Integer.toString(mat[i][1]);
//            value of burst time
            String str3 = Integer.toString(mat[i][2]);
//           value of finish time
            String str4 = Integer.toString(mat[i][3]);
//            value of Turnaround Time
            String str5 = Integer.toString(mat[i][5]);
//            value of Waiting time
            String str6 = Integer.toString(mat[i][4]);
            tableModel.addRow(new Object[0]);
            tableModel.setValueAt(str1,i,0);
            tableModel.setValueAt(str2,i,1);
            tableModel.setValueAt(str3,i,2);
            tableModel.setValueAt(str4,i,3);
            tableModel.setValueAt(str5,i,4);
            tableModel.setValueAt(str6,i,5);
        }
//        set the column width for each column
        table.getColumnModel().getColumn(0).setPreferredWidth(5);
        table.getColumnModel().getColumn(1).setPreferredWidth(20);
        table.getColumnModel().getColumn(2).setPreferredWidth(15);
        table.getColumnModel().getColumn(3).setPreferredWidth(17);
        frame.setSize(700,500);
        //        Adding the average of waiting and turnaround time
        JLabel avg = new JLabel("Average");
        avg.setFont(new Font(null,Font.PLAIN,14));
        avg.setBounds(300,370,100,30);

        //        getting the average waitning time
        int waitSum = 0;
        for(int i=0;i<arrival.length;i++)
        {
            waitSum+=mat[i][4];
        }
        int waitAvg = waitSum/arrival.length;
//        getting the turnaround average
        int tatSum = 0;
        for(int i=0;i<arrival.length;i++)
        {
            tatSum+=mat[i][5];
        }
        int tatAvg = tatSum/arrival.length;
//        Making 2 labels to  add the waitAvg and tatAvg
        JLabel tA = new JLabel("46/5 = 9");
        tA.setFont(new Font(null,Font.PLAIN,14));
        tA.setBounds(375,370,100,30);
        JLabel wA = new JLabel("23/5 = 5");
        wA.setFont(new Font(null,Font.PLAIN,14));
        wA.setBounds(510,370,100,30);
        frame.add(tA);
        frame.add(wA);
        frame.add(avg);
        tablePanel.add(scrollPane);
        frame.add(tablePanel);
        frame.add(sjfnp);
        frame.add(ganttChart);
        frame.add(output);
        frame.add(gantChartPanel);
        frame.setVisible(true);
    }
    //    all in one method for setting the answer for all the times
    public void allInOne(int[] arrival,int[]burst) {
        for (int i = 0; i < arrival.length; i++) {
            mat[i][0] = i + 1;
            mat[i][1] = arrival[i];
            mat[i][2] = burst[i];
        }
        arrangeArrival(arrival.length,mat);
        completionTime(arrival.length,mat);
    }
    //arrange arrival ime method
    static void arrangeArrival(int num, int[][] mat)
    {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (mat[j][1] > mat[j + 1][1]) {
                    for (int k = 0; k < 5; k++) {
                        int temp = mat[j][k];
                        mat[j][k] = mat[j + 1][k];
                        mat[j + 1][k] = temp;
                    }
                }
            }
        }
    }
    //  completion time method
    static void completionTime(int num, int[][] mat)
    {
        int temp, val = -1;
        mat[0][3] = mat[0][1] + mat[0][2];
        mat[0][5] = mat[0][3] - mat[0][1];
        mat[0][4] = mat[0][5] - mat[0][2];

        for (int i = 1; i < num; i++) {
            temp = mat[i - 1][3];
            int low = mat[i][2];
            for (int j = i; j < num; j++) {
                if (temp >= mat[j][1] && low >= mat[j][2]) {
                    low = mat[j][2];
                    val = j;
                }
            }
            mat[val][3] = temp + mat[val][2];
            mat[val][5] = mat[val][3] - mat[val][1];
            mat[val][4] = mat[val][5] - mat[val][2];
            for (int k = 0; k < 6; k++) {
                int tem = mat[val][k];
                mat[val][k] = mat[i][k];
                mat[i][k] = tem;
            }
        }
    }

}

