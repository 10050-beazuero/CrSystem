
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Angel Aguirre
 */
public class Cash extends WayToPay{

    public Cash() {
    }

    public Cash(int code, int value) {
        super(code, value);
    }

    @Override
    public String toString() {
        return "Cash{" + '}';
    }
    
     
}
