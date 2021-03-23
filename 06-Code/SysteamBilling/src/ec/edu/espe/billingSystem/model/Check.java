
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author Angel Aguirre
 */
public class Check extends WayToPay{
    
    private String clientName;
    private int idNumber;

    public Check(String clientName, int idNumber) {
        this.clientName = clientName;
        this.idNumber = idNumber;
    }

    public Check(String clientName, int idNumber, int code, int value) {
        super(code, value);
        this.clientName = clientName;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Check{" + "clientName=" + clientName + ", idNumber=" + idNumber + '}';
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

   
    
    
}
