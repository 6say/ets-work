package exercice1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ListeNotes {
    private double[] notes;
    private boolean trie = false;
    /**
     * Crée une ListeNotes contenant un tableau de notes par défaut.
     */
    public ListeNotes() {
        notes = new double[]{85.0,59.4,78.3,48.6,77.5,92.1,64.8,55.25,36.75,90.25};
    }
    /**
     * Crée une ListeNotes contenant le tableau reçu en paramètre.
     * @param valeurs tableau servant à initialiser le tableau de notes
     */
    public ListeNotes(double[] valeurs) {
        throw new NotImplementedException();
    }
    /**
     * Retourne chaine contenant les notes du tableau séparées par un point-virgule. La chaine est délimitée par des
     * crochets.
     * @return chaine contenant les notes du tableau de notes
     */
    @Override
    public String toString() {
        String str = ""; //Chaine à construire
        for (int i = 0; i < notes.length; ++i) {
            str += notes[i] + ";";
        }
        return "["+str+"]";
    }
    /**
     * Retourne la moyenne des notes du tableau de notes.
     * @return la moyenne des notes du tableau de notes
     */
    public double getMoyenne() {
        //throw new NotImplementedException();
        double somme = 0;
        for (int i = 0; i< notes.length; i++) {
            somme += notes[i];
        }
        return somme/notes.length;
    }
    /**
     * Retourne la plus petite valeur du tableau de notes
     * @return la plus petite valeur du tableau de notes
     */
    public double getMinimum() {
        //throw new NotImplementedException();
        double temp;
        int min = 0;
        for (int i = 0; i < notes.length; ++i) {
            min = i;
            for (int j = i + 1; j < notes.length; j++) {
                if (notes[j] < notes[min]) {
                    min = j;
                }
            }
            temp = notes[min];
            notes[min] = notes[i];
            notes[i] = temp;
        }
        return notes[0];
    }
    /**
     * Retourne un tableau contenant toutes les notes entre un minimum et un maximum. Le tableau retourné ne doit pas
     * contenir des cases vides.
     * @param min la note minimale
     * @param max la note maximale
     * @return tableau contenant toutes les notes du tableau comprises entre min et max, inclusivement
     */
    public double[] getNotesParIntervalle(double min, double max) {
        //throw new NotImplementedException();
        double [] intervalle = new double[];
        for  (int i = 0; i < notes.length; ++i) {
            if (notes[i] <= min && notes[i] >= max) {
                intervalle[i] = notes[i];
            }
        }
        System.out.println(intervalle.toString());
    }
    /**
     * Trie le tableau des notes par ordre croissant
     */
    public void trier() {
        //Utilise le tri par sélection ou le tri par insertion.
        throw new NotImplementedException();
    }
    /**
     * Recherche une note dans le tableau de notes et retourne le plus petit indice de case la contenant. Cette méthode
     * vérifie si le tableau est trié, elle effectue une recherche binaire. Sinon, elle effectue une recherche séquentielle.
     * @param note  la note à chercher
     * @return le plus petit indice de case contenant la note, si la note existe dans le tableau de notes. Retourne -1,
     *          si la note n'existe pas dans le tableau
     */
    public int getIndice(double note) {
        throw new NotImplementedException();
    }
    /**
     * Insère une nouvelle note à une position spécifique. La dernière note est retirée du tableau et retournée.
     * @param v la nouvelle note à insérer
     * @param position indice à partir de laquelle seront insérées les notes
     * @return la note retirée du tableau
     */
    public double inserer(double v, int position) {
        throw new NotImplementedException();
    }
    /**
     * Insère une liste de notes à une position spécifique.
     * @param t tableau contenant les notes à insérer
     * @param position indice à partir de laquelle seront insérées les notes
     * @return tableau contenant toutes les notes retirées du tableau
     */
    public double[] inserer(double[] t, int position) {
        //Cette méthode doit utiliser la méthode inserer() précédente.
        throw new NotImplementedException();
    }
}