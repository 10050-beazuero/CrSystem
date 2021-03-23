
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Angel Aguirre
 */
public class WayToPay {
    
    private int code;
    private int value;

    public WayToPay() {
    }

    public WayToPay(int code, int value) {
        this.code = code;
        this.value = value;
    }
    

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
