package com.cndiaga.demos;

import com.cndiaga.classes.Facture;
import com.cndiaga.classes.LigneFacture;
import com.cndiaga.classes.Produit;

public class Exercice5_facture {
    public static void main(String[] args) {
        System.out.println("Ceci est une demonstration de la classe facture");

        //Declare et initialise une instance de Facture
        Facture l_f0 = new Facture("John Doe","1234567890",1);
        l_f0.ajouteLigne(new LigneFacture(new Produit("4503278", "Eau", 2.00)));
        //Affichage inititial
        System.out.println(l_f0.toString());


        Facture l_f1 = new Facture(5);


        //Affichage apres ajouts de ligne

        Produit [] listeAjoutsProduit =  new Produit [5]; //max est plus elevé que la limte de ligne pour tester l'ajout quand il n'y a plus de place
        listeAjoutsProduit[0] = new Produit("65479352","Lait",7.50);
        listeAjoutsProduit[1] = new Produit("65463352","Pain",6.50);
        listeAjoutsProduit[2] = new Produit("65426852","Café",2.50);
        listeAjoutsProduit[3] = new Produit("65490752","Sucre",4.36);
        listeAjoutsProduit[4] = new Produit("65400052","Fruits",13.49);

        LigneFacture [] ligneAjoutees = new LigneFacture[6];
        for (int i = 0; i < listeAjoutsProduit.length; i++) {
            ligneAjoutees[i] = new LigneFacture(listeAjoutsProduit[i]);
        }
        ligneAjoutees[5] = new LigneFacture(new Produit("65400052","Legumes",13.49));

        int ligne = 0;
        while(ligne < ligneAjoutees.length) {
            l_f1.ajouteLigne(ligneAjoutees[ligne]);
            ligne++;
        }
        System.out.println("Affichage aprés ajouts");
        System.out.println(l_f1.toString());


        //Affichage suppression de ligne
        if (l_f1.supprimeLigne("65400052")){
            System.out.println("La ligne a eté supprimée.");
        }else{
            System.out.println("Cette ligne n'a pas été trouvée : ");
        }
        System.out.println("Affichage aprés suppression");
        System.out.println(l_f1.toString());

        //Affichage aprés triage
        l_f1.trier();
        System.out.println("Affichage aprés triage");
        System.out.println(l_f1.toString());

        //Affichage aprés calcul de Taxes
        l_f1.calculerTaxes();
        System.out.println("Affichage aprés alcul de Taxes");
        System.out.println(l_f1.toString() + "\n" +
                "-----TOTAUX-----\n" +
                "TPS = " + l_f1.getTPS() +"\n" +
                "TVQ = " + l_f1.getTVQ() +"\n" +
                "Total taxes = " + l_f1.getTotalTaxes() +"\n" +
                "Total avant taxes = " + l_f1.getMontantHorsTaxe() + "\n" +
                "Total aprés taxes = " + l_f1.getMontantTaxesInclus()
        );







    }
}
