/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lifeunderwaterapp;

import javax.swing.JButton;

/**
 *
 * @author CamaraAdmin
 */
public class LifeUnderWaterGUI extends javax.swing.JFrame {

    /* creates LifeUnderWaterGUI*/
    public LifeUnderWaterGUI() {
        initComponents();
        floraBtn.setVisible(true);
        pollBtn.setVisible(true);
        wildBtn.setVisible(true);
        floraDexBTN.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        floraBtn = new javax.swing.JButton();
        wildBtn = new javax.swing.JButton();
        pollBtn = new javax.swing.JButton();
        floraDexBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        floraBtn.setText("Flora");
        floraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floraBtnActionPerformed(evt);
            }
        });

        wildBtn.setText("Wildlife");
        wildBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wildBtnActionPerformed(evt);
            }
        });

        pollBtn.setText("Pollution");
        pollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollBtnActionPerformed(evt);
            }
        });

        floraDexBTN.setText("FloraDex");
        floraDexBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floraDexBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(floraBtn)
                .addGap(18, 18, 18)
                .addComponent(pollBtn)
                .addGap(18, 18, 18)
                .addComponent(wildBtn)
                .addGap(18, 18, 18)
                .addComponent(floraDexBTN)
                .addContainerGap(454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floraBtn)
                    .addComponent(pollBtn)
                    .addComponent(wildBtn)
                    .addComponent(floraDexBTN))
                .addContainerGap(445, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void floraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floraBtnActionPerformed

        //The action tht is performed when butto is clicked
        FloraGUI floraGUI = new FloraGUI();
        floraGUI.setVisible(true);
        dispose();

    }//GEN-LAST:event_floraBtnActionPerformed

    private void wildBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wildBtnActionPerformed
        // TODO add your handling code here:
        WildlifeGUI wildlifeGUI = new WildlifeGUI();
        wildlifeGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_wildBtnActionPerformed

    private void pollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollBtnActionPerformed
        // TODO add your handling code here:
        PollutionGUI pollutionGUI = new PollutionGUI();
        pollutionGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_pollBtnActionPerformed

    private void floraDexBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floraDexBTNActionPerformed
        // TODO add your handling code here:
        FloraDexGUI donorGUI = new FloraDexGUI();
        donorGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_floraDexBTNActionPerformed

    protected JButton getFloraButton() {
        return floraBtn;
    }

    protected JButton getPollutionButton() {
        return pollBtn;
    }

    protected JButton getWildlifeButton() {
        return wildBtn;

    }
    
    protected JButton getDonorButton(){
        return floraDexBTN;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form, can also do the styling of the window here */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //the most important bit of code for GUI's below;
                new LifeUnderWaterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton floraBtn;
    private javax.swing.JButton floraDexBTN;
    private javax.swing.JButton pollBtn;
    private javax.swing.JButton wildBtn;
    // End of variables declaration//GEN-END:variables
}
