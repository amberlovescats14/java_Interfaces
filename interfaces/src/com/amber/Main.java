package com.amber;

public class Main {

    public static void main(String[] args) {

        //constructor injection is ok for small projects
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
    }
}
// loosely coupled testable applications
//INTERFACE: a class that only holds methods
// CLASS interface CLASS  ---- its a middle man ---- like a chef in a restaurant
// data compression ./ encryption / sorting / searching

//INTERFACE SEGREGATION
// -- each interface should only have one method
//- each method is a coupling point