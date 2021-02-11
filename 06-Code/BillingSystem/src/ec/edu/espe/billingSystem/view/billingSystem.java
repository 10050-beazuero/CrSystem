/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BillingSystem.view;

import ec.edu.espe.BillingSystem.model.Bill;
import ec.edu.espe.BillingSystem.model.Customer;
import ec.edu.espe.BillingSystem.model.Suplier;
import ec.edu.espe.billingSystem.model.Article;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Aguirre
 */
public class billingSystem {
    static ArrayList listCustomer = new ArrayList();
    static ArrayList listSuplier = new ArrayList();
    static ArrayList listArticle = new ArrayList();
    static ArrayList listBill = new ArrayList();
    public static void menu() {

        System.out.println("---------------------Minimarket---------------------");
        System.out.println("1. Customers");
        System.out.println("2. Articles");
        System.out.println("3. Billing");
        System.out.println("4. Suppliers");
        System.out.println("5. Exit");
        System.out.println("Select the option: ");

    }
    public static void main(String[] args) throws IOException {
        Customer customer = new Customer();
        Suplier suplier = new Suplier();
        Article article = new Article();
        Bill bill= new Bill();
        Scanner read = new Scanner (System.in);
        
        int option = 0;
        do{
            menu();
            option =read.nextInt();
            switch(option){
                case 1 : {
                    try{
                        customer.add();
                        showCustomer();
                    }catch(IOException ex){
                        Logger.getLogger(billingSystem.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    break;
                }
                case 4 : {
                     try{
                        suplier.add();
                        showSuplier();
                    }catch(IOException ex){
                        Logger.getLogger(billingSystem.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    break;
                }
                case 2 : {
                     try{
                        article.add();
                        showArticle();
                    }catch(IOException ex){
                        Logger.getLogger(billingSystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 3 : {
                    try{
                        bill.dataEntry();
                        showBill();
                    }catch(IOException ex){
                        Logger.getLogger(billingSystem.class.getName()).log(Level.SEVERE, null, ex);
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
    public static void showBill(){
        for(int i=0 ; i<listBill.size(); i++){
            System.out.println(listBill.get(i));
        }
    }
}