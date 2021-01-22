/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.view;

import ec.edu.espe.BillingSystem.model.Customer;
import ec.edu.espe.BillingSystem.model.Suplier;
import ec.edu.espe.FileManager.utils.Data;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USUARIO
 */
public class BillingSysteam {
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
        System.out.println("Enter customer name");
        customer.setName(read.nextLine());
        System.out.println("Enter customer's last name");
        customer.setLastname(read.nextLine());
        System.out.println("Enter customer address");
        customer.setAdress(read.nextLine());
        System.out.println("Enter the customer's document ID");
        customer.setDocument(read.nextInt());
        System.out.println("Enter the customer's phone number");
        customer.setPhone(read.nextInt());
        
        String saveData =customer.getName()+" , "+customer.getLastname()+" , "+customer.getAdress()+" , "+customer.getDocument()+" , "+customer.getPhone()+ "\r";
        Data.save("Customer.csv",saveData);
        
        outCustomer(customer.getName(),customer.getLastname(),customer.getAdress(),customer.getDocument(),customer.getPhone());
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
        System.out.println("Enter trade name");
        suplier.setTradename(read.nextLine());
        System.out.println("Enter article name");
        suplier.setArticlename(read.nextLine());
        
        String save=suplier.getTradename()+" , "+suplier.getArticlename()+ "\r";
        Data.save("Suplier.csv",save);
        
        outSuplier(suplier.getTradename(),suplier.getArticlename());
    }
        public static void outSuplier(String tradename,String articlename){
        System.out.println("TRADE NAME :"+ tradename);
        System.out.println("ATICLE NAME :"+ articlename);
        }

    
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);
        int option = 0;
        do{
            menu();
            option =read.nextInt();
            switch(option){
                case 1 -> {
                    try{registerClient();
                    }catch(IOException ex){
                        Logger.getLogger(BillingSysteam.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    break;
                }
                case 4 -> {
                     try{suplier();
                    }catch(IOException ex){
                        Logger.getLogger(BillingSysteam.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    break;
                }
                case 5 -> {
                    System.out.println("Thank for use the program");
                    break;
                }
                default -> {
                    System.out.println("option no recognized");
                    break;
                }
                   
                    
                    
            }
                
            
        }while(option!=5);
    }
}


