package com.cndiaga.demos;
import com.cndiaga.classes.Taxes;

public class Exercice4_taxes {
    public static void main(String[] args) {
        double prix, quantite, montantHorsTaxes, mTps, mTva,
                mTotal, totalTaxes;
        prix = 2.99;
        quantite = 12;
        montantHorsTaxes = prix * quantite;

        mTps = Taxes. TPS * montantHorsTaxes;
//Ou :
        mTps = Taxes.getMontantTps(montantHorsTaxes);

        totalTaxes = Taxes. getMontantTaxes (montantHorsTaxes);

        System.out.println("Taux : TPS = "+Taxes.TPS
                + ", TVQ = " +Taxes.TVQ);
        System.out.println("Montant TPS = "+mTps);
        System.out.println("Total taxes = "+totalTaxes);
        System.out.println("Total taxes comprises = "
                +Taxes.getMontantTotal(montantHorsTaxes));

        //Taxes tx = new Taxes(); //Non, le constructeur est privé
    }
}
