
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author Carolina
 */
public class Bill {
    
    private int code;
    private int customerCode;
    private int employe;
    private int date;
    private String wayToPay;
    private String description;
    private int quantity;
    private boolean invoiceStatus;

    
    public Bill(int code, int customerCode, int employe, int date, String wayToPay,String description,int quantity, boolean invoiceStatus) {
        this.code = code;
        this.customerCode = customerCode;
        this.employe = employe;
        this.date = date;
        this.wayToPay = wayToPay;
        this.description = description;
        this.quantity = quantity;
        this.invoiceStatus = invoiceStatus;
    }

    public Bill() {
        
    }
    
    @Override
    public String toString() {
        return "Bill{" + "code=" + code + ", customerCode=" + customerCode + ", employe=" + employe + ", date=" + date + ", wayToPay=" + wayToPay + ", invoiceStatus=" + invoiceStatus + ", description"+ description + ", quantity"+quantity+ '}';
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getWayToPay() {
        return wayToPay;
    }

    public void setWayToPay(String wayToPay) {
        this.wayToPay = wayToPay;
    }

    public boolean isInvoiceStatus() {
        return invoiceStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setInvoiceStatus(boolean invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public void dataEntry() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
