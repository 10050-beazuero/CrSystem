/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author USUARIO
 */
public class Bill {
    private String employe;
    private String waytopay;
    private int date;
    private float code;
    private float customercode; 
    private boolean invoicestatus;

    public Bill(String employe, String waytopay, int date, float code, float customercode, boolean invoicestatus) {
        this.employe = employe;
        this.waytopay = waytopay;
        this.date = date;
        this.code = code;
        this.customercode = customercode;
        this.invoicestatus = invoicestatus;
    }

    /**
     * @return the employe
     */
    public String getEmploye() {
        return employe;
    }

    /**
     * @param employe the employe to set
     */
    public void setEmploye(String employe) {
        this.employe = employe;
    }

    /**
     * @return the waytopay
     */
    public String getWaytopay() {
        return waytopay;
    }

    /**
     * @param waytopay the waytopay to set
     */
    public void setWaytopay(String waytopay) {
        this.waytopay = waytopay;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * @return the code
     */
    public float getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(float code) {
        this.code = code;
    }

    /**
     * @return the customercode
     */
    public float getCustomercode() {
        return customercode;
    }

    /**
     * @param customercode the customercode to set
     */
    public void setCustomercode(float customercode) {
        this.customercode = customercode;
    }

    /**
     * @return the invoicestatus
     */
    public boolean isInvoicestatus() {
        return invoicestatus;
    }

    /**
     * @param invoicestatus the invoicestatus to set
     */
    public void setInvoicestatus(boolean invoicestatus) {
        this.invoicestatus = invoicestatus;
    }
    
}
