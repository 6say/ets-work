package com.cndiaga.cours3;

import java.util.Arrays;

public class test {

    //Par insertion
    static void triParInsertion(int tab[]) {
        int i, j, temp;
        for (i = 1 ;i < tab.length; ++i) {
            temp = tab[i];
            for (j = i; j > 0 && tab[j - 1] > temp; j--) {
                tab[j] = tab[j - 1];
            }
            tab[j] = temp;
        }
    }

    public static void main (String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; ++i) {
            numeros[i] = (int) Math.round(Math.random()*100);
        }


        triParInsertion(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}