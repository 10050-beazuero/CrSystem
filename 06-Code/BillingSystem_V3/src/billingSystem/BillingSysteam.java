/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingSystem;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import ec.edu.espe.billingSystem.model.Customer;
import ec.edu.espe.billingSystem.model.Suplier;
import ec.edu.espe.billingSystem.model.ArticleInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Erika
 */
public class BillingSysteam {
    
    static ArrayList listCustomer = new ArrayList();
    static ArrayList listSuplier = new ArrayList();
    static ArrayList listArticleInput = new ArrayList();
    
    public static void menu() {

        System.out.println("-----UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-----");
        System.out.println("---------------------Minimarket---------------------");
        System.out.println("1. Customers");
        System.out.println("2. Articles");//articulos
        System.out.println("3. Billing"); //
        System.out.println("4. Suppliers");//Proveedores
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
        customer.setAdress(read.nextLine());
        System.out.println("Enter the customer's document ID: ");
        customer.setDocument(read.nextInt());
        System.out.println("Enter the customer's phone number: ");
        customer.setPhone(read.nextInt());
        
        jsonCustomer = gson.toJson(customer);
        System.out.println("customer in json format -> " + jsonCustomer);
        String saveData =customer.getName()+" , "+customer.getLastName()+" , "+customer.getAdress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
        Data.save("Customer.csv",saveData);
        listCustomer.add(customer);
        read.nextLine();
        
        outCustomer(customer.getName(),customer.getLastName(),customer.getAdress(),customer.getDocument(),customer.getPhone());
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
    
        public static void articleinput()throws IOException{
        ArticleInput articleinput = new ArticleInput();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonArticleInput;
        
        System.out.println("Enter article code");
        articleinput.setarticleCode(read.nextLine());
        System.out.println("Enter article quantity");
        articleinput.setarticleQuantity(read.nextLine());
        System.out.println("Enter article date");
        articleinput.setdate(read.nextLine());
        
        jsonArticleInput = gson.toJson(articleinput);
        System.out.println("articleInformation in json format -> " + jsonArticleInput);
        String save=articleinput.getarticleCode()+" , "+articleinput.getarticleQuantity()+" , "+articleinput.getdate() +"\r";
        Data.save("ArticleInformation.csv",save);
        listArticleInput.add(articleinput);               
        outArticleInput(articleinput.getarticleCode(),articleinput.getarticleQuantity(),articleinput.getdate());
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
    public static void showArticleInput(){
        for(int i=0 ; i<listArticleInput.size(); i++){
            System.out.println(listArticleInput.get(i));
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
                        articleinput();
                        showArticleInput();
                    }catch(IOException ex){
                        Logger.getLogger(BillingSysteam.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 5 : {
                    System.out.println("Thank for use the program");
                    break;
                }
                case 3 :{
             
                }
                default : {
                    System.out.println("option no recognized");
                    
                    break;
                }     
            }
        }while(option!=5);
    }

    private static void outArticleInput(String articleCode, String articleQuantity, String date) {
        
    }
}