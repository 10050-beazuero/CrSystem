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
public class Check {
    private String withdraws;
    private int idnumber;
    private int value;

    public Check(String withdraws, int idnumber, int value) {
        this.withdraws = withdraws;
        this.idnumber = idnumber;
        this.value = value;
    }

    /**
     * @return the withdraws
     */
    public String getWithdraws() {
        return withdraws;
    }

    /**
     * @param withdraws the withdraws to set
     */
    public void setWithdraws(String withdraws) {
        this.withdraws = withdraws;
    }

    /**
     * @return the idnumber
     */
    public int getIdnumber() {
        return idnumber;
    }

    /**
     * @param idnumber the idnumber to set
     */
    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
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
