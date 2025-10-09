package com.atoudeft.tdas;

/**
 * Implémente une pile d'objets de manière statique (avec un tableau)
 * Stratégie de fonctionnement : LIFO (Last In First Out).
 *
 * @author <a href="mailto:Abdelmoumene.Toudeft@etsmtl.ca">A. Toudeft</a>
 * @version 2005
 */

public class PileStatique {

	 private Object[] donnees;  //les données de la file
	 private int sommet; 		//indice de l'élément au sommet de la file
	 
	 private int nbElement; 	//Nombre d'éléments dans la pile (utilisé pour
	 					//ne pas avoir à recalculer le nombre d'éléments dans 
	 					//la méthode taille()). Ne pas oublier de l'incrémenter
	 					//lorsqu'on empile et le décrémenter lorsqu'on dépile.

   /**
    * Constructeur sans paramètre
    * Crée une pile avec une capacité de 10.
    */
   public PileStatique(){
   	
   }

   /**
    * Crée une pile de la taille demandée.
    * @param taille La taille voulue pour la file.
    */
   public PileStatique(int taille){
   	
   }

   /**
    * Ajoute un élément au sommet de la pile.
    * 
    * @param element l'élément à empiler.
    * @return true si l'opération réussit et false sinon (pile pleine)
    */
   public boolean empiler(Object element) {
   	
   	return false;
   }

   /**
    * Retire l'élément au sommet de la pile.
    * 
    * @return L'élément au sommet de la pile s'il existe ou null sinon.
    */
   public Object depiler(){
   	
   	return null;
   }

   /**
    * Indique si la pile est vide.
    * 
    * @return true si la  pile est vide et false sinon.
    */
   public boolean estVide(){
      
   	return false;
   }

	 /**
	  * Vide la pile.
	  */
	 public void vider(){
		 //Indication : utiliser une boucle while pour depiler la pile aussi
		 //longtemps qu'elle n'est pas vide (2 lignes de code).
		 
	 }

   /**
    * Permet de consulter l'élément au sommet de la pile sans l'enlever.
    * 
    * @return L'élément au sommet si la pile n'est pas vide et null sinon.
    */
   public Object peek(){

   	return null;
   }


   /**
    * Retourne le nombre d'éléments dans la pile.
    * 
    * @return Le nombre d'éléments actuellement dans la pile.
    */
   public int taille(){
   	
   	return 0;
   }
}
