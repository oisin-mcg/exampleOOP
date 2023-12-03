/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lifeunderwaterapp;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//below will allow me to replace X & O's with images of sharks and Fish
import javax.swing.ImageIcon;

/**
 *
 * @author CamaraAdmin
 */
/*How to add score system research; https://stackoverflow.com/questions/61947428/how-to-add-a-score-record-system-in-tic-tac-toe-java-game*/
public class WildlifeGame extends javax.swing.JFrame {

    /**
     * Creates new form WildlifeGame
     */
    private String startGame = "X";
    /*below is my counter*/
    private int xCount = 0;
    private int oCount = 0;
    /*below boolean will check if the buttons are initialised*/
    boolean checker;
    //NOTE, always check your file path, set me back an hour trying to sort out why image was not showing
    private ImageIcon sharkIcon = new ImageIcon("image-resources/sharkTic.jpg");
    private ImageIcon fishIcon = new ImageIcon("image-resources/fishTic.jpg");
//setting the size foe the shark and fish icons
    private int iconWidth = 220;
    private int iconHeight = 140;

    //needed to research how to calculate the ratio of the original images, as they were getting cut off on left hand side
    private double sharkAspectRatio = (double) sharkIcon.getIconWidth() / sharkIcon.getIconHeight();
    private double fishAspectRatio = (double) fishIcon.getIconWidth() / fishIcon.getIconHeight();

//creating the new height and width in the new resized icons. I used only iconWidth as the images were getting cut off from left hand side but height was fine.
    private int resizedSharkHeight = (int) (iconWidth / sharkAspectRatio);
    private int resizedFishHeight = (int) (iconWidth / fishAspectRatio);

//here im resizing the images//research "scale centered instance//
    private ImageIcon resizedSharkIcon = new ImageIcon(sharkIcon.getImage().getScaledInstance(iconWidth, iconHeight, java.awt.Image.SCALE_SMOOTH));
    private ImageIcon resizedFishIcon = new ImageIcon(fishIcon.getImage().getScaledInstance(iconWidth, iconHeight, java.awt.Image.SCALE_SMOOTH));

