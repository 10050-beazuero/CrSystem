
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Home
 */
public class Check extends WayToPay{
    
    private String clientName;
    private int idNumber;
    private int value;

    public Check(String clientName, int idNumber, int value) {
        this.clientName = clientName;
        this.idNumber = idNumber;
        this.value = value;
    }

    
    public void verifyFunds(){}

    @Override
    public String toString() {
        return "Check{" + "clientName=" + clientName + ", idNumber=" + idNumber + 
                ", value=" + value + '}';
    }

        
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }
}
