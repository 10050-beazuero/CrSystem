
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Carolina
 */
public abstract class WayToPay {
    
    private int code;
    private int value;

    public WayToPay() {
    }
    
    public void choose(){}
    public void dataValidate(){}
    public void transaction(){}
    public void billPay(){}

    @Override
    public String toString() {
        return "WayToPay{" + "code=" + code + ", value=" + value + '}';
    }
        
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
