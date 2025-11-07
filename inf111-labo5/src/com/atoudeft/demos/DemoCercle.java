package com.atoudeft.demos;
import com.atoudeft.tdas.Cercle;
import com.atoudeft.tdas.Point;
import java.util.Scanner;

public class DemoCercle {
    public static void main(String[] args) {
        Point centre = new Point(2,4);
        double rayon = 6;
        Cercle cercle = new Cercle(centre,rayon);
        Scanner sc = new Scanner(System.in);
        String menu = "1 - Verifier un point dans le cercle\n2 - Obtenir la surface";
        System.out.println(menu);
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Entrer un point (abscisse puis ordonnee)");
                Point point = new Point(sc.nextDouble(),sc.nextDouble());
                if(cercle.contient(point)) { 
                    System.out.println("Ce point est dans le cercle!");
                }else{
                    System.out.println("Ce point n'est pas dans le cercle!");
                }
                break;

            case 2: 
                System.out.println("La surface du cercle" + cercle.toString() +"est de " + cercle.getSurface() + " unite^2");
        
            default:
                break;
        }
        sc.close();

    }
}
