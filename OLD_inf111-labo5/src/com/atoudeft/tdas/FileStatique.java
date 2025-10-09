package com.atoudeft.tdas;

/**
 * Implémente une file d'objets de manière statique (avec un tableau)
 * Stratégie de fonctionnement : FIFO (First In First Out).
 *
 * @author <a href="mailto:Abdelmoumene.Toudeft@etsmtl.ca">A. Toudeft</a>
 * @version 2005
 */
public class FileStatique{

	 private Object[] donnees;  //les données de la file
	 private int premier; 		//indice du premier élément de la file
	 private int dernier; 		//indice de la première case disponible
	 
	 private int nbElement; 	//Nombre d'éléments dans la file (utilisé pour
	 					//ne pas avoir à recalculer le nombre d'éléments dans 
	 					//la méthode taille()). Ne pas oublier de l'incrémenter
	 					//lorsqu'on ajoute et le décrémenter lorsqu'on retire.

    /**
     * Constructeur sans paramètre
     * Crée une file avec une capacité de 10.
     */
    public FileStatique(){
    	
    }

    /**
     * Crée une file de la taille demandée.
     * @param taille La taille voulue pour la file.
     */
    public FileStatique(int taille){
    	
    }

    /**
     * Ajoute un élément à la fin de la file.
     * 
     * @param element l'élément à enfiler.
     * @return true si l'opération réussit et false sinon (file pleine)
     */
    public boolean enfiler(Object element) {
    	
    	return false;
    }

    /**
     * Retire le premier élément de la file.
     * 
     * @return Le premier élément de la file s'il existe ou null sinon.
     */
    public Object defiler(){
    	
    	return null;
    }

    /**
     * Indique si la file est vide.
     * 
     * @return true si la  file est vide et false sinon.
     */
    public boolean estVide(){
       
    	return false;
    }

	 /**
	  * Vide la file.
	  */
	 public void vider(){
		 //Indication : utiliser une boucle while pour defiler la file aussi
		 //longtemps qu'elle n'est pas vide (2 lignes de code).
		 
	 }

    /**
     * Permet de consulter le premier élément de la file sans l'enlever.
     * 
     * @return Le premier élément si la file n'est pas vide et null sinon.
     */
    public Object debut(){

    	return null;
    }


    /**
     * Retourne le nombre d'éléments dans la file.
     * 
     * @return Le nombre d'éléments actuellement dans la file.
     */
    public int taille(){
    	
    	return 0;
    }
}
