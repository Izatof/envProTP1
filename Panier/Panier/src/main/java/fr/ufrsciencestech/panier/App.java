package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Orange o1;
        Orange o2;
        Orange o3;
        Orange o4;
        try {
            o1 = new Orange(0.80,"Pérou");
            o2 = new Orange(0.75,"Népal");
            o3 = new Orange(0.80,"Espagne");
            o4 = new Orange(0.75,"Espagne");
            Panier p1;
            p1 = new Panier(5);
            try {
                p1.ajouterOrange(o1);
                p1.ajouterOrange(o2);
                p1.ajouterOrange(o3);
                p1.ajouterOrange(o4);
            
                System.out.println(p1);
                p1.boycotteOrigine("Népal");        
                System.out.println(p1);
                try{
                    p1.ajouterOrange(o2);
                } catch (panierPleinException ex) {}
                p1.boycotteOrigine("Espagne");
                System.out.println(p1);
            } catch(panierPleinException ex) {}
        } catch (prixNegatifException ex) {}
    }
}
