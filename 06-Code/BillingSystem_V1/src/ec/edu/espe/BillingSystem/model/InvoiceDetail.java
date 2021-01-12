/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author USUARIO
 */
public class InvoiceDetail {
    private int billcode;
    private int articlecode;
    private int amount;
    private float iva;
    private int saleprice;

    public InvoiceDetail(int billcode, int articlecode, int amount, float iva, int saleprice) {
        this.billcode = billcode;
        this.articlecode = articlecode;
        this.amount = amount;
        this.iva = iva;
        this.saleprice = saleprice;
    }

    /**
     * @return the billcode
     */
    public int getBillcode() {
        return billcode;
    }

    /**
     * @param billcode the billcode to set
     */
    public void setBillcode(int billcode) {
        this.billcode = billcode;
    }

    /**
     * @return the articlecode
     */
    public int getArticlecode() {
        return articlecode;
    }

    /**
     * @param articlecode the articlecode to set
     */
    public void setArticlecode(int articlecode) {
        this.articlecode = articlecode;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the iva
     */
    public float getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(float iva) {
        this.iva = iva;
    }

    /**
     * @return the saleprice
     */
    public int getSaleprice() {
        return saleprice;
    }

    /**
     * @param saleprice the saleprice to set
     */
    public void setSaleprice(int saleprice) {
        this.saleprice = saleprice;
    }
    
}
