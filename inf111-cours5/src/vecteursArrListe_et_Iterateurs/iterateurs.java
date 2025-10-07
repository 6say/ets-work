package vecteursArrListe_et_Iterateurs;

import referenceThis.CompteBancaire;

import java.util.ArrayList;
import java.util.ListIterator;

public class iterateurs {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> v1 = new ArrayList<>();
        v1.add(new CompteBancaire());
        v1.add(new CompteBancaire());
        v1.add(new CompteBancaire());
        v1.add(new CompteBancaire());
        v1.add(new CompteBancaire());
        v1.add(new CompteBancaire());

        //Pour iterer et afficher
        ListIterator<CompteBancaire> iterateurs = v1.listIterator();
        CompteBancaire cpt;
        while (iterateurs.hasNext()) {
            cpt = iterateurs.next();
            System.out.println("Compte numero "+ cpt.getNumero()
                            +"; Solde : " + cpt.getSolde() + "$");
        }
        //Eviter cette erreur
        /*
        * while (iterateurs.hasNext()) {
        *    System.out.println("Compte numero "+ iterateurs.next()  //print l'element lu
        *                    +"; Solde : " + iterateurs.next() + "$"); //print l'element suivant
        * }
        */
    }
}
