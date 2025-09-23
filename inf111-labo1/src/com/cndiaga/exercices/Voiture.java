package com.cndiaga.exercices;

public class  Voiture {
    private final String numero;
    private int position;
    private Compteur compteur;

    public Voiture(String numero) {
        this.numero = numero;
        position = 0;
        compteur = new Compteur(0);
    }

    //GETTER
    public String getNum() {
        return numero;
    }

    public int getPos() {
        return position;
    }


    //Methodes
    public void avancer(int distance) {
        position += distance;
        for (int i = 0; i<distance; i++) {
            compteur.comptUp();
        }
    }

    public void reculer(int distance) {
        position -= distance;
        for (int i = 0; i<distance; i++) {
            compteur.comptUp();
        }
    }


    public static void main(String[] args) {
        Voiture v1 = new Voiture("ABC123");


        System.out.println("Nouvelle voiture: \nImmatriculation " + v1.getNum() + "\nPosition: " + v1.getPos() + "\nCompteur: " + v1.compteur.getValeur());
        v1.avancer(335);
        System.out.println("La voiture a avancé: \nImmatriculation " + v1.getNum() + "\nPosition: " + v1.getPos() + "\nCompteur: " + v1.compteur.getValeur());
        v1.reculer(54);
        System.out.println("La voiture a reculé: \nImmatriculation " + v1.getNum() + "\nPosition: " + v1.getPos() + "\nCompteur: " + v1.compteur.getValeur());

    }


}