package com.amber;

public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        // cannot re assign the number because it is constant in the interface
//        TaxCalculator.minimumTax = 8;
        return taxableIncome * .08;
    }


}



//implements - instead of extends

//annotations are labels like @Override