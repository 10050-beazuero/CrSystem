/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel Aguirre
 */
public class Suplier extends Person{
    
    private String articleName;

    public Suplier(String articleName, String name, String document, String lastName, String address, String phone, Customer customer) {
        super(name, document, lastName, address, phone, customer);
        this.articleName = articleName;
    }

    @Override
    public String toString() {
        return "Suplier{" + "articleName=" + articleName + '}';
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    
}
