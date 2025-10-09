package com.atoudeft.tdas;

public class Palindrome {
    public static boolean isPalindrome(String mot) {
        int taille = mot.length();

        PileStatique ps = new PileStatique(taille);
        FileStatique fs = new FileStatique(taille);
        for (int i = 0; i<mot.length(); i++) {
            ps.empiler(mot.charAt(i));
            fs.enfiler(mot.charAt(i));
        }

        //Comparaison
        for (int i = 0; i<mot.length(); i++) {
            char a = (char) ps.depiler();
            char b = (char) fs.defiler();
            if(a != b) {
                return false;
            }
        }
        return true;
    }
}
