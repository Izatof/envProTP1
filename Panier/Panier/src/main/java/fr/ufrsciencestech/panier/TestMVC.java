/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author gd238947
 */
public class TestMVC {
    public static void main(String[] args){
        Panier p=new Panier(4);
        VueConsole vc=new VueConsole();
        p.addObserver(vc);
        plop vg=new plop();
        Controleur c=new Controleur();
        c.setP(p);
        c.setVg(vg);
        p.addObserver(vg);
        vg.addControleur(c);
    }
}
