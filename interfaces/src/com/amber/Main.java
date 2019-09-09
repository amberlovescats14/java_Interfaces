package com.amber;

public class Main {

    public static void main(String[] args) {

        //constructor injection is ok for small projects
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
    }

    public void doSomething(TaxCalculator calculator){
        // HOW would u know it has a constant in the interface
        // try not to use them
    }
}
// loosely coupled testable applications
//INTERFACE: a class that only holds methods
// CLASS interface CLASS  ---- its a middle man ---- like a chef in a restaurant
// data compression ./ encryption / sorting / searching

//INTERFACE SEGREGATION
// -- each interface should only have one method
//- each method is a coupling point

//QUIZ?????
// Interfaces: To create loosely coupled and testable apps
//Tightly Coupled: Means that the Classes are highly dependant on each other
//TIGHT
//Dependency Injection:  the dependancies should be configured outside of the main class
//types of injection: setters, constructor, method
// Interface Segregation Principle: A class should never be dependant on an unused method
// we SHOULD NOT declare private or static fields in interfaces because it looks like the data is coming
//      out of the sky, no one knows that data is there. plus its constant
// we do not have to extract an interface from every class


//ISP
//- The Interface Segregation Principle (ISP) suggests that we should segregate or divide
// big, fat interfaces into smaller ones, each focusing on a single responsibility or
// capability. Smaller interfaces are less likely to change. Changes to one capability,
// will only affect a single interface and fewer classes that depend on that interface.