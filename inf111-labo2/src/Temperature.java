import java.util.Scanner;

public class Temperature {
    // Attributs
    private final double valeurCelsius;

    public Temperature(double valeurCelsius) {
        this.valeurCelsius = valeurCelsius;
    }

    public double getValeurCelsius() {
        return valeurCelsius;
    }

    public double convFarenheit() {
        return valeurCelsius*1.8+32;
    }

    public static void main(String[] args) {
        //Declaration
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez une temperature en celsius: ");
        double l_valeurCelsius = sc.nextDouble();
        Temperature temperature = new Temperature(l_valeurCelsius);
        System.out.println("Vous avez entré:  " + temperature.getValeurCelsius() + "ºC");
        System.out.println("Cela correspond à: " + temperature.convFarenheit() + "ºF");

    }
}
