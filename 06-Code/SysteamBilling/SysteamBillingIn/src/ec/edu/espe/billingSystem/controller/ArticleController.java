/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class ArticleController {
    static ArrayList Articles = new ArrayList();
    
     public void add() throws IOException{
        ArticleController article = new ArticleController();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonArticle;
        
        System.out.println("Enter description");
        article.setDescription(read.nextLine());
        System.out.println("Enter type");
        article.setType(read.nextLine());
        System.out.println("Enter code");
        article.setCode(read.nextInt());
        System.out.println("Enter quantity");
        article.setQuantity(read.nextInt());
        System.out.println("Enter sale price");
        article.setSalePrice(read.nextFloat());
        System.out.println("Enter cost price");
        article.setCostPrice(read.nextFloat());

        
        jsonArticle = gson.toJson(article);
        System.out.println("Article information in json format -> " + jsonArticle);
        String saveData=article.getCode()+" , "+article.getDescription()+
                " , "+article.getQuantity()+" , "+ article.getType()+" , "+article.getSalePrice() +
                " , "+article.getCostPrice() +"\r";
        Data.save("Article.csv",saveData);
        Articles.add(article);    
    }

    private void outArticle(int code, String description, int quantity, String type, float salePrice, float costPrice) {
        
    }

    private void setDescription(String nextLine) {
    }

    private void setType(String nextLine) {
    }

    private void setCode(int nextInt) {
    }

    private void setQuantity(int nextInt) {
    }

    private void setSalePrice(float nextFloat) {
    }

    private void setCostPrice(float nextFloat) {
    }

    private String getCode() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String getQuantity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getSalePrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getCostPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
