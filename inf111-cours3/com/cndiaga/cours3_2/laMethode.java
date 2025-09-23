public class laMethode {
    public static void main(String[] args) {
        //Une methode peut retourner un seule resultat
        double rayon, hauteur,
                rayon2, hauteur2, volume1, volume2;
        rayon = 8;
        hauteur = 12;
        rayon2 = 5;
        hauteur2 = 10;
        volume1 = calculVolume(rayon, hauteur);
        System.out.println("Le volume 1 est " + volume1);
        volume2 = calculVolume(rayon2, hauteur2);
        System.out.println("Le volume 2 est " + volume2);
        System.out.println("Volume total : " + (volume1 + volume2));
    }

    public static double calculVolume(double ray, double height) {
        double volumeCylindre;
        //Calcul du volume du cylindre :
        volumeCylindre = Math.PI * Math.pow(ray, 2) * height;
        //Retour du volume du cylindre :
        return volumeCylindre; //retour de résultat

    }
}



