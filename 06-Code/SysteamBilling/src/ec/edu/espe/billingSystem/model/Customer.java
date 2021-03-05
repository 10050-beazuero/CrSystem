/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Aguirre
 */
public class Customer extends Person {
    static ArrayList Customers = new ArrayList();
    

    public Customer(String name, int document, String lastName, String address, int phone) {
        super(name, document, lastName, address, phone);
    }

    public Customer() {
       
    }
    @Override 
    public void add() throws IOException{
        Customer customer = new Customer();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonCustomer;
        System.out.println("Enter the customer's name: ");
        customer.setName(read.nextLine());
        System.out.println("Enter the customer's last name: ");
        customer.setLastName(read.nextLine());
        System.out.println("Enter the customer's address: ");
        customer.setAddress(read.nextLine());
        System.out.println("Enter the customer's document ID: ");
        customer.setDocument(read.nextInt());
        System.out.println("Enter the customer's phone number: ");
        customer.setPhone(read.nextInt());
        
        jsonCustomer = gson.toJson(customer);
        String saveData =customer.getName()+" , "+customer.getLastName()+" , "+customer.getAddress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
        Data.save("Customer.csv",saveData);
        Customers.add(customer);
        read.nextLine();
        
        outCustomer(customer.getName(),customer.getLastName(),customer.getAddress(),customer.getDocument(),customer.getPhone());
    }

    private void outCustomer(String name, String lastName, String address, int document, int phone) {
        
    }
    public void register(){
        Scanner read = new Scanner(System.in);
        System.out.println("Information to Customer");
        System.out.println("****************************");
        System.out.println("Enter the customer's name: ");
        setName(read.nextLine());
        System.out.println("Enter the customer's last name: ");
        setLastName(read.nextLine());
        System.out.println("Enter the customer's address: ");
        setAddress(read.nextLine());
        System.out.println("Enter the customer's document ID: ");
        setDocument(read.nextInt());
        System.out.println("Enter the customer's phone number: ");
        setPhone(read.nextInt());
        
    }
    
}
