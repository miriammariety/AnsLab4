package pkg201340385anslab4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import static org.knowm.xchart.BitmapEncoder.getBufferedImage;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;

/**
 *
 * @author ty
 */
public class ChartPanel {

    private XYChart chart;
    private JPanel panel;
    private JButton saveAsPng;
    protected ArrayList<Integer> starts;
    protected ArrayList<Integer> ends;
    protected String id;
    protected String exception;
    // private JButton backButton;

    public ChartPanel(String exception) {
        this.exception = exception;
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel label = new JLabel(exception);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("ARIAL", Font.BOLD, 18));
        
        panel.add(label);
        
    }

    public ChartPanel(XYChart chart) {
        this.chart = chart;
        initComponents();
        starts = new ArrayList<>();
        ends = new ArrayList<>();
        exception = "";
    }

    public ChartPanel(XYChart chart, ArrayList<Integer> starts,
            ArrayList<Integer> ends, String id) {
        this.chart = chart;
        initComponents();
        this.starts = starts;
        this.ends = ends;
        this.id = id;
    }

    private void initComponents() {
        saveAsPng = new JButton();
        saveAsPng.setText("Save as JPEG/PNG");

        saveAsPng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveAsPngActionPerformed(e);
                } catch (IOException ex) {
                    Logger.getLogger(ChartPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        this.panel = new JPanel();
        this.panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.panel.add(new XChartPanel(chart));
        this.panel.add(saveAsPng);
    }

    private void saveAsPngActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        JFileChooser chooser = new JFileChooser();
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage bi = getBufferedImage(chart);
                File outputfile = new File(chooser.getSelectedFile() + ".png");
                ImageIO.write(bi, "png", outputfile);
            } catch (IOException e) {
            }
        }

    }

    public JPanel getPanel() {
        return this.panel;
    }
}