    public WildlifeGame() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);

        //Settinf the background colour of tiles as BLUE.
        ticbtn1.setBackground(Color.BLUE);
        ticbtn2.setBackground(Color.BLUE);
        ticbtn3.setBackground(Color.BLUE);
        ticbtn4.setBackground(Color.BLUE);
        ticbtn6.setBackground(Color.BLUE);
        ticbtn5.setBackground(Color.BLUE);
        ticbtn9.setBackground(Color.BLUE);
        ticbtn8.setBackground(Color.BLUE);
        ticbtn7.setBackground(Color.BLUE);
    }

    private void gameScore() {
        //shark
        jlblplayerX.setText(String.valueOf(xCount));
        //fish
        jlblplayerO.setText(String.valueOf(oCount));
    }

    private void choicePlayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void winGame() {
        /*Whatever was inside the variable of ticbtn1 we are using the .getText()method to acquire it*/
        String b1 = ticbtn1.getText();
        String b2 = ticbtn2.getText();
        String b3 = ticbtn3.getText();
        String b4 = ticbtn4.getText();
        String b5 = ticbtn5.getText();
        String b6 = ticbtn6.getText();
        String b7 = ticbtn7.getText();
        String b8 = ticbtn8.getText();
        String b9 = ticbtn9.getText();
        /*below i will set all my conditions for winning the game of tic tac toe*/
 /*red for sharks and blue for fish*/
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player Shark has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn1.setBackground(Color.RED);
            ticbtn2.setBackground(Color.RED);
            ticbtn3.setBackground(Color.RED);
            xCount++;
            gameScore();
        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player Shark has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn4.setBackground(Color.RED);
            ticbtn5.setBackground(Color.RED);
            ticbtn6.setBackground(Color.RED);
            xCount++;
            gameScore();
        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player Shark has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn9.setBackground(Color.RED);
            ticbtn8.setBackground(Color.RED);
            ticbtn7.setBackground(Color.RED);
            xCount++;
            gameScore();
        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player Shark has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn1.setBackground(Color.RED);
            ticbtn4.setBackground(Color.RED);
            ticbtn9.setBackground(Color.RED);
            xCount++;
            gameScore();
        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player Shark has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn2.setBackground(Color.RED);
            ticbtn5.setBackground(Color.RED);
            ticbtn8.setBackground(Color.RED);
            xCount++;
            gameScore();
        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player Shark has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn3.setBackground(Color.RED);
            ticbtn6.setBackground(Color.RED);
            ticbtn9.setBackground(Color.RED);
            xCount++;
            gameScore();
        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player Shark has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn1.setBackground(Color.RED);
            ticbtn5.setBackground(Color.RED);
            ticbtn9.setBackground(Color.RED);
            xCount++;
            gameScore();
        }
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player Shark has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn3.setBackground(Color.RED);
            ticbtn5.setBackground(Color.RED);
            ticbtn7.setBackground(Color.RED);
            xCount++;
            gameScore();
        }
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player Fish has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn1.setBackground(Color.BLUE);
            ticbtn2.setBackground(Color.BLUE);
            ticbtn3.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player Fish has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn4.setBackground(Color.BLUE);
            ticbtn6.setBackground(Color.BLUE);
            ticbtn5.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player Fish has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn9.setBackground(Color.BLUE);
            ticbtn8.setBackground(Color.BLUE);
            ticbtn7.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player Fish has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn1.setBackground(Color.BLUE);
            ticbtn4.setBackground(Color.BLUE);
            ticbtn7.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player Fish has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn2.setBackground(Color.BLUE);
            ticbtn5.setBackground(Color.BLUE);
            ticbtn8.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player Fish has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn3.setBackground(Color.BLUE);
            ticbtn6.setBackground(Color.BLUE);
            ticbtn9.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player Fish has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn1.setBackground(Color.BLUE);
            ticbtn5.setBackground(Color.BLUE);
            ticbtn9.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player Fish has won", "Shark Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ticbtn3.setBackground(Color.BLUE);
            ticbtn5.setBackground(Color.BLUE);
            ticbtn7.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }

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
        titlelbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ticbtn1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ticbtn2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ticbtn3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblplayerX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        ticbtn4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        ticbtn5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        ticbtn6 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jlblplayerO = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        ticbtn7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        ticbtn8 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        ticbtn9 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        resetlbl = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        exitbtn = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        homebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new java.awt.BorderLayout());

        titlelbl.setBackground(new java.awt.Color(0, 153, 153));
        titlelbl.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        titlelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelbl.setText("Shark Tac Toe.");
        titlelbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titlelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(titlelbl, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new java.awt.BorderLayout());

        ticbtn1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(ticbtn1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new java.awt.BorderLayout());

        ticbtn2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn2ActionPerformed(evt);
            }
        });
        jPanel4.add(ticbtn2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setLayout(new java.awt.BorderLayout());

        ticbtn3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn3ActionPerformed(evt);
            }
        });
        jPanel5.add(ticbtn3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText(" Shark:");
        jPanel6.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblplayerX.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlblplayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblplayerX.setText("0");
        jPanel7.add(jlblplayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.setLayout(new java.awt.BorderLayout());

        ticbtn4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn4ActionPerformed(evt);
            }
        });
        jPanel9.add(ticbtn4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel10.setLayout(new java.awt.BorderLayout());

        ticbtn5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn5ActionPerformed(evt);
            }
        });
        jPanel10.add(ticbtn5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel11.setLayout(new java.awt.BorderLayout());

        ticbtn6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn6ActionPerformed(evt);
            }
        });
        jPanel11.add(ticbtn6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));
        jPanel12.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Fish:");
        jPanel12.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));
        jPanel13.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jlblplayerO.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlblplayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblplayerO.setText("0");
        jPanel13.add(jlblplayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));
        jPanel15.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel15.setLayout(new java.awt.BorderLayout());

        ticbtn7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn7ActionPerformed(evt);
            }
        });
        jPanel15.add(ticbtn7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));
        jPanel16.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel16.setLayout(new java.awt.BorderLayout());

        ticbtn8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn8ActionPerformed(evt);
            }
        });
        jPanel16.add(ticbtn8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel17.setLayout(new java.awt.BorderLayout());

        ticbtn9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ticbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticbtn9ActionPerformed(evt);
            }
        });
        jPanel17.add(ticbtn9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));
        jPanel18.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel18.setLayout(new java.awt.BorderLayout());

        resetlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetlbl.setText("Reset");
        resetlbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetlblActionPerformed(evt);
            }
        });
        jPanel18.add(resetlbl, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));
        jPanel19.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel19.setLayout(new java.awt.BorderLayout());

        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel19.add(exitbtn, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 539));

        sidePanel.setBackground(new java.awt.Color(0, 155, 155));
        sidePanel.setLayout(null);

        homebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homebtn.setText("Home");
        homebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        sidePanel.add(homebtn);
        homebtn.setBounds(0, 0, 80, 40);

        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        sidePanel.add(backbtn);
        backbtn.setBounds(120, 0, 90, 40);

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 210, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed

        frame = new JFrame("Exit");
        int result = JOptionPane.showConfirmDialog(frame, "Do you want to exit? I worked really hard on this", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed
    /*Had originally had below code in the actionperformed scope of the GUI, this was idd resetting the game, but also reset scores which is not what I wanted */
    private void resetGame() {
        ticbtn1.setEnabled(true);
        ticbtn2.setEnabled(true);
        ticbtn3.setEnabled(true);
        ticbtn4.setEnabled(true);
        ticbtn6.setEnabled(true);
        ticbtn5.setEnabled(true);
        ticbtn9.setEnabled(true);
        ticbtn8.setEnabled(true);
        ticbtn7.setEnabled(true);

        ticbtn1.setText("");
        ticbtn2.setText("");
        ticbtn3.setText("");
        ticbtn4.setText("");
        ticbtn6.setText("");
        ticbtn5.setText("");
        ticbtn9.setText("");
        ticbtn8.setText("");
        ticbtn7.setText("");

        ticbtn1.setBackground(Color.BLUE);
        ticbtn2.setBackground(Color.BLUE);
        ticbtn3.setBackground(Color.BLUE);
        ticbtn4.setBackground(Color.BLUE);
        ticbtn6.setBackground(Color.BLUE);
        ticbtn5.setBackground(Color.BLUE);
        ticbtn9.setBackground(Color.BLUE);
        ticbtn8.setBackground(Color.BLUE);
        ticbtn7.setBackground(Color.BLUE);
    }
    private void resetlblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetlblActionPerformed
        // TODO add your handling code here:
        resetGame();

        ticbtn1.setIcon(null);
        ticbtn2.setIcon(null);
        ticbtn3.setIcon(null);
        ticbtn4.setIcon(null);
        ticbtn5.setIcon(null);
        ticbtn6.setIcon(null);
        ticbtn7.setIcon(null);
        ticbtn8.setIcon(null);
        ticbtn9.setIcon(null);

        /*resets score to "0"
        jlblplayerX.setText("0");
        jlblplayerO.setText("0");

         */
    }//GEN-LAST:event_resetlblActionPerformed

    private void ticbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn1ActionPerformed
        // TODO add your handling code here:
        ticbtn1.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn1.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();
    }//GEN-LAST:event_ticbtn1ActionPerformed

    private void ticbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn2ActionPerformed
        // TODO add your handling code here:
        ticbtn2.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn2.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();


    }//GEN-LAST:event_ticbtn2ActionPerformed

    private void ticbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn3ActionPerformed
        // TODO add your handling code here:
        ticbtn3.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn3.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();
    }//GEN-LAST:event_ticbtn3ActionPerformed

    private void ticbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn4ActionPerformed
        // TODO add your handling code here:
        ticbtn4.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn4.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();
    }//GEN-LAST:event_ticbtn4ActionPerformed

    private void ticbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn5ActionPerformed
        // TODO add your handling code here:
        ticbtn5.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn5.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();
    }//GEN-LAST:event_ticbtn5ActionPerformed

    private void ticbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn6ActionPerformed
        // TODO add your handling code here:
        ticbtn6.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn6.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();
    }//GEN-LAST:event_ticbtn6ActionPerformed

    private void ticbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn7ActionPerformed
        // TODO add your handling code here:
        ticbtn7.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn7.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();
    }//GEN-LAST:event_ticbtn7ActionPerformed

    private void ticbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn8ActionPerformed
        // TODO add your handling code here:
        ticbtn8.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn8.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();
    }//GEN-LAST:event_ticbtn8ActionPerformed

    private void ticbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticbtn9ActionPerformed
        // TODO add your handling code here:
        ticbtn9.setIcon(startGame.equalsIgnoreCase("X") ? resizedSharkIcon : resizedFishIcon);
        ticbtn9.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choicePlayer();
        winGame();
    }//GEN-LAST:event_ticbtn9ActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        LifeUnderWaterGUI lifeUnderWaterGUI = new LifeUnderWaterGUI();
        lifeUnderWaterGUI.setVisible(true);
        dispose();

    }//GEN-LAST:event_homebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        WildlifeGUI wildLifeGUI = new WildlifeGUI();
        wildLifeGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(WildlifeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WildlifeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WildlifeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WildlifeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WildlifeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlblplayerO;
    private javax.swing.JLabel jlblplayerX;
    private javax.swing.JButton resetlbl;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton ticbtn1;
    private javax.swing.JButton ticbtn2;
    private javax.swing.JButton ticbtn3;
    private javax.swing.JButton ticbtn4;
    private javax.swing.JButton ticbtn5;
    private javax.swing.JButton ticbtn6;
    private javax.swing.JButton ticbtn7;
    private javax.swing.JButton ticbtn8;
    private javax.swing.JButton ticbtn9;
    private javax.swing.JLabel titlelbl;
    // End of variables declaration//GEN-END:variables
}
