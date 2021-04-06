/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class BillController {
    static ArrayList Bills = new ArrayList();

    public void dataEntry() throws IOException{
        BillController bill = new BillController();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonBill;
        
        System.out.println("WayToPay");
        bill.setWayToPay(read.nextLine());
        System.out.println("Description");
        bill.setDescription(read.nextLine());
        System.out.println("Quantity");
        bill.setQuantity(read.nextInt());
        System.out.println("Bill code");
        bill.setCode(read.nextInt());
        System.out.println("Customer ID");
        bill.setCustomerCode(read.nextInt());
        System.out.println("Employe ID");
        bill.setEmploye(read.nextInt());
        System.out.println("Date");
        bill.setDate(read.nextInt());
        
        jsonBill = gson.toJson(bill);
        System.out.println("BillingInformation in json format -> " + jsonBill);
        String saveData= bill.getCode()+" , "+bill.getCustomerCode()+" , "+
                bill.getEmploye()+" , "+ bill.getDate()+" , "+bill.getQuantity() + " , "
                + bill.getDescription()+ " , " + bill.getWayToPay();
        Data.save("Bill.csv",saveData);
        Bills.add(bill);
    }
    
    public static void outBill(int code, int customerCode, int employe, int date
            ,String description,int quantity, String wayToPay){
        System.out.println("BILL CODE :"+ code);
        System.out.println("CUSTOMER CODE :"+ customerCode);
        System.out.println("EMPLOYE ID :"+ employe);
        System.out.println("DATE :"+ date);
        System.out.println("ARTICLE DESCRIPTION :"+ description);
        System.out.println("ARTICLE QUANTITY :"+ quantity);
        System.out.println("WAYTOPAY :"+ wayToPay);
    }

    private void setWayToPay(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDescription(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantity(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCode(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCustomerCode(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setEmploye(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDate(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCustomerCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getEmploye() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getWayToPay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
