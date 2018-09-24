/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Objects;

/**
 *
 * @author gd238947
 */
public class Orange {
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

    @Override
    public String toString() {
        return "Orange{" + "prix=" + prix + ", origine=" + origine + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Orange other = (Orange) obj;
        if (Double.doubleToLongBits(this.prix) != Double.doubleToLongBits(other.prix)) {
            return false;
        }
        if (!Objects.equals(this.origine, other.origine)) {
            return false;
        }
        return true;
    }
}
