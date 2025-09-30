package com.cndiaga.classes;

public class LigneFacture {
    private Produit produit;
    private int quantite;

    public LigneFacture(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }
    public LigneFacture(Produit produit) {
        this.produit = produit;
        this.quantite = 1;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "LigneFacture{" +
                "produt=" + produit +
                ", quantite=" + quantite +
                '}';
    }

    public double calculerTotal() {
        double total = 0 ;
        //ou peut etre un boucle for
        total = produit.getPrixUn()*quantite;
        return total;
    }
}
