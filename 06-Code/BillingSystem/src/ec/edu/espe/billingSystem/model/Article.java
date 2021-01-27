
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author Carolina
 */
public class Article {
    
    private int code;
    private String description;
    private int quantity;
    private String type;
    private float salePrice;
    private float costPrice;

    public Article() {
    }
    
    public void enter(){}
    public void modify(){}
    public void delete(){}
    public void check(){}
    public void search(){}
    public void showData(){}
    public void valuate(){}

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
        
}