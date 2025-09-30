package com.cndiaga.demos;
import com.cndiaga.classes.Produits;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        System.out.println("Ceci est une demonstration de la classe produit");

        //Declaration d'objet
        Produits l_p1, l_p2, l_p3;

        //Initiation par constructeur 1
        l_p1 = new Produits();
        System.out.println("Produit initial: "  + l_p1.toString());


        //nouvelle variables
        Scanner sc = new Scanner(System.in);
        String l_reference, l_designation;
        double l_prixUn;

        System.out.print("La reference: ");
        l_reference = sc.nextLine();
        System.out.print("La designation: ");
        l_designation = sc.nextLine();
        System.out.print("La prixUn: ");
        l_prixUn = sc.nextDouble();
        sc.nextLine();

        //Intiation par constructeur 2
        l_p2 = new Produits(l_reference, l_designation, l_prixUn);
        //Inititiation par constructeur 3
        l_p3 = new Produits(l_reference, l_designation, l_prixUn);

        System.out.println("Vous avez creer deux produits.\n" + l_p2.toString() + "\n" + l_p3.toString());

        System.out.println("Le test d'égalité entre le produit initial et votre produit 1 retourne: " + l_p1.egaliteProduit(l_p2));
        System.out.println("Le test d'égalité entre vos produits retourne : " + l_p2.egaliteProduit(l_p3));






    }
}
