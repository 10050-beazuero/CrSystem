/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingSystem;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import ec.edu.espe.billingSystem.model.Article;
import ec.edu.espe.BillingSystem.model.Customer;
import ec.edu.espe.BillingSystem.model.Suplier;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Carolina
 */
public class BillingSysteam {
    
    static ArrayList listCustomer = new ArrayList();
    static ArrayList listSuplier = new ArrayList();
    static ArrayList listArticle = new ArrayList();
    
    public static void menu() {

        System.out.println("-----UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-----");
        System.out.println("---------------------Minimarket---------------------");
        System.out.println("1. Customers");
        System.out.println("2. Articles");
        System.out.println("3. Billing");
        System.out.println("4. Suppliers");
        System.out.println("5. Exit");
        System.out.println("Select the opction: ");

    }
    public static void registerClient()throws IOException{
        Customer customer = new Customer();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonCustomer;
        
        System.out.println("Enter customer name: ");
        customer.setName(read.nextLine());
        System.out.println("Enter customer's last name: ");
        customer.setLastName(read.nextLine());
        System.out.println("Enter customer address: ");
        customer.setAddress(read.nextLine());
        System.out.println("Enter the customer's document ID: ");
        customer.setDocument(read.nextInt());
        System.out.println("Enter the customer's phone number: ");
        customer.setPhone(read.nextInt());
        
        jsonCustomer = gson.toJson(customer);
        System.out.println("customer in json format -> " + jsonCustomer);
        String saveData =customer.getName()+" , "+customer.getLastName()+" , "+customer.getAddress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
        Data.save("Customer.csv",saveData);
        listCustomer.add(customer);
        read.nextLine();
        
        outCustomer(customer.getName(),customer.getLastName(),customer.getAddress(),customer.getDocument(),customer.getPhone());
    }
    
    public static void outCustomer(String name,String lastname,String adress,int document,int phone){
        System.out.println("NAME :"+ name);
        System.out.println("LASTNAME :"+ lastname);
        System.out.println("DIRECTION :"+ adress);
        System.out.println("ID DOCUMENT :"+ document);
        System.out.println("PHONE :"+ phone);
    }
    
    public static void suplier()throws IOException{
        Suplier suplier = new Suplier();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonSuplier;
        
        System.out.println("Enter trade name");
        suplier.setTradeName(read.nextLine());
        System.out.println("Enter article name");
        suplier.setArticleName(read.nextLine());
        
        jsonSuplier = gson.toJson(suplier);
        System.out.println("suplier in json format -> " + jsonSuplier);
        String save=suplier.getTradeName()+" , "+suplier.getArticleName()+ "\r";
        Data.save("Suplier.csv",save);
        listSuplier.add(suplier);               
        outSuplier(suplier.getTradeName(),suplier.getArticleName());
    }
    
    public static void outSuplier(String tradename,String articlename){
        System.out.println("TRADE NAME :"+ tradename);
        System.out.println("ATICLE NAME :"+ articlename);
        }
    
        public static void article()throws IOException{
        Article article = new Article();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonArticle;
        
        System.out.println("Enter article description");
        article.setDescription(read.nextLine());
        System.out.println("Enter article type");
        article.setType(read.nextLine());
        System.out.println("Enter article code");
        article.setCode(read.nextInt());
        System.out.println("Enter article quantity");
        article.setQuantity(read.nextInt());
        System.out.println("Enter article sale price");
        article.setSalePrice(read.nextFloat());
        System.out.println("Enter article cost price");
        article.setCostPrice(read.nextFloat());

        
        jsonArticle = gson.toJson(article);
        System.out.println("articleInformation in json format -> " + jsonArticle);
        String save=article.getCode()+" , "+article.getDescription()+" , "+article.getQuantity()+" , "+ article.getType()+" , "+article.getSalePrice() + " , "+article.getCostPrice() +"\r";
        Data.save("ArticleInformation.csv",save);
        listArticle.add(article);               
        outArticle(article.getCode(),article.getDescription(),article.getQuantity(),article.getType(),article.getSalePrice(),article.getCostPrice());
    }
    public static void outArticle(int code,String description,int quantity,String type,float salePrice,float costPrice){
        System.out.println("ARTICLE CODE :"+ code);
        System.out.println("ARTICLE DESCRIPTION :"+ description);
        System.out.println("ARTICLE QUANTITY :"+ quantity);
        System.out.println("ARTICLE TYPE :"+ type);
        System.out.println("ARTICLE SALE PRICE :"+ salePrice);
        System.out.println("ARTICLE COST PRICE :"+ costPrice);
        }
    public static void showCustomer(){
        for(int i=0 ; i<listCustomer.size(); i++){
            System.out.println(listCustomer.get(i));
        }
    }
    
    public static void showSuplier(){
        for(int i=0 ; i<listSuplier.size(); i++){
            System.out.println(listSuplier.get(i));
        }
    }
    public static void showArticle(){
        for(int i=0 ; i<listArticle.size(); i++){
            System.out.println(listArticle.get(i));
        }
    }
    
    
    
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);
        int option = 0;
        do{
            menu();
            option =read.nextInt();
            switch(option){
                case 1 : {
                    try{
                        registerClient();
                        showCustomer();
                    }catch(IOException ex){
                        Logger.getLogger(BillingSysteam.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    break;
                }
                case 4 : {
                     try{
                        suplier();
                        showSuplier();
                    }catch(IOException ex){
                        Logger.getLogger(BillingSysteam.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    break;
                }
                case 2 : {
                    try{
                        article();
                        showArticle();
                    }catch(IOException ex){
                        Logger.getLogger(BillingSysteam.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 5 : {
                    System.out.println("Thank for use the program");
                    break;
                }
                default : {
                    System.out.println("option no recognized");
                    break;
                }     
            }
        }while(option!=5);
    }
}
    