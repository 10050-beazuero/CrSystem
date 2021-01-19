
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author Carolina
 */
public class Cashier {
    
    private String name;
    private String lastName;

    public Cashier(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

        
    public void pasword(){}
    public void number(){}

    @Override
    public String toString() {
        return "Cashier{" + "name=" + name + ", lastName=" + lastName + '}';
    }

        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
