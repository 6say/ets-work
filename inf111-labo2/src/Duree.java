import java.util.Scanner;

public class Duree {
    // Attributs
    private int s_duree;

    public int getS_duree() {
        return s_duree;
    }

    public void setS_duree(int s_duree) {
        this.s_duree = s_duree;
    }

    public String convDuree() {
        int hours = s_duree / 3600;
        int minutes = (s_duree % 3600) / 60;
        int seconds = s_duree % 60;

        return (hours + ":" + (minutes + ":" + (seconds)));

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Duree d = new Duree();
        System.out.println("Veuillez entrez la durée en seconde: ");
        d.setS_duree(sc.nextInt());
        System.out.println("Vous avez entré une durée de: " + d.getS_duree() +"\nCela correspond à: " + d.convDuree());

    }
}
