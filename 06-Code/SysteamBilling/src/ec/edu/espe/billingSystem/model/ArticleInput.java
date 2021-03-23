
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Carolina
 */
public class ArticleInput {
    
    private int articleCode;
    private int articleQuantity;
    private int date;

    public ArticleInput(int articleCode, int articleQuantity, int date) {
        this.articleCode = articleCode;
        this.articleQuantity = articleQuantity;
        this.date = date;
    }

    public ArticleInput() {
        
    }

        


    @Override
    public String toString() {
        return "ArticleInput{" + "articleCode=" + articleCode + ", articleQuantity=" + articleQuantity + ", date=" + date + '}';
    }

        
    public int getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(int articleCode) {
        this.articleCode = articleCode;
    }

    public int getArticleQuantity() {
        return articleQuantity;
    }

    public void setArticleQuantity(int articleQuantity) {
        this.articleQuantity = articleQuantity;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setarticleCode(String nextLine) {
        
    }

    public void setarticleQuantity(String nextLine) {
        
    }

    public void setdate(String nextLine) {
        
    }

    public String getarticleCode() {
        return null;
        
    }

    public String getarticleQuantity() {
        return null;
        
    }

    public String getdate() {
        return null;
        
    }
}
