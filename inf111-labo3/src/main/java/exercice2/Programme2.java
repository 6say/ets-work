package exercice2;

import java.lang.reflect.Array;

public class Programme2 {
	public static void main(String[] args) {
		String[] fruits = {"Poires","Figues","Grenadines","Prunes","Mangues",
				"Raisins","Mandarines","Pommes","Melons","Kiwis","Abricots",
				"Bananes","Cerises"};
		//à compléter :

        //Triage
        int i, j, smallest;
        String temp;
        String output1 = "";

        for (i = 0; i < fruits.length - 1; ++i) {
            smallest = i;
            for (j = i + 1; j < fruits.length; j++) {
                if (fruits[j].compareTo(fruits[smallest]) < 0) {
                    smallest = j;
                }
            }
            temp = fruits[smallest];
            fruits[smallest] = fruits[i];
            fruits[i] = temp;
        }


        for (i = 0; i < fruits.length; i++) {
            output1 += fruits[i];
            if (i < fruits.length-1)
                output1 += ";";
        }
        System.out.println("[" + output1 + "]");

	}
}
