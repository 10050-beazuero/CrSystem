
package ec.edu.espe.billingSystem.model;
/**
 *
 * @author Erika
 */
public class Person {
    
    private String name;
    private int document;
    private String lastName;
    private String address;
    private int phone;

    public Person(String name, int document, String lastName, String address, int phone) {
        this.name = name;
        this.document = document;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

        
    public void add() {}
    public void remove(){}
    public void modify(){}
    public void search(){}
    public void showReport(){}

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", document=" + document + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone + '}';
    }

        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }    
}
