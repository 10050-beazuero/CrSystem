
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Carolina
 */
public class Cash extends WayToPay{
    
    private int value;

    public Cash(int value) {
        this.value = value;
    }

       
    public void giveChange(){}

    @Override
    public String toString() {
        return "Cash{" + "value=" + value + '}';
    }

        
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
