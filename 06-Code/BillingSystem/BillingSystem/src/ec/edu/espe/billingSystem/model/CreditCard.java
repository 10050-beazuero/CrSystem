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
public class CreditCard {
    private String cardname;
    private int cardnumber;
    private int securitycode;
    private int date;

    public CreditCard(String cardname, int cardnumber, int securitycode, int date) {
        this.cardname = cardname;
        this.cardnumber = cardnumber;
        this.securitycode = securitycode;
        this.date = date;
    }

    /**
     * @return the cardname
     */
    public String getCardname() {
        return cardname;
    }

    /**
     * @param cardname the cardname to set
     */
    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    /**
     * @return the cardnumber
     */
    public int getCardnumber() {
        return cardnumber;
    }

    /**
     * @param cardnumber the cardnumber to set
     */
    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    /**
     * @return the securitycode
     */
    public int getSecuritycode() {
        return securitycode;
    }

    /**
     * @param securitycode the securitycode to set
     */
    public void setSecuritycode(int securitycode) {
        this.securitycode = securitycode;
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
    
}
