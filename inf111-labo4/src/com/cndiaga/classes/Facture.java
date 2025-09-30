package com.cndiaga.classes;

public class Facture {
    private Client client;
    private LigneFacture [] lignesFacture;
    private double montantHorsTaxe, montantTaxesInclus, totalTaxes, TPS, TVQ;


    //Constructeurs
    public Facture(int nbLignes) {
        lignesFacture = new LigneFacture[nbLignes];
    }

    public Facture() {
        lignesFacture = new LigneFacture[10];
    }

    public Facture(Client client, int nbLignes) {
        this.client = client;
        lignesFacture = new LigneFacture[nbLignes];
    }
    public Facture(String nom, String telephone, int nbLignes) {
        this.client = new Client(nom, telephone);
        lignesFacture = new LigneFacture[nbLignes];
    }

    public double getMontantHorsTaxe() {
        return montantHorsTaxe;
    }

    public double getMontantTaxesInclus() {
        return montantTaxesInclus;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }

    public double getTPS() {
        return TPS;
    }

    public double getTVQ() {
        return TVQ;
    }

    public boolean ajouteLigne(LigneFacture l) {

        for (int i = 0; i < lignesFacture.length; i++) {
            if (lignesFacture[i] == null) {
                 lignesFacture[i] = l;
                 return true;
            }
        }
        return false;
    }

    public boolean supprimeLigne(String reference) {
        for (int i = 0; i < lignesFacture.length; i++) {
            if ((lignesFacture[i].getProduit().getReference()).equals(reference)) {
                lignesFacture[i].setQuantite(0);
                lignesFacture[i].setProduit(null);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String lignesString = "";
        if (client != null) {
            lignesString = client.toString() + "\n";
        }
        for (int i = 0; i < lignesFacture.length; i++) {
            if (lignesFacture[i].getProduit() == null) {
                lignesString += "";
            }else
                lignesString += lignesFacture[i].toString();
        }

        return "-----Facture-----\n" +
                lignesString;
    }

    public void trier() {
        int i, j, smallest;
        LigneFacture temp;

        for (i = 0; i < lignesFacture.length - 1; i++) {
            smallest = i;
            for (j = i + 1; j < lignesFacture.length; j++) {
                if (lignesFacture[j].calculerTotal() < lignesFacture[smallest].calculerTotal() ) {
                    smallest = j;
                }
            }
            temp = lignesFacture[smallest];
            lignesFacture[smallest] = lignesFacture[i];
            lignesFacture[i] = temp;
        }

    }

    public void calculerTaxes() {
        for (int i = 0; i < lignesFacture.length; i++) {
            this.montantHorsTaxe += lignesFacture[i].calculerTotal();
        }
        this.TPS = Taxes.getMontantTps(montantHorsTaxe);
        this.TVQ = Taxes.getMontantTvq(montantHorsTaxe);
        this.totalTaxes = Taxes.getMontantTaxes(montantHorsTaxe);
        this.montantTaxesInclus = Taxes.getMontantTotal(montantHorsTaxe);
    }
}
