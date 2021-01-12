/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author USUARIO
 */
public class ArticleInput {
    private int articlecode;
    private int articlequantity;
    private int date;

   

    public ArticleInput(int articlecode, int articlequantity, int date) {
        this.articlecode = articlecode;
        this.articlequantity = articlequantity;
        this.date = date;
    }

    /**
     * @return the articlecode
     */
    public int getArticlecode() {
        return articlecode;
    }

    /**
     * @param articlecode the articlecode to set
     */
    public void setArticlecode(int articlecode) {
        this.articlecode = articlecode;
    }

    /**
     * @return the articlequantity
     */
    public int getArticlequantity() {
        return articlequantity;
    }

    /**
     * @param articlequantity the articlequantity to set
     */
    public void setArticlequantity(int articlequantity) {
        this.articlequantity = articlequantity;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(int date) {
        this.date = date;
    }
    
    
}
