package com.atoudeft.tdas;

/**
 * Impl�mente une pile d'objets de mani�re statique (avec un tableau)
 * Strat�gie de fonctionnement : LIFO (Last In First Out).
 *
 * @author <a href="mailto:Abdelmoumene.Toudeft@etsmtl.ca">A. Toudeft</a>
 * @version 2005
 */

public class PileStatique {

	 private Object[] donnees;  //les donn�es de la file
	 private int sommet; 		//indice de l'�l�ment au sommet de la file

	 @SuppressWarnings("unused")
    private int nbElement; 	//Nombre d'�l�ments dans la pile (utilis� pour
	 					//ne pas avoir � recalculer le nombre d'�l�ments dans
	 					//la m�thode taille()). Ne pas oublier de l'incr�menter
	 					//lorsqu'on empile et le d�cr�menter lorsqu'on d�pile.

   /**
    * Constructeur sans param�tre
    * Cr�e une pile avec une capacit� de 10.
    */
   public PileStatique(){
       donnees = new Object[10];
       sommet = -1;
   }

   /**
    * Cr�e une pile de la taille demand�e.
    * @param taille La taille voulue pour la file.
    */
   public PileStatique(int taille){
       donnees = new Object[taille];
       sommet = -1;

   }

   /**
    * Ajoute un �l�ment au sommet de la pile.
    * 
    * @param element l'�l�ment � empiler.
    * @return true si l'op�ration r�ussit et false sinon (pile pleine)
    */
   public boolean empiler(Object element) {
       if (taille()==donnees.length)
           return false;
       sommet++;
       donnees[sommet] = element;
       nbElement++;
       return true;
   }

   /**
    * Retire l'�l�ment au sommet de la pile.
    * 
    * @return L'�l�ment au sommet de la pile s'il existe ou null sinon.
    */
   public Object depiler(){
       if (estVide())
           return null;
       Object temp = donnees[sommet];
       donnees[sommet] = null;
       sommet--;
       nbElement--;
       return temp;
   }

   /**
    * Indique si la pile est vide.
    * 
    * @return true si la  pile est vide et false sinon.
    */
   public boolean estVide(){
       return sommet<0;
   }

	 /**
	  * Vide la pile.
	  */
	 public void vider(){
		 //Indication : utiliser une boucle while pour depiler la pile aussi
		 //longtemps qu'elle n'est pas vide (2 lignes de code).
         while (!estVide())
             depiler();
	 }

   /**
    * Permet de consulter l'�l�ment au sommet de la pile sans l'enlever.
    * 
    * @return L'�l�ment au sommet si la pile n'est pas vide et null sinon.
    */
   public Object peek(){

   	return null;
   }


   /**
    * Retourne le nombre d'�l�ments dans la pile.
    * 
    * @return Le nombre d'�l�ments actuellement dans la pile.
    */
   public int taille(){
   	if (!estVide()){
           return sommet+1;
    }
   	return 0;
   }
}
