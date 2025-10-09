package com.atoudeft.demos;

import com.atoudeft.tdas.Palindrome;

import java.util.Scanner;

public class DemoPalindrome {
    public static void main(String[] args){
        String mot = "";
        String choix = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER pour verifier un palindrome");
        choix = sc.nextLine();

        while(!choix.equals("q")){
            System.out.println("Entrez un mot:");
            mot = sc.nextLine();

            if(!Palindrome.isPalindrome(mot)){
                System.out.println("Ce n'est pas un palindrome :(");
            }else {
                System.out.println("C'est un palindrome :)");
            }
            choix = sc.nextLine();

        }

    }
}
