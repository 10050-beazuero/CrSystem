
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Carolina
 */
public class InvoiceDetail {
    
    private int billCode;
    private int articleCode;
    private int amount;
    private float iva;
    private int salePrice;

    public InvoiceDetail(int billCode, int articleCode, int amount, float iva, int salePrice) {
        this.billCode = billCode;
        this.articleCode = articleCode;
        this.amount = amount;
        this.iva = iva;
        this.salePrice = salePrice;
    }

        
    public void dataCenter(){}
    public void totalCalculate(){}
    public void showBillDetail(){}

    @Override
    public String toString() {
        return "InvoiceDetail{" + "billCode=" + billCode + ", articleCode=" + articleCode + ", amount=" + amount + ", iva=" + iva + ", salePrice=" + salePrice + '}';
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
}
