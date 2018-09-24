/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void ajouterOrange(Orange o) throws panierPleinException{
        if(this.capa+1==MAX)
            throw new panierPleinException();
        else{
            this.lesOranges.add(o);
            this.capa++;
        }
    }
    
    public void retire() throws panierVideException{
        if(this.capa-1==0)
            throw new panierVideException();
        else{
            this.capa--;
            this.lesOranges.remove(this.capa);
        }
    }
    public void retire(Orange o) throws panierVideException{
        if(this.capa-1==0)
            throw new panierVideException();
        else{
            this.capa--;
            this.lesOranges.remove(o);
        }
    }
    
    public double getPrix(){
        double res=0.0;
        for(Orange o : this.lesOranges)
            res+=o.getPrix();
        return res;
    }
    
    public void boycotteOrigine(String origine){
        ArrayList<Orange> temp =new ArrayList<Orange>();
        for(Orange o1 : this.lesOranges){
            if (o1.getOrigine().equals(origine)){
                temp.add(o1);            
            }
        for(Orange o2 : temp)
            try {
                retire(o2);
        } catch (panierVideException ex){};
        }
    }
    
    @Override
    public String toString() {
        String res="Le panier contient:\n";
        for( Orange o : this.lesOranges ) {
            res+="\t "+o+"\n";
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
