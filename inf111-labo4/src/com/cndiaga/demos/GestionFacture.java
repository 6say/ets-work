package com.cndiaga.demos;

import com.cndiaga.classes.Facture;
import com.cndiaga.classes.LigneFacture;
import com.cndiaga.classes.Produit;

import java.util.Scanner;

public class GestionFacture {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String l_nom, l_telephone;
        String l_refProd, l_desProd;
        Produit l_prod;
        double l_prix;
        int l_nbreArticle, l_qteProd;
        Facture facture;


        System.out.println("Le nom est :");
        l_nom = sc.nextLine();
        System.out.println("Le telephone est :");
        l_telephone = sc.nextLine();
        System.out.println("Le nbreArticle est :");
        l_nbreArticle = sc.nextInt();
        sc.nextLine();

        facture = new Facture(l_nom, l_telephone, l_nbreArticle);

        char choix = menu();
        while (choix != 'q') {
            switch (choix) {
                case 'a':
                    System.out.println(facture.toString());
                    break;
                case '+':
                    System.out.println("Infos sur la ligne-facture : ");
                    System.out.print("\tNuméro produit : ");
                    l_refProd = sc.nextLine();
                    System.out.print("\tNom produit : ");
                    l_desProd = sc.nextLine();
                    System.out.print("\tPrix produit : ");
                    l_prix = sc.nextDouble();
                    System.out.print("\tQuantité vendue : ");
                    l_qteProd = sc.nextInt();
                    sc.nextLine();

                    l_prod = new Produit(l_refProd, l_desProd, l_prix);
                    LigneFacture ligne = new LigneFacture(l_prod, l_qteProd);

                    if (!facture.ajouteLigne(ligne))
                        System.out.println("Plus de place dans la facture");
                    break;
                case '-':
                    System.out.print("Num du produit à supprimer : ");
                    String np = sc.nextLine();
                    if (!facture.supprimeLigne(np))
                        System.out.println("Numéro " + np + " introuvable dans la facture");
                    break;
                case 't':
                    facture.trier();
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
            choix = menu();
        }
    }

    private static char menu() {
        System.out.println("\n\n\ta. Afficher la facture");
        System.out.println("\t+. Ajouter un article à la facture");
        System.out.println("\t-. Supprimer un article de la facture");
        System.out.println("\tt. Trier la facture");
        System.out.println("\tq. Quitter");

        System.out.print("\n\t\tVotre choix :");
        String rep = sc.nextLine();
        char choix;
        if (rep.length()>0)
            choix = rep.charAt(0);
        else
            choix = 'x';
        return choix;
    }


}
