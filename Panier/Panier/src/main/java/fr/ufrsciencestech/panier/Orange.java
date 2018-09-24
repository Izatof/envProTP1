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
public class Orange extends Exception {
    double prix;
    String origine;
    
    public Orange(double prix, String origine)
            throws prixNegatifException{
        
        if(prix<0) {
            throw new prixNegatifException();
        }
        else{
            this.prix = prix;
            this.origine = origine;
        }
        
    }

    public double getPrix() {
        return prix;
    }

    public String getOrigine() {
        return origine;
    }
}
