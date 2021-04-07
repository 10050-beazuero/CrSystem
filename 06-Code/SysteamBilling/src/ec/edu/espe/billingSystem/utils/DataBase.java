/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.utils;

import com.mongodb.BasicDBObject;
import ec.edu.espe.billingSystem.model.Cashier;
import ec.edu.espe.billingSystem.model.Customer;
import java.util.ArrayList;

/**
 *
 * @author Bryan Azuero
 */
public class DataBase {
    private ArrayList<Customer> customerList;
    private BasicDBObject dbObject;
    private DataBaseConnection connection;
    
    public DataBase(){
        customerList = new ArrayList();
        dbObject = new BasicDBObject();
        connection = new DataBaseConnection();
    }
    public void create(Customer customer) {

        dbObject.append("Name", customer.getName());
        dbObject.append("Id Document", customer.getDocument());
        dbObject.append("Last Name", customer.getLastName());
        dbObject.append("Address", customer.getAddress());
        dbObject.append("Phone Number", customer.getPhone());
        connection.getCollection().insert(dbObject);

        
    }
    public void createCashier(Cashier cashier) {

        dbObject.append("Name", cashier.getName());
        dbObject.append("Id Document", cashier.getDocument());
        dbObject.append("Last Name", cashier.getLastName());
        dbObject.append("Address", cashier.getAddress());
        dbObject.append("Phone Number", cashier.getPhone());
        connection.getCollection().insert(dbObject);
        
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
     * @return the dbObject
     */
    public BasicDBObject getDbObject() {
        return dbObject;
    }

    /**
     * @param dbObject the dbObject to set
     */
    public void setDbObject(BasicDBObject dbObject) {
        this.dbObject = dbObject;
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
 
    
   
}
