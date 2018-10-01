/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author gd238947
 */
public class Controleur implements ActionListener{

    Panier p;
    VueGSwing vg;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b==vg.getIncr())
            System.out.print("plop");
    }

    public void setP(Panier p) {
        this.p = p;
    }

    public void setVg(VueGSwing vg) {
        this.vg = vg;
    }
    
}
