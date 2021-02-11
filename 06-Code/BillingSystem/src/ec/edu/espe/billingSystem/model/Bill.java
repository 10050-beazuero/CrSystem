
package ec.edu.espe.BillingSystem.model;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Bill {
    static ArrayList listBill = new ArrayList();
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
            
    public void generateInvoice(){}
    public void dataEntry() throws IOException{
        Bill bill = new Bill();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonBill;
        
        System.out.println("Enter WayToPay");
        bill.setWayToPay(read.nextLine());
        System.out.println("Enter article description");
        bill.setDescription(read.nextLine());
        System.out.println("Enter articles quantity");
        bill.setQuantity(read.nextInt());
        System.out.println("Enter bill code");
        bill.setCode(read.nextInt());
        System.out.println("Enter customer id");
        bill.setCustomerCode(read.nextInt());
        System.out.println("Enter Employe id");
        bill.setEmploye(read.nextInt());
        System.out.println("Enter the date");
        bill.setDate(read.nextInt());
        
        jsonBill = gson.toJson(bill);
        System.out.println("BillingInformation in json format -> " + jsonBill);
        String saveData= +bill.getCode()+" , "+bill.getCustomerCode()+" , "+bill.getEmploye()+" , "+ bill.getDate()+" , "+bill.getQuantity() + " , "+ bill.getDescription()+ " , " + bill.getWayToPay();
        Data.save("Bill.csv",saveData);
        listBill.add(bill); 
        outBill(bill.getCode(),bill.getCustomerCode(),bill.getEmploye(),bill.getDate(),bill.getDescription(),bill.getQuantity(),bill.getWayToPay());
        
    }
    public void printInvoice(){
//        Bill bill = new Bill();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonBill;
//        outBill(bill.getCode(),bill.getCustomerCode(),bill.getEmploye(),bill.getDate(),bill.getDescription(),bill.getQuantity(),bill.getWayToPay());
    }
    public void searchInvoice(){
//        Bill bill = new Bill();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonBill;
//        String saveData= +bill.getCode()+" , "+bill.getCustomerCode()+" , "+bill.getEmploye()+" , "+ bill.getDate()+" , "+bill.getQuantity() + " , "+ bill.getDescription()+ " , " + bill.getWayToPay();
//        Data.find(new File("Customer.csv"), saveData);
    }
    public void selecPymentMethod(){}
    public void seeInvoice(){}  

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

     public static void outBill(int code, int customerCode, int employe, int date,String description,int quantity, String wayToPay){
        System.out.println("BILL CODE :"+ code);
        System.out.println("CUSTOMER CODE :"+ customerCode);
        System.out.println("EMPLOYE ID :"+ employe);
        System.out.println("DATE :"+ date);
        System.out.println("ARTICLE DESCRIPTION :"+ description);
        System.out.println("ARTICLE QUANTITY :"+ quantity);
        System.out.println("WAYTOPAY :"+ wayToPay);
        
        
        }
}
