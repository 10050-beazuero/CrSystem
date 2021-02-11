/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BillingSystem.model;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Aguirre
 */
public class Customer {
    static ArrayList listCustomer = new ArrayList();
    private String name;
    private int document;
    private String lastName;
    private String address;
    private int phone;

    public static ArrayList getListCustomer() {
        return listCustomer;
    }

    public static void setListCustomer(ArrayList listCustomer) {
        Customer.listCustomer = listCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Customer() {
        
    }
    
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
        listCustomer.add(customer);
        read.nextLine();
        
        outCustomer(customer.getName(),customer.getLastName(),customer.getAddress(),customer.getDocument(),customer.getPhone());
    }
    public void delete() throws IOException{
//        Customer customer = new Customer();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonCustomer;
//        String saveData =customer.getName()+" , "+customer.getLastName()+" , "+customer.getAddress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
//        Data.remove("Customer.csv", saveData);
//        listCustomer.remove(customer);
//        read.nextLine();
    }
    
    public void modify(){
//        Customer customer = new Customer();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonCustomer;
//        String saveData =customer.getName()+" , "+customer.getLastName()+" , "+customer.getAddress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
//        Data.update("Customer.csv", saveData);   
    }
    public void search(){
//        Customer customer = new Customer();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonCustomer;
//        String saveData =customer.getName()+" , "+customer.getLastName()+" , "+customer.getAddress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
//        Data.find(new File("Customer.csv"), saveData);
    }
    public void showReport(){
//        Customer customer = new Customer();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonCustomer;
//        String saveData =customer.getName()+" , "+customer.getLastName()+" , "+customer.getAddress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
//        Data.findAll("Customer.csv", saveData);
    }

    private void outCustomer(String name, String lastName, String address, int document, int phone) {
        
    }
    
}
