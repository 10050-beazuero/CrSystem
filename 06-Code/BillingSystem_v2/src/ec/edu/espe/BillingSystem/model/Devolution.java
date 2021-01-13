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
public class Devolution {
    private int code;
    private int billcode;
    private int articlecode;
    private int quantity; 

    @Override
    public String toString() {
        return "Devolution{" + "code=" + code + ", billcode=" + billcode + ", articlecode=" + articlecode + ", quantity=" + quantity + '}';
    }

    public Devolution(int code, int billcode, int articlecode, int quantity) {
        this.code = code;
        this.billcode = billcode;
        this.articlecode = articlecode;
        this.quantity = quantity;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
