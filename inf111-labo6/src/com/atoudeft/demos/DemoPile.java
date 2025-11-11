package com.atoudeft.demos;

import com.atoudeft.tdas.PileChaineeSimple;

public class DemoPile {

	//Ce programme devra fonctionner normalement apr�s l'impl�mentation
	//compl�te de la classe PileStatique :
	public static void main(String[] args) {
		
		PileChaineeSimple pile = new PileChaineeSimple(5);//pile de taille 5
		int valeur;
		
		//On empile 5 �l�ments :
		pile.empiler(59);
		pile.empiler(24);
		pile.empiler(32);
		pile.empiler(41);
		pile.empiler(71);
		
		//Tentative d'empiler un 6e �l�ment (devrait �chouer) :
		if (!pile.empiler(88))
			System.out.println("Pile pleine. 88 non empilé");
		
		//D�piler tous les �l�ments de pile en les affichant ainsi que la taille
		//de la pile :
		while (!pile.estVide()) {
			valeur = (Integer)pile.depiler();
			System.out.println("élément dépilé : "+valeur
							+"; Taille de la pile "+pile.taille());
		}
	}
}
