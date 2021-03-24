/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BillingSystem.view;

import ec.edu.espe.billingSystem.controller.Article;
import ec.edu.espe.billingSystem.controller.Bill;
import ec.edu.espe.billingSystem.controller.Customer;
import ec.edu.espe.billingSystem.controller.Person;
import ec.edu.espe.billingSystem.controller.Suplier;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Carolina Alvarado
 */
public class billingSystem {
    static ArrayList Customers = new ArrayList();
    static ArrayList Supliers = new ArrayList();
    static ArrayList Articles = new ArrayList();
    static ArrayList Bills = new ArrayList();
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
        Person person = new Person() {};
        Scanner read = new Scanner (System.in);
        
        int option = 0;
        do{
            menu();
            option =read.nextInt();
            switch(option){
                case 1 : {
                    person = new Customer();
                    try{
                        customer.add();
                        showCustomer();
                    }catch(IOException ex){
                        Logger.getLogger(billingSystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 4 : {
                    person = new Suplier();
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
        for(int i=0 ; i<Customers.size(); i++){
            System.out.println(Customers.get(i));
        }
}
    public static void showSuplier(){
        for(int i=0 ; i<Supliers.size(); i++){
            System.out.println(Supliers.get(i));
        }
    }
    public static void showArticle(){
        for(int i=0 ; i<Articles.size(); i++){
            System.out.println(Articles.get(i));
        }
    }
    public static void showBill(){
        for(int i=0 ; i<Bills.size(); i++){
            System.out.println(Bills.get(i));
        }
    }
}