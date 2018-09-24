/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author gd238947
 */
public class Panier {
    ArrayList<Orange> lesOranges;
    int MAX;
    int capa;

    public Panier( int MAX) {
        this.MAX = MAX;
        this.lesOranges = new ArrayList<Orange>();
        this.capa = 0;
    }
    
    public boolean estVide() {
        return this.capa == 0;
    }
    
    public boolean estPlein() {
        return this.capa == this.MAX;
    }

    @Override
    public String toString() {
        String res="Le panier contient:\n";
        for( Orange o : this.lesOranges ) {
            res+="\t "+o;
        }
        res+="Il reste "+capa+" place dans le panier";
        return res;
    }
    
    
}
