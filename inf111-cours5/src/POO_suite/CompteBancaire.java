package POO_suite;

public class CompteBancaire {
    private String numero;
    private String titulaire;
    private double solde;

    //On donne un sens à l'égalité des objets: quand est-ce qu'ils sont égaux ?
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof CompteBancaire) {
            CompteBancaire cpt = (CompteBancaire) obj;
            return this.numero.equals(cpt.numero); //l'égalité est base sur l'identité des objets: leurs numeros de compte dans cas
        } else
            return false;


        //Il est recommender de redefinire hashCode à chaque fois qu'on redéfinit equals, (voir définition)

    }

    //Attributs de classe
    private static double fraisOperation = 2; //Cette attribut n'aura alors pa besoin d'une instance de la classe pour être consulter.
    //voir

}

