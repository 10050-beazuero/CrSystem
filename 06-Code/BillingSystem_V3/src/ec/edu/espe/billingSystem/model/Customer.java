
package ec.edu.espe.billingSystem.model;

/**
 *
 * @author Carolina
 */
public class Customer {
    
    private int document;
    private String name;
    private String lastName;
    private String adress;
    private int phone;

    public Customer(int document, String name, String lastName, String adress, int phone) {
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.phone = phone;
    }

    public Customer() {
        }


    @Override
    public String toString() {
        return "Customer{" + "document=" + document + ", name=" + name + ", lastName=" + lastName + ", adress=" + adress + ", phone=" + phone + '}';
    }
    
    
    
    public void payment(){}

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }    
}
