package com.atoudeft.tdas;

/**
 * Impl�mente une file d'objets de mani�re dynamique (chainage simple)
 * Strat�gie de fonctionnement : FIFO (First In First Out).
 *
 * @author <a href="mailto:Abdelmoumene.Toudeft@etsmtl.ca">A. Toudeft</a>
 * @version 2005
 */
public class FileChaineeSimple{

	 private Noeud premier; 		//r�f�rence le premier �l�ment de la file
	 private Noeud dernier; 		//r�f�rence le dernier �l�ment de la file
	 private int taille;
	 private int nbElement; 	//Nombre d'�l�ments dans la file (utilis� pour
	 					//ne pas avoir � recalculer le nombre d'�l�ments dans 
	 					//la m�thode taille()). Ne pas oublier de l'incr�menter
	 					//lorsqu'on ajoute et le d�cr�menter lorsqu'on retire.

    /**
     * Constructeur sans param�tre
     * Initialise les r�f�rences premier et dernier � null et nbElement � 0.
     */
    public FileChaineeSimple(){
    	premier = dernier = null;
      nbElement = 0;
    }

    /**
     * Cr�e une file de la m�me fa�on que le premier constructeur.
     * Ce constructeur est laiss� l� juste pour que les programmes d�j� �crits
     * avec le version statique de la file continuent de fonctionner.
     * @param taille La taille voulue pour la file.
     * 
     */
    public FileChaineeSimple(int taille){
    	this();
      this.taille = taille;
    }

    /**
     * Ajoute un �l�ment � la fin de la file.
     * 
     * @param element l'�l�ment � enfiler.
     * @return true si l'op�ration r�ussit et false sinon (ce qui n'arrive jamais)
     */
    public boolean enfiler(Object element) {
      if(nbElement <= taille) {
        Noeud n = new Noeud(null, element);
        if(dernier == null){
          premier = dernier = n;
          return true;
        }
        Noeud temp = dernier;
        dernier = temp.suivant = n;     
        nbElement++;
        return true;
      }else{
        return false;
      }
    }

    /**
     * Retire le premier �l�ment de la file.
     * 
     * @return Le premier �l�ment de la file s'il existe ou null sinon.
     */
    public Object defiler(){
      if(estVide()){
        return null;
      }
      Noeud temp = premier;
    	premier = premier.suivant;
      nbElement--;
    	return temp.donnee;
    }

    /**
     * Indique si la file est vide.
     * 
     * @return true si la  file est vide et false sinon.
     */
    public boolean estVide(){
       
    	return nbElement == 0;
    }

	 /**
	  * Vide la file.
	  */
	 public void vider(){
		 while (!estVide())
			 defiler();		 
	 }

    /**
     * Permet de consulter le premier �l�ment de la file sans l'enlever.
     * 
     * @return Le premier �l�ment si la file n'est pas vide et null sinon.
     */
    public Object debut(){ 
      if(estVide())
    	return null;

      return premier.donnee;
    }


    /**
     * Retourne le nombre d'�l�ments dans la file.
     * 
     * @return Le nombre d'�l�ments actuellement dans la file.
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
