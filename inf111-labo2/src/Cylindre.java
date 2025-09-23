import java.util.Scanner;

public class Cylindre {
    // Attributs
    private double rayon;
    private double hateur;


    public double getRayon() {
        return rayon;
    }

    public double getHateur() {
        return hateur;
    }


    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void setHateur(double hateur) {
        this.hateur = hateur;
    }

    public double getVolume() {
        return Math.PI * Math.pow(rayon, 2) * hateur;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylindre cylindre = new Cylindre();

        System.out.print("Enter Rayon: ");
        cylindre.setRayon(sc.nextDouble());
        System.out.print("Enter Hateur: ");
        cylindre.setHateur(sc.nextDouble());

        System.out.println("Vous avez crée un cylindre de rayon " + cylindre.getRayon() + "cm et de haueur " + cylindre.getHateur());
        System.out.println("Son volume est de: " + cylindre.getVolume() + "cm³");
    }
}

