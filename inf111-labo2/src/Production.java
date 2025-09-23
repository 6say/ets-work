import java.util.Scanner;

public class Production {
    private double p_ciment;
    private double p_sable;
    private double p_gravier;
    private double beton;

    public Production(double p_ciment, double p_sable, double p_gravier) {
        this.p_ciment = p_ciment;
        this.p_sable = p_sable;
        this.p_gravier = p_gravier;
    }

    public double getP_ciment() {
        return p_ciment;
    }

    public void setP_ciment(double p_ciment) {
        this.p_ciment = p_ciment;
    }

    public double getP_sable() {
        return p_sable;
    }

    public double getBeton() {
        while(p_gravier >= 1175 && p_sable >= 680 && p_ciment >= 350){
            p_ciment -= 350;
            p_sable -= 680;
            p_gravier -= 1175;
            beton++;
        }
        return beton;
    }

    public void setP_sable(double p_sable) {
        this.p_sable = p_sable;
    }

    public double getP_gravier() {
        return p_gravier;
    }

    public void setP_gravier(double p_gravier) {
        this.p_gravier = p_gravier;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer une quantité de ciment en kg: ");
        double l_ciment = sc.nextDouble();
        System.out.println("Veuillez entrer une quantité de sable en kg: ");
        double l_sable = sc.nextDouble();
        System.out.println("Veuillez entrer une quantié de gravier en kg: ");
        double l_gravier = sc.nextDouble();

        Production p = new Production(l_ciment,l_sable,l_gravier);
        System.out.println("À partir des valeurs que vous avez entrées, vous pouvez produire au plus: " + p.getBeton() + "m³ de béton");
    }
}
