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
public class Suplier {
    static ArrayList listSuplier = new ArrayList();
    private String articleName;
    private String name;
    private int document;
    private String lastName;
    private String address;
    private int phone;

    public static ArrayList getListSuplier() {
        return listSuplier;
    }

    public static void setListSuplier(ArrayList listSuplier) {
        Suplier.listSuplier = listSuplier;
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

    public Suplier() {
        
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    
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
        listSuplier.add(suplier);
        read.nextLine();
        
        outSuplier(suplier.getName(),suplier.getLastName(),suplier.getAddress(),suplier.getDocument(),suplier.getPhone(),suplier.getArticleName());
    }
    public void delete() throws IOException{
//        Suplier suplier = new Suplier();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonSuplier;
//        String saveData =suplier.getName()+" , "+suplier.getLastName()+" , "+suplier.getAddress()+" , "+suplier.getDocument()+" , "+suplier.getPhone()+" , "+suplier.getArticleName()+ "\r";
//        Data.remove("Suplier.csv",saveData);
//        listSuplier.remove(suplier);
//        read.nextLine();
    }
    
    public void modify(){
//        Suplier suplier = new Suplier();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonSuplier;
//        String saveData =suplier.getName()+" , "+suplier.getLastName()+" , "+suplier.getAddress()+" , "+suplier.getDocument()+" , "+suplier.getPhone()+" , "+suplier.getArticleName()+ "\r";
//        Data.update("Suplier.csv",saveData);   
    }
    public void search(){
//        Suplier suplier = new Suplier();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonSuplier;
//        String saveData =suplier.getName()+" , "+suplier.getLastName()+" , "+suplier.getAddress()+" , "+suplier.getDocument()+" , "+suplier.getPhone()+" , "+suplier.getArticleName()+ "\r";
//        Data.find(new File("Suplier.csv"), saveData);
    }
    public void showReport(){
//        Suplier suplier = new Suplier();
//        Scanner read = new Scanner(System.in);
//        Gson gson = new Gson();
//        String jsonSuplier;
//        String saveData =suplier.getName()+" , "+suplier.getLastName()+" , "+suplier.getAddress()+" , "+suplier.getDocument()+" , "+suplier.getPhone()+" , "+suplier.getArticleName()+ "\r";
//        Data.findAll("Suplier.csv", saveData);
    }


    private void outSuplier(String name, String lastName, String address, int document, int phone, String articleName) {
        
    }
}
