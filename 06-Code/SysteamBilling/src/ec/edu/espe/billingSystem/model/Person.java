/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;
import ec.edu.espe.FileManagerProyect.utils.Data;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Angel Aguirre
 */
public class Person {
    static ArrayList listPerson = new ArrayList();
    private String name;
    private int document;
    private String lastName;
    private String address;
    private int phone;
    
    public Person(String name, int document, String lastName, String address, int phone) {
        this.name = name;
        this.document = document;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    public Person() {
        
    }
    public void add()throws IOException {
        Person person = new Person();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonPerson;
        System.out.println("Enter the name: ");
        person.setName(read.nextLine());
        System.out.println("Enter the last name: ");
        person.setLastName(read.nextLine());
        System.out.println("Enter the address: ");
        person.setAddress(read.nextLine());
        System.out.println("Enter the  document ID: ");
        person.setDocument(read.nextInt());
        System.out.println("Enter the phone number: ");
        person.setPhone(read.nextInt());
        
        jsonPerson = gson.toJson(person);
        String saveData =person.getName()+" , "+person.getLastName()+" , "+person.getAddress()+" , "+person.getDocument()+" , "+person.getPhone()+ "\r";
        Data.save("Person.csv",saveData);
        listPerson.add(person);
        read.nextLine();
        
        outPerson(person.getName(),person.getLastName(),person.getAddress(),person.getDocument(),person.getPhone());
        
    }
    

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
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

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    private void outPerson(String name, String lastName, String address, int document, int phone) {
        
    }
}
