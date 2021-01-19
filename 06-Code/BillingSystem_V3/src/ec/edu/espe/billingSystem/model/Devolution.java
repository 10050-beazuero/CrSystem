
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author Carolina
 */
public class Devolution {
    
    private int code;
    private int billCode;
    private int articleCode;
    private int quantity;

    public Devolution(int code, int billCode, int articleCode, int quantity) {
        this.code = code;
        this.billCode = billCode;
        this.articleCode = articleCode;
        this.quantity = quantity;
    }

        
    public void registerReturn(){}
    public void returnValidity(){}

    @Override
    public String toString() {
        return "Devolution{" + "code=" + code + ", billCode=" + billCode + ", articleCode=" + articleCode + ", quantity=" + quantity + '}';
    }

        
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getBillCode() {
        return billCode;
    }

    public void setBillCode(int billCode) {
        this.billCode = billCode;
    }

    public int getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(int articleCode) {
        this.articleCode = articleCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
