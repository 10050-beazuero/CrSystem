/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.controller;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import ec.edu.espe.FileManagerProyect.utils.Data;
import ec.edu.espe.billingSystem.model.Customer;
import ec.edu.espe.billingSystem.utils.DataBaseConnection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class CustomerController extends PersonController {
    private static ArrayList Customers = new ArrayList();
    private ArrayList<Customer> customerList = new ArrayList();
    private DataBaseConnection connection = new DataBaseConnection();
    private BasicDBObject document = new BasicDBObject();
    @Override
    public void add() throws IOException{
        CustomerController customer = new CustomerController();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonCustomer;
        System.out.println("Customer's name: ");
        customer.setName(read.nextLine());
        System.out.println("Customer's last name: ");
        customer.setLastName(read.nextLine());
        System.out.println("Customer's address: ");
        customer.setAddress(read.nextLine());
        System.out.println("Customer's document ID: ");
        customer.setDocument(read.nextInt());
        System.out.println("Customer's phone number: ");
        customer.setPhone(read.nextInt());
        
        jsonCustomer = gson.toJson(customer);
        String saveData =customer.getName()+" , "+customer.getLastName()+
                " , "+customer.getAddress()+" , "+customer.getDocument()+" , "
                +customer.getPhone()+ "\r";
        Data.save("Customer.csv",saveData);
        getCustomers().add(customer);
        read.nextLine();
    }

    private void outCustomer(String name, String lastName, String address, int document, int phone) {
        
    }
    public void register(){
        Scanner read = new Scanner(System.in);
        System.out.println("Information for Customer");
        System.out.println("****************************");
        System.out.println("Customer's name: ");
        setName(read.nextLine());
        System.out.println("Customer's last name: ");
        setLastName(read.nextLine());
        System.out.println("Customer's address: ");
        setAddress(read.nextLine());
        System.out.println("Customer's document ID: ");
        setDocument(read.nextInt());
        System.out.println("Customer's phone number: ");
        setPhone(read.nextInt());
        
    }
    public void insert(Customer customer){
        document.append("Name", customer.getName());
        document.append("Id Document", customer.getDocument());
        document.append("Last Name", customer.getLastName());
        document.append("Address", customer.getAddress());
        document.append("Number Phone", customer.getPhone());
        connection.getCollection().insert(document);
    }
    public void delete(String name){
        BasicDBObject delete = new BasicDBObject();
        delete.put("Name", name);
        DBCursor cursor = connection.getCollection().find(delete);
        if(cursor.hasNext()){
            DBObject dbObject = cursor.next();
            connection.getCollection().remove(dbObject);
        }
    }
    /**
     * @return the Customers
     */
    public static ArrayList getCustomers() {
        return Customers;
    }

    /**
     * @param aCustomers the Customers to set
     */
    public static void setCustomers(ArrayList aCustomers) {
        Customers = aCustomers;
    }

    /**
     * @return the customerList
     */
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * @param customerList the customerList to set
     */
    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    /**
     * @return the connection
     */
    public DataBaseConnection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(DataBaseConnection connection) {
        this.connection = connection;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(BasicDBObject document) {
        this.document = document;
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