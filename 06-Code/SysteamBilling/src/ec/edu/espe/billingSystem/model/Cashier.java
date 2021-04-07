/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;

import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Home
 */
public class Cashier extends Person {

    public Cashier(String name, int document, String lastName, String address, int phone) {
        super(name, document, lastName, address, phone);
    }

    public Cashier(JTextField txtName, JTextField txtDocument, JTextField txtLastName, JTextArea txtAddress, JTextField txtPhone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cashier{" + '}';
    }

    public Cashier() {
        
    }
    
 }
