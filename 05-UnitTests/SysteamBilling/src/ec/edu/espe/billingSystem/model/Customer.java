/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;

import java.util.ArrayList;

/**
 *
 * @author Angel Aguirre
 */
public class Customer extends Person {
    static ArrayList Customers = new ArrayList();
    private static ArrayList listPerson;

    public Customer(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Customer{" + '}';
    }
    

    public Customer(String name, String document, String lastName, String address, String phone, Customer customer) {
        
    }

    public Customer() {
    }

    public static ArrayList getCustomers() {
        return Customers;
    }

    public static void setCustomers(ArrayList Customers) {
        Customer.Customers = Customers;
    }

    public static ArrayList getListPerson() {
        return listPerson;
    }

    public static void setListPerson(ArrayList listPerson) {
        Person.listPerson = listPerson;
    }

    public void register() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
