
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author Carolina
 */
public class Suplier {
    
    private String tradeName;
    private String articleName;

    public Suplier(String tradeName, String articleName) {
        this.tradeName = tradeName;
        this.articleName = articleName;
    }

    public Suplier() {
    }
        
    public void suplierConsult(){}
    public void articleStatus(){}

    @Override
    public String toString() {
        return "Suplier{" + "tradeName=" + tradeName + ", articleName=" + articleName + '}';
    }
       
    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }
}
