
package ec.edu.espe.billingSystem.model;

import com.google.gson.Gson;
import ec.edu.espe.FileManagerProyect.utils.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Article {
    static ArrayList Articles = new ArrayList();
    private int code;
    private String description;
    private int quantity;
    private String type;
    private float salePrice;
    private float costPrice;

    public Article() {
    }
    
    public void add() throws IOException{
        Article article = new Article();
        Scanner read = new Scanner(System.in);
        Gson gson = new Gson();
        String jsonArticle;
        
        System.out.println("Enter article description");
        article.setDescription(read.nextLine());
        System.out.println("Enter article type");
        article.setType(read.nextLine());
        System.out.println("Enter article code");
        article.setCode(read.nextInt());
        System.out.println("Enter article quantity");
        article.setQuantity(read.nextInt());
        System.out.println("Enter article sale price");
        article.setSalePrice(read.nextFloat());
        System.out.println("Enter article cost price");
        article.setCostPrice(read.nextFloat());

        
        jsonArticle = gson.toJson(article);
        System.out.println("articleInformation in json format -> " + jsonArticle);
        String saveData=article.getCode()+" , "+article.getDescription()+" , "+article.getQuantity()+" , "+ article.getType()+" , "+article.getSalePrice() + " , "+article.getCostPrice() +"\r";
        Data.save("Article.csv",saveData);
        Articles.add(article);               
        outArticle(article.getCode(),article.getDescription(),article.getQuantity(),article.getType(),article.getSalePrice(),article.getCostPrice());
    }
    

    @Override
    public String toString() {
        return "Article{" + "code=" + code + ", description=" + description + ", quantity=" + quantity + ", type=" + type + ", salePrice=" + salePrice + ", costPrice=" + costPrice + '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public float getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(float costPrice) {
        this.costPrice = costPrice;
    }

    private void outArticle(int code, String description, int quantity, String type, float salePrice, float costPrice) {
        
    }
        
}