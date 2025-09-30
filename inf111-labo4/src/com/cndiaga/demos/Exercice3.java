package com.cndiaga.demos;
import  com.cndiaga.classes.LigneFacture;
import com.cndiaga.classes.Produit;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {

        System.out.println("Ceci est une demonstration de la classe client");

        //Declarations
        LigneFacture l_lf1, l_lf2;
        Scanner sc = new Scanner(System.in);
        Produit l_produit1 =  new Produit();
        int l_quantite;
        String l_reference;
        String l_designation;

        System.out.println("Entrez le nom du produit: ");
        l_designation = sc.nextLine();
        System.out.println("Entrez la réference du produit: ");
        l_reference = sc.nextLine();
        System.out.println("Entrez le quantite du produit: ");
        l_quantite = sc.nextInt();
        sc.nextLine();

        l_produit1.setDesignation(l_designation);
        l_produit1.setReference(l_reference);

        //initialise une instance d'objet LigneFacture avec constructeur 1
        l_lf1 = new LigneFacture(l_produit1, l_quantite);

        //initialise une instance d'objet LigneFacture avec constructeur 2
        l_lf2 = new LigneFacture(l_produit1);

        System.out.println("Vous avez crée deux produits: \n" + l_lf1.toString() + "\n" +  l_lf2.toString());

        System.out.println("Votre total est de: " + (l_lf1.calculerTotal() + l_lf2.calculerTotal()) + " $");
    }
}
