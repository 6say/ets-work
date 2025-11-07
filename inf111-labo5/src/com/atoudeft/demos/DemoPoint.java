package com.atoudeft.demos;
import com.atoudeft.tdas.Point;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double abs;
        double ord;
        ArrayList <Point>points = new ArrayList<Point>();
        
        String poString = "";
        
        String menu = "\t\t\tCreation de point\n" 
                        + "\t0 - Creer un point (0,0)\n"
                        + "\t1 - Entrer une abscisse\n"
                        + "\t2 - Entrer une odonnee\n"
                        + "Entrez un choix : ";

        int choix1 = 1;
        while (choix1 == 1) {
            System.out.print(menu);
            int choix2 = sc.nextInt();
            sc.nextLine();
            //creation de points
            switch (choix2){
                case 0:
                    points.add(new Point());
                    break;
                case 1:
                    System.out.print("Entrez une abscisse: ");
                    abs = sc.nextDouble();
                    points.add(new Point(abs));
                    break;
                    case 2:
                    System.out.print("Entrez une abscisse: ");
                    abs = sc.nextDouble();
                    System.out.print("Entrez une ordonnee: ");
                    ord = sc.nextDouble();
                    points.add(new Point(abs,ord));
                default:
                    break;
            }

            System.out.println("Vos points: ");            
            for (Point point : points) {
                System.out.println(points.indexOf(point) + point.toString());

                
            }
            System.out.println("Entrer 1 pour creer un autre point et 0 pour quitter");
            choix1 = sc.nextInt();
        }
        
        String menu2 = "1 - Distance entre deux points"
                        +"\n2 - Distance à l'origine"
                        +"\nFaites un choix de calcul";
        System.out.println(menu2);
        int choix3 = sc.nextInt();

        switch (choix3) {
            case 1:
                System.out.print("Entrer le choix du premier point: ");
                Point p1  = points.get(sc.nextInt());
                System.out.print("Entrez le choix du deuxième point: ");
                Point p2  = points.get(sc.nextInt());
                System.out.println("La distance entre " + p1.toString() + "&" + p2.toString() + "est de: "  + p1.dist(p2));
                break;
            case 2:
                System.out.print("Entrer le choix du point: ");
                Point p = points.get(sc.nextInt());
                System.out.println("La distance entre " + p.toString() + "& l'origine est de: "  + p.dist());    
                break;
            default:
                break;
        }
        
        sc.close();
    }    
}
