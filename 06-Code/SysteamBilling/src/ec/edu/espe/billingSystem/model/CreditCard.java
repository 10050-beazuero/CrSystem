
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Angel Aguirre
 */
public class CreditCard extends WayToPay{
    
    private String cardName;
    private int cardNumber;
    private int securityCode;
    private int dateExpiry;

    public CreditCard(String cardName, int cardNumber, int securityCode, int dateExpiry) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.dateExpiry = dateExpiry;
    }

    public CreditCard(String cardName, int cardNumber, int securityCode, int dateExpiry, int code, int value) {
        super(code, value);
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.dateExpiry = dateExpiry;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "cardName=" + cardName + ", cardNumber=" + cardNumber + ", securityCode=" + securityCode + ", dateExpiry=" + dateExpiry + '}';
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public int getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(int dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    
}
