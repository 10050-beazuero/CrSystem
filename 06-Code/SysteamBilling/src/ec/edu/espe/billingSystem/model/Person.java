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
import ec.edu.espe.billingSystem.controller.DataBase;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Angel Aguirre
 */
public class Person {
    private static ArrayList listPerson = new ArrayList();
    private String name;
    private String document;
    private String lastName;
    private String address;
    private String phone;
    private Customer customer;

    public Person(String name, String document, String lastName, String address, String phone) {
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
        person.setDocument(read.nextLine());
        System.out.println("Enter the phone number: ");
        person.setPhone(read.nextLine());
        
        jsonPerson = gson.toJson(person);
        String saveData =person.getName()+" , "+person.getLastName()+" , "+person.getAddress()+" , "+person.getDocument()+" , "+person.getPhone()+ "\r";
        Data.save("Person.csv",saveData);
        getListPerson().add(person);
        read.nextLine();
        
        //outPerson(person.getName(),person.getLastName(),person.getAddress(),person.getDocument(),person.getPhone());
        
    }
    public void add1() throws UnknownHostException{
        Scanner read = new Scanner(System.in);
        Customer customerClass = new Customer();
        DataBase database = new DataBase();
        System.out.println("Enter Id");
        int id = read.nextInt();
        customerClass.register();
        database.id(id);
        database.dBCustomer(customerClass);
        database.savePerson();
    }

    /**
     * @return the listPerson
     */
    public static ArrayList getListPerson() {
        return listPerson;
    }

    /**
     * @param aListPerson the listPerson to set
     */
    public static void setListPerson(ArrayList aListPerson) {
        listPerson = aListPerson;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
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
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
