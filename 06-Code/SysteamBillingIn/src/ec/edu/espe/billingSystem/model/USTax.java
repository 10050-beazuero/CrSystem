/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author home
 */
public class USTax {
     private float value;
    private float tax;
    private static USTax instance;

    public USTax(float value, float tax) {
        this.value = value;
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "USTax{" + "value=" + value + ", tax=" + tax + '}';
    }
    
    private USTax(float value) {
        tax = (float) 0.12;
        this.value = value;
    }
    
    public static USTax getlnstance(float value)
    {
        if(getInstance() == null)
        {
            setInstance(new USTax(value));
        }
        else
        {
        setInstance(new USTax(value));
        
        }
        return getInstance();
    }
    
    public float salesTotal(USTax usTax){
        float total;
        total = usTax.getTax() * usTax.getValue();
        total += usTax.getValue();
        return total;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the tax
     */
    public float getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(float tax) {
        this.tax = tax;
    }

    /**
     * @return the instance
     */
    public static USTax getInstance() {
        return instance;
    }

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(USTax aInstance) {
        instance = aInstance;
    }
    
        
    
}

