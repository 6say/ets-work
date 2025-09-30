package com.cndiaga.classes;

public class Produits {
    //attributs
    private String reference, designation;
    private double prixUn;

    //Constructeur sans arguments
    public Produits() {
        reference = "";
        designation = "";
        prixUn = 1.0;
    }
    //Constructeur 1
    public Produits(String reference, String designation, double prixUn) {
        this.reference = reference;
        this.designation = designation;
        this.prixUn = prixUn;
    }

    //Constructeur 2
    public Produits(String reference, String designation) {
        this.reference = reference;
        this.designation = designation;
        prixUn = 1.0;
    }

    //GETTER ET SETTER
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixUn() {
        return prixUn;
    }

    public void setPrixUn(double prixUn) {
        this.prixUn = prixUn;
    }


    @Override
    public String toString() {
        return "{ Réference: " + reference + " ; Designation: " + designation + " ; Prix un: " + prixUn + " }";
    }

    public boolean egaliteProduit(Produits produit) {
        if (this.reference.equals(produit.getReference())) {
            return true;
        }
        return false;
    }

}
