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
public class Suplier {

    public static String get;
    private String tradename;
    private String articlename;

    public Suplier() {
        
    }

    @Override
    public String toString() {
        return "Suplier{" + "tradename=" + tradename + ", articlename=" + articlename + '}';
    }

    public Suplier(String tradename, String articlename) {
        this.tradename = tradename;
        this.articlename = articlename;
    }

    /**
     * @return the tradename
     */
    public String getTradename() {
        return tradename;
    }

    /**
     * @param tradename the tradename to set
     */
    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    /**
     * @return the articlename
     */
    public String getArticlename() {
        return articlename;
    }

    /**
     * @param articlename the articlename to set
     */
    public void setArticlename(String articlename) {
        this.articlename = articlename;
    }

    public void settradename(String nextLine) {
        
    }

    public void setarticlename(String nextLine) {
        
    }
}
