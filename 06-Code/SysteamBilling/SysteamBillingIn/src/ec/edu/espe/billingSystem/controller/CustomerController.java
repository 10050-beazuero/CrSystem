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
public class CustomerController extends PersonController {
    static ArrayList Customers = new ArrayList();

    @Override
    public void add() throws IOException{
        CustomerController customer = new CustomerController();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonCustomer;
        System.out.println("Enter customer's name: ");
        customer.setName(read.nextLine());
        System.out.println("Enter customer's last name: ");
        customer.setLastName(read.nextLine());
        System.out.println("Enter customer's address: ");
        customer.setAddress(read.nextLine());
        System.out.println("Enter customer's document ID: ");
        customer.setDocument(read.nextInt());
        System.out.println("Enter customer's phone number: ");
        customer.setPhone(read.nextInt());
        
        jsonCustomer = gson.toJson(customer);
        String saveData =customer.getName()+" , "+customer.getLastName()+
                " , "+customer.getAddress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
        Data.save("Customer.csv",saveData);
        Customers.add(customer);
        read.nextLine();
    }

    private void outCustomer(String name, String lastName, String address, int document, int phone) {
        
    }
    public void register(){
        Scanner read = new Scanner(System.in);
        System.out.println("Information to Customer");
        System.out.println("****************************");
        System.out.println("Enter customer's name: ");
        setName(read.nextLine());
        System.out.println("Enter customer's last name: ");
        setLastName(read.nextLine());
        System.out.println("Enter customer's address: ");
        setAddress(read.nextLine());
        System.out.println("Enter customer's document ID: ");
        setDocument(read.nextInt());
        System.out.println("Enter customer's phone number: ");
        setPhone(read.nextInt());
        
    }

    private void setName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLastName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setAddress(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDocument(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPhone(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDocument() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
