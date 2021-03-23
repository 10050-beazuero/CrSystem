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

    public Customer(String name, String document, String lastName, String address, String phone, Customer customer) {
        super(name, document, lastName, address, phone, customer);
    }

    @Override
    public String toString() {
        return "Customer{" + '}';
    }
    
}
