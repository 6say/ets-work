package com.atoudeft.demos;

import com.atoudeft.tdas.Palindrome;

import java.util.Scanner;

public class DemoPalindrome {
    public static void main(String[] args){
        String mot = "";
        String choix = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER pour verifier un palindrome, q pour quitter");
        choix = sc.nextLine();

        while(!choix.equals("q")){
            System.out.println("Entrez un mot:");
            mot = sc.nextLine();

            if(!Palindrome.isPalindrome(mot)){
                System.out.println("Ce n'est pas un palindrome :(\nENTER pour verifier un autre palindrome, q pour quitter");
            }else {
                System.out.println("C'est un palindrome :)\nENTER pour verifier un autre palindrome, q pour quitter");
            }
            choix = sc.nextLine();

        }
        sc.close();

    }
}
