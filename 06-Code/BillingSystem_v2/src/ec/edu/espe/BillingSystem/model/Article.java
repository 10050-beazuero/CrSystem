/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author casa
 */
public class Article {
    private int code;
    private int description;
    private boolean durability;
    private String type;
    private float saleprice;
    private float costprice;

    public Article(int code, int description, boolean durability, String type, float saleprice, float costprice) {
        this.code = code;
        this.description = description;
        this.durability = durability;
        this.type = type;
        this.saleprice = saleprice;
        this.costprice = costprice;
    }

    @Override
    public String toString() {
        return "Article{" + "code=" + code + ", description=" + description + ", durability=" + durability + ", type=" + type + ", saleprice=" + saleprice + ", costprice=" + costprice + '}';
    }

    
    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public int getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(int description) {
        this.description = description;
    }

    /**
     * @return the durability
     */
    public boolean isDurability() {
        return durability;
    }

    /**
     * @param durability the durability to set
     */
    public void setDurability(boolean durability) {
        this.durability = durability;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the saleprice
     */
    public float getSaleprice() {
        return saleprice;
    }

    /**
     * @param saleprice the saleprice to set
     */
    public void setSaleprice(float saleprice) {
        this.saleprice = saleprice;
    }

    /**
     * @return the costprice
     */
    public float getCostprice() {
        return costprice;
    }

    /**
     * @param costprice the costprice to set
     */
    public void setCostprice(float costprice) {
        this.costprice = costprice;
    }
}
