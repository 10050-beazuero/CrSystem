
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author Carolina
 */
public class ArticleOutput {
    
    private int articleCode;
    private int articleQuantity;
    private int date;

    public ArticleOutput(int articleCode, int articleQuantity, int date) {
        this.articleCode = articleCode;
        this.articleQuantity = articleQuantity;
        this.date = date;
    }

        
    public void decreaseStock(){}

    @Override
    public String toString() {
        return "ArticleOutput{" + "articleCode=" + articleCode + ", articleQuantity=" + articleQuantity + ", date=" + date + '}';
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
}
