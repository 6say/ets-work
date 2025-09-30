package com.cndiaga.classes;

public class LigneFacture {
    private Produit produt;
    private int quantite;

    public LigneFacture(Produit produt, int quantite) {
        this.produt = produt;
        this.quantite = quantite;
    }
    public LigneFacture(Produit produt) {
        this.produt = produt;
        this.quantite = 1;
    }

    public Produit getProdut() {
        return produt;
    }

    public void setProdut(Produit produt) {
        this.produt = produt;
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
                "produt=" + produt +
                ", quantite=" + quantite +
                '}';
    }

    public double calculerTotal() {
        double total = 0 ;
        //ou peut etre un boucle for
        total = produt.getPrixUn()*quantite;
        return total;
    }
}
