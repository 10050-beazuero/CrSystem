/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;

import java.util.ArrayList;

/**
 *
 * @author Carolina Alvarado
 */
public class Suplier extends Person{
    private String articleName;

    public Suplier() {
        
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Suplier(String articleName, String name, int document, String lastName, String address, int phone) {
        super(name, document, lastName, address, phone);
        this.articleName = articleName;
    }

}
