package com.cndiaga.demos;

import com.cndiaga.classes.Client;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("Ceci est une demonstration de la classe client");

        //Declaration d'objet
        Client l_p1, l_p2;

        //Initialisation avec contructeur 1
        l_p1 = new Client();

        //nouvelles variables
        Scanner sc = new Scanner(System.in);
        String l_nom, l_telephone;

        System.out.println("Pour créer un client, entrez son nom: ");
        l_nom = sc.nextLine();
        System.out.println("Entrez son numéro de téléphone: ");
        l_telephone = sc.nextLine();

        l_p2 = new Client(l_nom, l_telephone);

        //Sortie
        System.out.println("Client initial: \n"+l_p1.toString());
        System.out.println("Vous avez créer un client: \n"+l_p2.toString());
    }
}
