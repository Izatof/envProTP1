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
    plop vg;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        try{
            if(b==vg.getIncr())
                p.ajouterOrange(new Orange(1.00,"France"));
            else 
                p.retire();
        }catch(Exception ex){}
    }

    public void setP(Panier p) {
        this.p = p;
    }

    public void setVg(plop vg) {
        this.vg = vg;
    }
    
}
