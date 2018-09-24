package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws prixNegatifException
    {
        Orange o1;
        o1 = new Orange(0.80,"Pérou");
        Orange o2;
        o2 = new Orange(0.75,"Népal");
        Orange o3;
        o3 = new Orange(0.80,"Espagne");
        Panier p1;
        p1 = new Panier(5);
    }
}
