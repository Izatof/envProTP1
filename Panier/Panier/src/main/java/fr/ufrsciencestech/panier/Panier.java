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
public class Panier extends Exception {
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
    
    public void ajouterORange(Orange o) throws panierPleinException{
        if(this.capa+1==MAX)
        this.lesOranges.add(o);
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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Panier other = (Panier) obj;
        if (this.MAX != other.MAX) {
            return false;
        }
        if (this.capa != other.capa) {
            return false;
        }
        boolean res=true;
        for(int i = 0; i < this.capa;i++){
            res=res&&(this.lesOranges.get(i)==other.lesOranges.get(i));
        }
        return res;
    }
    
    
}
