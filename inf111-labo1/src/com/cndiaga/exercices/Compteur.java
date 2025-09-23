package com.cndiaga.exercices;

public class Compteur {
	private int valeur;

	public Compteur() {
		valeur = 0;
	}
	public Compteur(int valeur) {
		this.valeur = valeur ;
	}

    public void comptUp() {
		valeur++ ;
	}
	public void comptDown() {
		valeur-- ;
	}
	public void comptZero() {
		valeur = 0;
	}
	public int getValeur() {
		return valeur;
	}


    public static void main (String []args) {

        Compteur compt1, compt2, compt3;

        compt1 = new Compteur(10);
        compt2 = new Compteur(10);
        compt3 = new Compteur(10);

        System.out.println("Situation initiale: \nCompteur 1: " + compt1.getValeur()+ "\nCompteur 2: " + compt2.getValeur()+  "\nCompteur 3: " + compt3.getValeur());

        compt1.comptUp();
        System.out.println("\nCompteur 1 a été incrémenté de 1.");
        compt2.comptDown();
        System.out.println("Compteur 2 a été Décrémenté de 1.");
        compt3.comptZero();
        System.out.println("Compteur 3 a été remis à 0.");

        System.out.println("\nSituation finale: \nCompteur 1: " + compt1.getValeur()+ "\nCompteur 2: " + compt2.getValeur()+  "\nCompteur 3: " + compt3.getValeur());

    }
	


	

}