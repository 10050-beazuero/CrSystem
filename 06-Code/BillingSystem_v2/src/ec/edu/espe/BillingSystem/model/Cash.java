/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author casa
 */
public class Cash {
   private int value; 

    @Override
    public String toString() {
        return "Cash{" + "value=" + value + '}';
    }

    public Cash(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}
