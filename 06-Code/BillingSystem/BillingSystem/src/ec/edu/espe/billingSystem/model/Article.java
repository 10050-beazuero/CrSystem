/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author USUARIO
 */
public class Article {
    private String type;
    private int code;
    private int description;
    private float saleprice;
    private float costprice;
    private boolean durability;

    public Article(String type, int code, int description, float saleprice, float costprice, boolean durability) {
        this.type = type;
        this.code = code;
        this.description = description;
        this.saleprice = saleprice;
        this.costprice = costprice;
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
    
}
