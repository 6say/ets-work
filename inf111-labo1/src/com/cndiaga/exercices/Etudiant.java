package com.cndiaga.exercices;

import java.util.Scanner;

public class Etudiant {
	
    private String numero;
    private String nom;
    private int note;


    public Etudiant(String numero, String nom, int note) {
        this.numero = numero;
        this.nom = nom;
        this.note = note;
    }

    //GETTER
    public String getNum() {
        return numero;
    }
    public String getNom() {
        return nom;
    }
    public int getNote() {
        return note;
    }

    //SETTER
    public void setNum(String numero) {
        this.numero = numero;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNote(int note) {
        this.note = note;
    }

    public static void main(String[] args){

        //creer onjet etudiant
        Etudiant etudiant = new Etudiant("DOE1234567","John Doe", 78);

        System.out.println("Initial:");
        System.out.println("Numero: " + etudiant.getNum() + "\nNom: " + etudiant.getNom() + "\nNote: " + etudiant.getNote());

        etudiant.setNom("Peter Parker");
        etudiant.setNum("PAR7654321");
        etudiant.setNote(90);

        System.out.println("\nFinal:");
        System.out.println("Numero: " + etudiant.getNum() + "\nNom: " + etudiant.getNom() + "\nNote: " + etudiant.getNote());

    }
     
}
       