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
public class SuplierController extends PersonController{
    static ArrayList Supliers = new ArrayList();
    
    @Override
    public void add() throws IOException{
        ec.edu.espe.billingSystem.model.Suplier suplier = new ec.edu.espe.billingSystem.model.Suplier();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonSuplier;
        System.out.println("Enter suplier name: ");
        suplier.setName(read.nextLine());
        System.out.println("Enter cashier's last name: ");
        suplier.setLastName(read.nextLine());
        System.out.println("Enter cashier's address: ");
        suplier.setAddress(read.nextLine());
        System.out.println("Enter cashier's document ID: ");
        suplier.setDocument(read.nextInt());
        System.out.println("Enter cashier's phone number: ");
        suplier.setPhone(read.nextInt());
        
        jsonSuplier = gson.toJson(suplier);
        String saveData =suplier.getName()+" , "+suplier.getLastName()+
                " , "+suplier.getAddress()+" , "+suplier.getDocument()+" , "+suplier.getPhone()+
                " , "+suplier.getArticleName()+ "\r";
        Data.save("Suplier.csv",saveData);
        Supliers.add(suplier);
        read.nextLine();
        
        outSuplier(suplier.getName(),suplier.getLastName(),suplier.getAddress(),
                suplier.getDocument(),suplier.getPhone(),suplier.getArticleName());
    }

    private void outSuplier(String name, String lastName, String address, int document,
            int phone, String articleName) {
        
    }
    
}
