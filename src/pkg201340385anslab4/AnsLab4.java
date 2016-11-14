package pkg201340385anslab4;


import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ty
 */
public class AnsLab4 extends javax.swing.JFrame {
    HydrophobicityScale hScale;
    ArrayList<ProteinSequence> sequences;

    /**
     * Creates new form AnsLab3
     */
    public AnsLab4() {
        hScale = new HydrophobicityScale();
        initComponents();
        addKeyListenerToTextArea();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextArea();
        uploadButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        thresholdSlider = new javax.swing.JSlider();
        wLengthComboBox = new javax.swing.JComboBox<>();
        scaleComboBox = new javax.swing.JComboBox<>();
        closeButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();
        defaultButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputArea.setColumns(20);
        inputArea.setRows(5);
        inputArea.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                inputAreaInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(inputArea);

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset Input");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Input Sequence");

        jLabel2.setText("Sliding Window Length:");

        jLabel3.setText("Hydrophobicity Scale:");

        jLabel4.setText("Average Hydrophobicty Threshold: ");

        Dictionary labelTable = new Dict();
        thresholdSlider.setMinimum(5);
        thresholdSlider.setMaximum(25);
        thresholdSlider.setMajorTickSpacing(5);
        thresholdSlider.setMinorTickSpacing(1);
        labelTable.put(5, new JLabel("0.5"));
        labelTable.put(10, new JLabel("1.0"));
        labelTable.put(15, new JLabel("1.5"));
        labelTable.put(20, new JLabel("2.0"));
        labelTable.put(25, new JLabel("2.5"));
        thresholdSlider.setLabelTable(labelTable);
        thresholdSlider.setPaintTicks(true);
        thresholdSlider.setPaintLabels(true);
        thresholdSlider.setSnapToTicks(true);
        thresholdSlider.setValue(10);

        String [] length = new String [25];
        for(int i = 0, c =3; c <= 51; i++, c+=2){
            length[i]= String.valueOf(c);
        }
        wLengthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(length));
        wLengthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wLengthComboBoxActionPerformed(evt);
            }
        });

        scaleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(this.hScale.getScaleName()));

        closeButton.setText("Quit");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        generateButton.setText("Generate Plot");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        defaultButton.setText("Set Default");
        defaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(thresholdSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(wLengthComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(scaleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(uploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(defaultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(wLengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(scaleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(uploadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetButton)
                        .addGap(9, 9, 9)
                        .addComponent(closeButton)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(thresholdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateButton)
                    .addComponent(defaultButton))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            this.hScale.setFile(fc.getSelectedFile());
            String input = "";
            try {
                Scanner in = new Scanner(this.hScale.getFile());
                while(in.hasNextLine()){
                    input += in.nextLine() + "\n";
                }
                this.inputArea.setText(input);
            } catch (FileNotFoundException fne){}
        } else {
            System.out.println("Operation Cancelled");
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        this.inputArea.setText("");
        this.checkInput();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void defaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultButtonActionPerformed
        // TODO add your handling code here:
        wLengthComboBox.setSelectedItem("19");
        scaleComboBox.setSelectedIndex(0);
        thresholdSlider.setValue(10);
    }//GEN-LAST:event_defaultButtonActionPerformed

    private void wLengthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wLengthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wLengthComboBoxActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:

            int sni = this.scaleComboBox.getSelectedIndex();
            int sw = Integer.valueOf(String.valueOf(this.wLengthComboBox.getSelectedItem()));
            double threshold = this.thresholdSlider.getValue()/10.0;
            this.hScale.generatePlot(sni, sw, threshold, sequences);

        
    }//GEN-LAST:event_generateButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void inputAreaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputAreaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAreaInputMethodTextChanged
    
    private void addKeyListenerToTextArea(){
        inputArea.addKeyListener(new java.awt.event.KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                checkInput();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                checkInput();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                checkInput();
            }
        });    
    }
    
    private void checkInput() {
        if (this.inputArea.getText().isEmpty() || !this.loadFastaInput()) {
            this.generateButton.setEnabled(false);
        }
        else {
            this.generateButton.setEnabled(true);
        }
    
    }
    
    private boolean loadFastaInput () {
        String[] text = this.inputArea.getText().split("\n");
        if (text.length <= 1 || !text[0].startsWith(">") || text[0].isEmpty())
            return false;
        
        sequences = new ArrayList<>();
        for (int i = 0; i < text.length;) {
            if (text[i].startsWith(">")) {
                String comment = text[i].substring(1);
                String sequence = "";
                for (int j = i + 1; j < text.length; j++, i = j) {
                    if (text[j].isEmpty() || text[j].startsWith(">")) break;
                    sequence += text[j];
                }
                sequences.add(new ProteinSequence(comment, sequence));
                if (sequence.isEmpty()) i++;
            } else if (!text[i].isEmpty()) {
                String comment = null;
                String sequence = "";
                for (int j = i; j < text.length; j++, i = j) {
                    if (text[j].isEmpty() || text[j].startsWith(">")) break;
                    sequence += text[j];
                }
                sequences.add(new ProteinSequence(comment, sequence));
                if (sequence.isEmpty()) i++;
            }
            else i++;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnsLab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnsLab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnsLab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnsLab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnsLab4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton defaultButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextArea inputArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> scaleComboBox;
    private javax.swing.JSlider thresholdSlider;
    private javax.swing.JButton uploadButton;
    private javax.swing.JComboBox<String> wLengthComboBox;
    // End of variables declaration//GEN-END:variables
}

class Dict extends Dictionary {
    private Map<Object, Object> dict;
    
    public Dict() {
        dict = new HashMap<>();
    }

    @Override
    public int size() {
        return dict.size();
    }

    @Override
    public boolean isEmpty() {
        return dict.isEmpty();
    }

    @Override
    public Enumeration keys() {
        return Collections.enumeration(dict.keySet());
    }

    @Override
    public Enumeration elements() {
        return Collections.enumeration(dict.values());
    }

    @Override
    public Object get(Object key) {
        return dict.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return dict.put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return dict.remove(key);
    }
}