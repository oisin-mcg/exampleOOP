/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lifeunderwaterapp;

import java.util.ArrayList;
//didnt want to import for one line but it was the easiest way to add in a way of stopping duplicates and keeping the handler in the instantiable 
import javax.swing.JOptionPane;

/**
 *Class to handle to compute methods of the Flora Dex (pokedex inspired data retension program, i dont like pokemon despite the 3 ideas i had for my classes being pokemon inspired )
 * @author mcgil
 */

//obj array
public class FloraManager {
    private ArrayList<UnderwaterFlora> floraList = new ArrayList<>();

    public void addFlora(String name) {
        // check for duplicates
        for (UnderwaterFlora flora : floraList) {
            if (flora.getName().equals(name)) {
                // message if duplicate is found
                JOptionPane.showMessageDialog(null, "This species has already been found!", "Duplicate Found", JOptionPane.INFORMATION_MESSAGE);
                return; // stops the add of dupe
            }
            //TODO change the add feature so a prompt appears and the user can add a description of the species found
        }

        // no duplicate found add the species
        UnderwaterFlora newFlora = new UnderwaterFlora(name);
        floraList.add(newFlora);

        // confirmation prompt MAY GET RID OF IN FINAL SUBMISSION (bc its annoying)--kept but moved to gui for continuity 
        // JOptionPane.showMessageDialog(null, "Flora added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public UnderwaterFlora searchFlora(String name) {
        for (UnderwaterFlora flora : floraList) {
            if (flora.getName().equals(name)) {
                return flora;// found
            }
        }
        return null; // not found
        
        //TODO change the dex so that when a user correctly searches a species the desription apprears instead of confirmation it is in the Dex
    }
    
    //method to grab the info and diplay simalar to the employee APP previuosly done 
    public String getFloraContent() {
        StringBuilder content = new StringBuilder();
        for (UnderwaterFlora flora : floraList) {
            content.append(flora.getName()).append("\n");
        }
        return content.toString();
    }

    //method to delet flora
    public boolean deleteFlora(String name) {
        UnderwaterFlora floraToDelete = null;
        for (UnderwaterFlora flora : floraList) {
            if (flora.getName().equals(name)) {
                floraToDelete = flora;
                break;
            }
        }

        if (floraToDelete != null) {
            floraList.remove(floraToDelete);
            return true; 
        } else {
            return false;
        }
    }
}
