/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lifeunderwaterapp;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *Flora dex program
 * this time i used netbeans jform designer, i now realise it was a mistake coding my flora page manually but i beleived it would give me more flexiblity rather than simplicity as i had used GUI's previuosly in other languages and thought it would more simple than it was 
 * @author mcgil
 */
public class FloraDexGUI extends LifeUnderWaterGUI {

    private final FloraManager floraManager = new FloraManager();

    /**
     * Creates new form DonorGUI
     */
    public FloraDexGUI() {
        initComponents();
        getFloraButton().setVisible(false);
        getPollutionButton().setVisible(false);
        getWildlifeButton().setVisible(false);
        getDonorButton().setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        addFloraLBL = new javax.swing.JLabel();
        infoLBL = new javax.swing.JLabel();
        displayFloraLBL = new javax.swing.JLabel();
        searchFloraLBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchFloraTXT = new javax.swing.JTextField();
        addFloraTXT1 = new javax.swing.JTextField();
        displayFloraBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        deleteFloraTXT = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        homeBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        bgPanel.setBackground(new java.awt.Color(0, 142, 142));

        addFloraLBL.setText("Add Flora");

        infoLBL.setText("Welcome to the FloraDex! Add undwerwater flora to your FloraDex as your explore!");

        displayFloraLBL.setText("Display Dex Content");

        searchFloraLBL.setText("Search FloraDex");

        jLabel1.setText("Delete Entry");

        searchFloraTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFloraTXTActionPerformed(evt);
            }
        });

        addFloraTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFloraTXT1ActionPerformed(evt);
            }
        });

        displayFloraBTN.setText("Display Content");
        displayFloraBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayFloraBTNActionPerformed(evt);
            }
        });

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        deleteFloraTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFloraTXTActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        homeBTN.setText("Home");
        homeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(homeBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgPanelLayout.createSequentialGroup()
                                    .addComponent(addFloraLBL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addFloraTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgPanelLayout.createSequentialGroup()
                                    .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(displayFloraLBL)
                                        .addComponent(searchFloraLBL))
                                    .addGap(48, 48, 48)
                                    .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(displayFloraBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchFloraTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteFloraTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBTN)
                            .addComponent(searchBTN)
                            .addComponent(deleteBTN))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(infoLBL))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeBTN)))
                .addGap(46, 46, 46)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFloraLBL)
                    .addComponent(addFloraTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBTN))
                .addGap(37, 37, 37)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFloraLBL)
                    .addComponent(searchFloraTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN))
                .addGap(34, 34, 34)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayFloraLBL)
                    .addComponent(displayFloraBTN))
                .addGap(35, 35, 35)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(deleteFloraTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFloraTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFloraTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFloraTXTActionPerformed

    private void addFloraTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFloraTXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addFloraTXT1ActionPerformed

    private void displayFloraBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayFloraBTNActionPerformed
        // TODO add your handling code here:
        // Get the flora content from FloraManager
        String floraContent = floraManager.getFloraContent();

        // Display the flora content in a text area or a message dialog
        JTextArea textArea = new JTextArea(floraContent);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        JOptionPane.showMessageDialog(this, scrollPane, "Flora Content", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_displayFloraBTNActionPerformed

    private void deleteFloraTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFloraTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteFloraTXTActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        String floraName = addFloraTXT1.getText();
        floraManager.addFlora(floraName);

        // Display a confirmation message
        JOptionPane.showMessageDialog(this, "Flora added successfully");

        // Optionally, clear the text field
        addFloraTXT1.setText("");
    }//GEN-LAST:event_addBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        String searchName = searchFloraTXT.getText();
        UnderwaterFlora foundFlora = floraManager.searchFlora(searchName);

        if (foundFlora != null) {
            // Display the found flora in a message dialog
            JOptionPane.showMessageDialog(this, "Found Flora: " + foundFlora.getName());
        } else {
            // Display a message when flora is not found
            JOptionPane.showMessageDialog(this, "Flora not found.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        String deleteName = deleteFloraTXT.getText();
        boolean deleted = floraManager.deleteFlora(deleteName);

        if (deleted) {
            // Display a deletion success message
            JOptionPane.showMessageDialog(this, "Flora deleted successfully!");
        } else {
            // Display a message when flora is not found for deletion
            JOptionPane.showMessageDialog(this, "Flora not found for deletion.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
        }

        // Optionally, clear the text field
        deleteFloraTXT.setText("");

    }//GEN-LAST:event_deleteBTNActionPerformed

    private void homeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTNActionPerformed
        // TODO add your handling code here:
        LifeUnderWaterGUI lifeUnderWaterGUI = new LifeUnderWaterGUI();
        lifeUnderWaterGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeBTNActionPerformed

    //manual handling code for
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
            java.util.logging.Logger.getLogger(FloraDexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FloraDexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FloraDexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FloraDexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FloraDexGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel addFloraLBL;
    private javax.swing.JTextField addFloraTXT1;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextField deleteFloraTXT;
    private javax.swing.JButton displayFloraBTN;
    private javax.swing.JLabel displayFloraLBL;
    private javax.swing.JButton homeBTN;
    private javax.swing.JLabel infoLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel searchFloraLBL;
    private javax.swing.JTextField searchFloraTXT;
    // End of variables declaration//GEN-END:variables
}
