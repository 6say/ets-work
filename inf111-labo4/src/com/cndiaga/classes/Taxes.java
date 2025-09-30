package com.cndiaga.classes;

public class Taxes {
    public static final double TPS = 0.05;
    public static final double TVQ = 0.09975;

    private Taxes() {}

    public static double getMontantTps(double montantHorsTaxes) {
        return montantHorsTaxes * TPS;
    }
    public static double getMontantTvq(double montantHorsTaxes) {
        return montantHorsTaxes * TVQ;
    }
    public static double getMontantTaxes(double montantHorsTaxes) {
        return montantHorsTaxes * (TPS+TVQ);
    }
    public static double getMontantTotal(double montantHorsTaxes) {
        return montantHorsTaxes * (1+TPS+TVQ);
    }
}
