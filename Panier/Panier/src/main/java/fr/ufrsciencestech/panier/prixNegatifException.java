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
public class prixNegatifException extends Exception{
    

    public prixNegatifException(){
        System.out.println("Le prix ne peut être négatif!!");
    }
    
}
