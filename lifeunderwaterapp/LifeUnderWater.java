/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifeunderwaterapp;

import javax.swing.SwingUtilities;

/**
 *
 * @author CamaraAdmin
 */
public class LifeUnderWater {

    public static void main(String args[]) {

        SwingUtilities.invokeLater(() -> {
            LifeUnderWaterGUI frame = new LifeUnderWaterGUI();
            frame.setVisible(true);

        });

    }
}
