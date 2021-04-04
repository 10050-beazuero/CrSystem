/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.controller;

import ec.edu.espe.billingSystem.model.USTax;

/**
 *
 * @author home
 */
public class IVACalculator {
    public static float calculate(float value){
        float total;
        USTax tax = USTax.getlnstance(value);
        total = tax.salesTotal(tax);
        return total;
    } 
}
