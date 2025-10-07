package vecteursArrListe_et_Iterateurs;

import referenceThis.CompteBancaire;

import java.util.ArrayList;

public class vecteurs {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> v1 ;
        v1 = new ArrayList<>();

        CompteBancaire cp1 = new CompteBancaire();

        //Ajout d'objets, ici seulement de type CompteBancaire
        v1.add(cp1); //OK
        v1.add(new CompteBancaire()); //OK
        //v1.add("Hello"); //NON

        //Pour creer un vectuer qui stocke des données primitives, on utilise les classe envelopes
        ArrayList<Integer> v2 = new ArrayList<>();

        v2.add(new Integer(48));
        v2.add(Integer.valueOf(77));

        //On peut aussi y inserer directement des donnes primitives comme suit:
        v2.add(37); //grace au autoboxing



    }
}
