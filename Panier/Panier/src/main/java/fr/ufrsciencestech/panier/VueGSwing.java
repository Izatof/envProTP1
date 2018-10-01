/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import javax.swing.*;

/**
 *
 * @author gd238947
 */
public class VueGSwing extends VueGraphique{
    
    public void addControleur (Controleur c){
        incr.addActionListener(c);
        decr.addActionListener(c);
    }
    
    public JButton getIncr(){
        return incr;
    }
    
}
