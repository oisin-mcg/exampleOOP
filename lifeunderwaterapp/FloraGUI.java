/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lifeunderwaterapp;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author mcgil
 */

public class FloraGUI extends javax.swing.JFrame {

    private JButton homeButton; // button to navigate to the home screen
    private JButton floraDexBTN; // button to open the flora dex
    private JLabel infoLabel; // label to display information about underwater flora
    private JRadioButton coralReefsRadioButton; // radio button for coral reefs
    private JRadioButton algalBloomsRadioButton; // radio button for algal blooms
    private JRadioButton microplasticsRadioButton; // radio button for microplastics
    private JTextArea selectedInfoArea; // text area to display selected information
    private JLabel imageLabel; // label to display the image

    
     // constructor for the FloraGUI class. initializes components and sets upthe GUI.
     
    public FloraGUI() {
        initComponents();
        setTitle("Flora GUI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    
     // initialize UI components, setting up buttons, labels, and their actions.
     
    private void initComponents() {
        initUIComponents();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().setBackground(new java.awt.Color(0, 153, 153));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        

        // horizontal group layout
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(homeButton)
                                                .addGap(65, 65, 65)
                                                .addComponent(floraDexBTN))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(infoLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(coralReefsRadioButton)
                                                        .addComponent(algalBloomsRadioButton)
                                                        .addComponent(microplasticsRadioButton))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(selectedInfoArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(imageLabel, GroupLayout.Alignment.TRAILING))
                                .addContainerGap(20, Short.MAX_VALUE)) // adjusted margin to make room for the image- this took SO long to figure out
        );

// vertical group layout
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(homeButton)
                                        .addComponent(floraDexBTN))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(infoLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(coralReefsRadioButton)
                                        .addComponent(selectedInfoArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)) // set preferred size for the text area-- not originally how i wanted it to be implemented but it worked in the end
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(algalBloomsRadioButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(microplasticsRadioButton)
                                .addContainerGap(280, Short.MAX_VALUE))
                        // Add the imageLabel to the right
                        .addComponent(imageLabel, GroupLayout.Alignment.TRAILING) 
        );

        pack();
    }

   
      //initialize UI components including buttons, labels, and radio buttons.
     
    private void initUIComponents() {
        homeButton = createButton("Home", evt -> homeButtonActionPerformed(evt));
        floraDexBTN = createButton("Flora Dex", evt -> floraGameButtonActionPerformed(evt));
        infoLabel = new JLabel("Welcome to the flora page! Learn about the harm caused to the unwater plant life by human activity.");

        coralReefsRadioButton = new JRadioButton("Click to learn about: Coral Reefs");
        algalBloomsRadioButton = new JRadioButton("Click to learn about: Algal Blooms");
        microplasticsRadioButton = new JRadioButton("Click to learn about: Microplastics");

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(coralReefsRadioButton);
        radioGroup.add(algalBloomsRadioButton);
        radioGroup.add(microplasticsRadioButton);

        selectedInfoArea = new JTextArea();
        selectedInfoArea.setEditable(false);
        selectedInfoArea.setOpaque(false); // set text area background to transparent
        selectedInfoArea.setLineWrap(true);
        selectedInfoArea.setWrapStyleWord(true);
        
        selectedInfoArea.setForeground(Color.MAGENTA);
        

        imageLabel = new JLabel();
        updateImage("defaultImage.jpg"); // set the default image

        // add item listeners to radio buttons
        //TODO add real tet pertinennt to the topic 
        coralReefsRadioButton.addItemListener(e -> radioButtonItemStateChanged(e, "CORAL REEF INFO HERE", "coralReefsImage.jpg"));
        algalBloomsRadioButton.addItemListener(e -> radioButtonItemStateChanged(e, "ALGAL BLOOM INFO HERE", "algalBloomsImage.jpg"));
        microplasticsRadioButton.addItemListener(e -> radioButtonItemStateChanged(e, "MICROPLASTIC INFO HERE", "microplasticsImage.jpg"));
    }

// buttons 
    private JButton createButton(String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.setFont(new java.awt.Font("Segoe UI", 1, 14));
        button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(listener);
        return button;
    }

    //home button
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        LifeUnderWaterGUI lifeUnderWaterGUI = new LifeUnderWaterGUI();
        lifeUnderWaterGUI.setVisible(true);
        dispose();
    }

    // flora dex button (previuosly was for the game then later changed when the gae became the flora dex )
    private void floraGameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        FloraDexGUI donorGUI = new FloraDexGUI();
        donorGUI.setVisible(true);
        dispose();

    }
    
    // state "chcker" for radio button. it checks what is selected and allows me to change the text displayed
    private void radioButtonItemStateChanged(ItemEvent evt, String info) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            selectedInfoArea.setText(info);
        }
    }

    // same as above except this time i change the image (well lets me get the name of the selection, my updateImage method is in charge of the background image)
    private void radioButtonItemStateChanged(ItemEvent evt, String info, String imageName) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            selectedInfoArea.setText(info);
            updateImage(imageName);
        }
    }

    // handles the background image for the page, originally there was a reset button to revert back to the default image however it had a mind of its own and would not stay put when buttons were clicked
    private void updateImage(String imageName) {
        // change image using different filepath on ONE image query
        //resource used: https://netbeans.apache.org/tutorial/main/kb/docs/java/gui-image-display/#:~:text=The%20build%20folder%20contains%20the,compiled%20class%20and%20the%20image.
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/lifeunderwaterapp/floraimages/" + imageName));
        imageLabel.setIcon(imageIcon);
    }

    // main method to launch the FloraGUI class will not be nessacary in the final submission .
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FloraGUI().setVisible(true);
        });
    }
}

/*
image tutorials https://netbeans.apache.org/tutorial/main/kb/docs/java/gui-image-display/#:~:text=The%20build%20folder%20contains%20the,compiled%20class%20and%20the%20image.
image resources (all images creative commons use)
https://www.reefrepair.com/education/science/are-sun-creams-killing-coral-reefs/
https://commons.wikimedia.org/wiki/File:Salton_sea_algal_bacterial_bloom.jpg
https://www.detran-tech.com/Solution_Details/Water-Quality-Monitor-Solution
https://ndla.no/subject:d1fe9d0a-a54d-49db-a4c2-fd5463a7c9e7/topic:a2f5aaa0-ab52-49d5-aabf-e7ffeac47fa2/topic:ee45a439-5633-4074-9629-f84e1dd9ef02/topic:f1b53365-36e1-43b8-b8bf-0c79f2141b82/resource:f721bdda-545f-48fa-adc9-290e05b571d4

*/