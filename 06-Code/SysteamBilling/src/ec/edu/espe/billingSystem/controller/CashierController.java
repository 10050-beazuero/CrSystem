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
public class CashierController {
    static ArrayList listCashier = new ArrayList();
    
    public void add() throws IOException{
        ec.edu.espe.billingSystem.model.Cashier cashier = new ec.edu.espe.billingSystem.model.Cashier();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonCashier;
        System.out.println("Cashier name: ");
        cashier.setName(read.nextLine());
        System.out.println("Cashier's last name: ");
        cashier.setLastName(read.nextLine());
        System.out.println("Cashier's address: ");
        cashier.setAddress(read.nextLine());
        System.out.println("Cashier's document ID: ");
        cashier.setDocument(read.nextInt());
        System.out.println("Cashier's phone number: ");
        cashier.setPhone(read.nextInt());
        
        jsonCashier = gson.toJson(cashier);
        String saveData =cashier.getName()+" , "+cashier.getLastName()+
                " , "+cashier.getAddress()+" , "+cashier.getDocument()+" , "+cashier.getPhone()+ "\r";
        Data.save("Cashier.csv",saveData);
        listCashier.add(cashier);
        read.nextLine();
        
        outCashier(cashier.getName(),cashier.getLastName(),cashier.getAddress(),
                cashier.getDocument(),cashier.getPhone());
    }

    private void outCashier(String name, String lastName, String address, int document, int phone) {
        
    }
    
}
