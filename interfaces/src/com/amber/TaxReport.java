package com.amber;

public class TaxReport {
    private TaxCalculator calculator;


    //CONSTRUCTOR
    public  TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

//    //SETTER
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    //GETTER
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
// DEPENDENCY INJECTION: a chef is different from a waitress. in the same rest
//constructor

// DONT NEED constructor WITH METHOD INJECTIOON