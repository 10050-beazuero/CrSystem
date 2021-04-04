
package ec.edu.espe.sortApp.controller;

import ec.edu.espe.sortApp.model.USTax;

public class Calculator {
    
    public static float calculate(float value){
        float total;
        USTax tax = USTax.getlnstance(value);
        total = tax.salesTotal(tax);
        return total;
    }
}
