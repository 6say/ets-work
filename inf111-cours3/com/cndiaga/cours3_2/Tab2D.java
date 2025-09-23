import java.util.Arrays;

public class Tab2D {
    public static void main(String[] args) {
        double [][] matrice = new double[6][4];

        for (int j=0;j<6;j++){
            for(int k=0;k<4;k++){
                matrice[j][k] = Math.round(Math.random() * 100);
                System.out.println(matrice[j][k]);
            }
        }

        for (int i=0;i<6;i++) {

            System.out.println(Arrays.toString(matrice[i])); //print les valeurs attendues
            //System.out.print(matrice[i] + "\t"); // ne print pas les valeurs attaendues
        }

    }
}
