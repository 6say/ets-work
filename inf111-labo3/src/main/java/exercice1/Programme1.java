package exercice1;

import java.util.Locale;
import java.util.Scanner;

public class
Programme1 {

    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        ListeNotes liste1 = new ListeNotes();
        char choix;

        clavier.useLocale(Locale.ENGLISH);

        choix = menu();
        while (choix != 'q') {
            switch (choix) {
                case 'l' : //affichage de la liste des notes
                    System.out.println("Liste des notes : "+liste1);
                    break;
                case 'm' : //moyenne des notes
                    System.out.println("Moyenne des notes : "+liste1.getMoyenne());
                    break;
                case 'p' : //plus petite note
                    System.out.println("Plus petite note : "+liste1.getMinimum());
                    break;
                case 'v' : //rechercher des notes d'un intervalle
                    System.out.println("=> Rechercher des notes d'un intervalle.");
                    break;
                case 't' : //tri
                    liste1.trier();
                    break;
                case 'r' : //recherche de notes
                    System.out.println("=> Recherche de note.");
                    break;
                case 'c' : //changer de liste de notes
                    System.out.println("=> Changer de liste.");
                    break;
                case 'i' : //insérer des notes
                    System.out.println("=> Insérer des notes.");
                    break;
                default :
                    System.out.println("Choix invalide.");
            }
            choix = menu();
        }
        System.out.println("Bye Bye !");
    }
    private static char menu() {
        System.out.println("\n\n\tl. Afficher la liste de notes");
        System.out.println("\tm. Afficher la moyenne des notes");
        System.out.println("\tp. Afficher la plus petite note");
        System.out.println("\tv. Afficher notes par intervalle");
        System.out.println("\tt. Trier la liste de notes");
        System.out.println("\tr. Rechercher une note");
        System.out.println("\tc. Changer de liste de notes");
        System.out.println("\ti. Insérer des notes");
        System.out.println("\tq. Quitter");

        System.out.print("\n\t\tVotre choix :");
        String rep = clavier.nextLine();
        char choix;
        if (rep.length()>0)
            choix = rep.charAt(0);
        else
            choix = 'x';
        return choix;
    }
}