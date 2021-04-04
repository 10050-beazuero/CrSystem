/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import ec.edu.espe.billingSystem.utils.DataBase;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Person {
    static ArrayList listPerson = new ArrayList();
    
    public void add()throws IOException {
        Person person = new Person() {};
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonPerson;
        System.out.println("Enter name: ");
        person.setName(read.nextLine());
        System.out.println("Enter last name: ");
        person.setLastName(read.nextLine());
        System.out.println("Enter address: ");
        person.setAddress(read.nextLine());
        System.out.println("Enter document ID: ");
        person.setDocument(read.nextInt());
        System.out.println("Enter phone number: ");
        person.setPhone(read.nextInt());
        
        jsonPerson = gson.toJson(person);
        String saveData =person.getName()+" , "+person.getLastName()+
                " , "+person.getAddress()+" , "+person.getDocument()+" , "+person.getPhone()+ "\r";
        Data.save("Person.csv",saveData);
        listPerson.add(person);
        read.nextLine();
        
        outPerson(person.getName(),person.getLastName(),
                person.getAddress(),person.getDocument(),person.getPhone());
        
    }
    public void add1() throws UnknownHostException{
        Scanner read = new Scanner(System.in);
        ec.edu.espe.billingSystem.model.Customer customerClass = new ec.edu.espe.billingSystem.model.Customer();
        DataBase database = new DataBase();
        System.out.println("Enter Id");
        int id = read.nextInt();
        customerClass.register();
        database.id(id);
        database.dBCustomer(customerClass);
        database.savePerson();
    }

    private void setName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLastName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void setAddress(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void setDocument(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void setPhone(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getLastName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getDocument() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getPhone() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void outPerson(String name, String lastName, String address, String document, String phone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
