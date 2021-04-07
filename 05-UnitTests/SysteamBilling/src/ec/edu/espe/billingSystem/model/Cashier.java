/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;


/**
 *
 * @author Home
 */
public class Cashier extends Person {

    public Cashier(String name, int document, String lastName,
            String address, int phone) {
        super(name, document, lastName, address, phone);
    }

    @Override
    public String toString() {
        return "Cashier{" + '}';
    }

    public Cashier() {
        
    }
    
 }
