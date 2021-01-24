
package ec.edu.espe.billingSystem.model;

import java.util.Date;

/**
 *
 * @author Erika
 */
public class Bill {
    
    private int code;
    private int customerCode;
    private int employe;
    private Date date;
    private int wayToPay;
    private boolean invoiceStatus;

    
    public Bill(int code, int customerCode, int employe, int date, int wayToPay, boolean invoiceStatus) {
        this.code = code; 
        Date d = new Date();
        this.customerCode = customerCode;
        this.employe = employe;
        this.date = d;
        this.wayToPay = wayToPay;
        this.invoiceStatus = invoiceStatus;
    }
            
    public void generateInvoice(){}
    public void dataEntry(){}
    public void printInvoice(){}
    public void searchInvoice(){}
    public void selecPymentMethod(){}
    public void seeInvoice(){}  

    @Override
    public String toString() {
        return "Bill{" + "code=" + code + ", customerCode=" + customerCode + ", employe=" + employe + ", date=" + date + ", wayToPay=" + wayToPay + ", invoiceStatus=" + invoiceStatus + '}';
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public int getEmploye() {
        return employe;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getWayToPay() {
        return wayToPay;
    }

    public void setWayToPay(int wayToPay) {
        this.wayToPay = wayToPay;
    }

    public boolean isInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(boolean invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    
    public void primenbilling(){
        System.out.println(this.code+" "+this.customerCode+" "+this.date+" "+this.employe+" "+this.invoiceStatus+" "+this.wayToPay); 
           
    }
}


