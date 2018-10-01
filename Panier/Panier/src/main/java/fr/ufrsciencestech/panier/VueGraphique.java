/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author gd238947
 */
public class VueGraphique implements Observer {
    JButton incr,decr;
    JLabel label;
    public VueGraphique(){
        incr=new JButton();
        decr=new JButton();
        System.out.println("valeur initiale "+0);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Nouvelle valeur " + ((Integer)arg).toString()); //To change body of generated methods, choose Tools | Templates.
    }    
}
