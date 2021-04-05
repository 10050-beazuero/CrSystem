/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.controller;

import ec.edu.espe.billingSystem.model.USTax;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author admin
 */
public class IVACalculatorTest {
    public IVACalculatorTest() {
    }
    
    @Test
    public void testsalesTotal(){
        System.out.println("calculate");
        float value = 20;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 2.4;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal2(){
        System.out.println("calculate");
        float value = 5;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.6;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal3(){
        System.out.println("calculate");
        float value = 10;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 1.2;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal4(){
        System.out.println("calculate");
        float value = 15;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 1.8;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal5(){
        System.out.println("calculate");
        float value = 1;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.12;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal6(){
        System.out.println("calculate");
        float value = 3;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.36;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal7(){
        System.out.println("calculate");
        float value = 5;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.6;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal8(){
        System.out.println("calculate");
        float value = 7;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.84;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal9(){
        System.out.println("calculate");
        float value = 9;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 1.08;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal10(){
        System.out.println("calculate");
        float value = 11;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 1.32;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } @Test
    public void testsalesTotal11(){
        System.out.println("calculate");
        float value = 13;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 1.56;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal12(){
        System.out.println("calculate");
        float value = 17;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 2.04;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal13(){
        System.out.println("calculate");
        float value = 19;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 2.28;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal14(){
        System.out.println("calculate");
        float value = 21;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 2.52;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal15(){
        System.out.println("calculate");
        float value = 2;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.24;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal16(){
        System.out.println("calculate");
        float value = 4;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.48;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal17(){
        System.out.println("calculate");
        float value = 6;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.72;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal18(){
        System.out.println("calculate");
        float value = 8;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 0.96;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal19(){
        System.out.println("calculate");
        float value = 12;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 1.44;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal20(){
        System.out.println("calculate");
        float value = 14;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 1.68;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal21(){
        System.out.println("calculate");
        float value = 16;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 1.92;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal22(){
        System.out.println("calculate");
        float value = 18;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 2.16;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal23(){
        System.out.println("calculate");
        float value = 22;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 2.64;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal24(){
        System.out.println("calculate");
        float value = 24;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 2.88;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal25(){
        System.out.println("calculate");
        float value = 234;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 28.08;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal26(){
        System.out.println("calculate");
        float value = 804;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 96.48;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal27(){
        System.out.println("calculate");
        float value = 420;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 50.4;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal28(){
        System.out.println("calculate");
        float value = (float) 21.2;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 2.544;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal29(){
        System.out.println("calculate");
        float value = (float) 35.4;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 4.248;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    @Test
    public void testsalesTotal30(){
        System.out.println("calculate");
        float value = (float) 42.2;
        float total;
        USTax tax = USTax.getlnstance(value);
        float exptotal = (float) 5.064;
        total = tax.salesTotal(tax);
        assertEquals(exptotal, total, 0.0);
    } 
    
}
