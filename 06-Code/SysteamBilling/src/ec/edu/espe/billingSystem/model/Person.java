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

    public Person(String name, String document, String lastName, String address, String phone, Customer customer) {
        this.name = name;
        this.document = document;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", document=" + document + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone + ", customer=" + customer + '}';
    }

    public static ArrayList getListPerson() {
        return listPerson;
    }

    public static void setListPerson(ArrayList listPerson) {
        Person.listPerson = listPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
}
