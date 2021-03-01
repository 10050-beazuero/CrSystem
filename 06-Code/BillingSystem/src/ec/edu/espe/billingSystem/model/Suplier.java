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

/**
 *
 * @author Angel Aguirre
 */
public class Suplier extends Person {
    static ArrayList Supliers = new ArrayList();
    private String articleName;

    public Suplier() {
        
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Suplier(String articleName, String name, int document, String lastName, String address, int phone) {
        super(name, document, lastName, address, phone);
        this.articleName = articleName;
    }
    @Override 
    public void add() throws IOException{
        Suplier suplier = new Suplier();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonSuplier;
        System.out.println("Enter the suplier name: ");
        suplier.setName(read.nextLine());
        System.out.println("Enter the cashier's last name: ");
        suplier.setLastName(read.nextLine());
        System.out.println("Enter the cashier's address: ");
        suplier.setAddress(read.nextLine());
        System.out.println("Enter the cashier's document ID: ");
        suplier.setDocument(read.nextInt());
        System.out.println("Enter the cashier's phone number: ");
        suplier.setPhone(read.nextInt());
        
        jsonSuplier = gson.toJson(suplier);
        String saveData =suplier.getName()+" , "+suplier.getLastName()+" , "+suplier.getAddress()+" , "+suplier.getDocument()+" , "+suplier.getPhone()+" , "+suplier.getArticleName()+ "\r";
        Data.save("Suplier.csv",saveData);
        Supliers.add(suplier);
        read.nextLine();
        
        outSuplier(suplier.getName(),suplier.getLastName(),suplier.getAddress(),suplier.getDocument(),suplier.getPhone(),suplier.getArticleName());
    }


    private void outSuplier(String name, String lastName, String address, int document, int phone, String articleName) {
    }

    public void setTradeName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTradeName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
