
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author Carolina
 */
public class Cash {
    
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
