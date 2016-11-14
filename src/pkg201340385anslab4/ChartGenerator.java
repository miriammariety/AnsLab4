package pkg201340385anslab4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author ty
 */
public class ChartGenerator {
    private ArrayList<ChartPanel> charts;
    private JFrame frame;
    private String output;
    
    public ChartGenerator (ArrayList<ChartPanel> charts) {
        this.charts = charts;
        initComponents();
        this.frame.setVisible(true);
    }
    
    private void initComponents() {
        if (charts.size() == 1)
            frame = new JFrame("Hydrophobicity Plot");
        else
            frame = new JFrame("Hydrophobicity Plots");
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,800);
        
        JPanel panel = new JPanel();
        panel.setSize(frame.getSize());
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton reportButton = new JButton("Export File as .txt");
        
        
        
        //CREATE REPORT / EXPORT FILE
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateObj = new Date();
        this.output = "GENERATED REPORT ON" + df.format(dateObj); 
        this.output += "ID\t\tCount\tStart-End\r\n";
        
        for (ChartPanel chart: charts) {
            panel.add(chart.getPanel());
            if (chart.exception == null || chart.exception.isEmpty()) {
                output += String.format("%s\t\t%d", chart.id, chart.starts.size());
                for (int i = 0; i < chart.starts.size(); i++)
                    output += String.format("\t%04d-%04d", chart.starts.get(i),
                            chart.ends.get(i));
                output+= "\r\n";
            } else {
                output += chart.exception + "\r\n";
            }
        }
        
        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateReportButtonPerformed(e);
            }
        });
        panel.add(reportButton);
        JScrollPane scrollpane = new JScrollPane(panel);
        frame.add(scrollpane);
        frame.pack();
    }
    
    private void generateReportButtonPerformed(ActionEvent e) {//    String sb = output;
        JFileChooser chooser = new JFileChooser();
        int retrival = chooser.showSaveDialog(this.frame);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter fw = new FileWriter(chooser.getSelectedFile()+".txt");
                fw.write(output);
                fw.close();
            } catch (Exception ex) {}
        }
    }
}
