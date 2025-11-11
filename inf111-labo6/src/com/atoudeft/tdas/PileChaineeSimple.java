package com.atoudeft.tdas;

/**
 * Impl�mente une pile d'objets de mani�re dynamique (chainage simple)
 * Strat�gie de fonctionnement : LIFO (Last In First Out).
 *
 * @author <a href="mailto:Abdelmoumene.Toudeft@etsmtl.ca">A. Toudeft</a>
 * @version 2005
 */

public class PileChaineeSimple {

	private Noeud sommet; 		//r�f�rence l'�l�ment au sommet de la file
	private int taille;
	private int nbElement; 	//Nombre d'�l�ments dans la pile (utilis� pour
						//ne pas avoir � recalculer le nombre d'�l�ments dans 
						//la m�thode taille()). Ne pas oublier de l'incr�menter
						//lorsqu'on empile et le d�cr�menter lorsqu'on d�pile.

	/**
	 * Constructeur sans param�tre
	 * Initialise la r�f�rence premier � null et nbElement � 0.
	 */
	public PileChaineeSimple(){
		sommet = null;
		nbElement = 0;
	}

	/**
	 * Cr�e une pile de la m�me fa�on que le premier constructeur.
     * Ce constructeur est laiss� l� juste pour que les programmes d�j� �crits
     * avec le version statique de la pile continuent de fonctionner.
	 * @param taille La taille voulue pour la file.
	 */
	public PileChaineeSimple(int taille){
		this();
		this.taille = taille;
	}

	/**
	 * Ajoute un �l�ment au sommet de la pile.
	 * 
	 * @param element l'�l�ment � empiler.
	 * @return true si l'op�ration r�ussit et false sinon (ce qui n'arrive jamais)
	 */
	public boolean empiler(Object element) {
		Noeud nouveau = new Noeud(sommet,element);
		this.sommet = nouveau;
		this.nbElement++;
		return true;
	}

	/**
	 * Retire l'�l�ment au sommet de la pile.
	 * 
	 * @return L'�l�ment au sommet de la pile s'il existe ou null sinon.
	 */
	public Object depiler(){
		if(estVide())
		return null;

		Noeud temp = sommet;
		sommet = temp.suivant;
		nbElement--;

		return temp.donnee;
	}

	/**
	 * Indique si la pile est vide.
	 * 
	 * @return true si la  pile est vide et false sinon.
	 */
	public boolean estVide(){

		return nbElement == 0;
	}

	/**
	 * Vide la pile.
	 */
	public void vider(){
		while (!estVide())
			depiler();
	}

	/**
	 * Permet de consulter l'�l�ment au sommet de la pile sans l'enlever.
	 * 
	 * @return L'�l�ment au sommet si la pile n'est pas vide et null sinon.
	 */
	public Object peek(){
		if(estVide())
		return null;

		return this.sommet.donnee;
	}


	/**
	 * Retourne le nombre d'�l�ments dans la pile.
	 * 
	 * @return Le nombre d'�l�ments actuellement dans la pile.
	 */
	public int taille(){

		return nbElement;
	}

	private class Noeud {
		public Object donnee;
		public Noeud suivant;

		public Noeud(Noeud next, Object data) {
			this.donnee = data;
			this.suivant = next;
		}
	}
}