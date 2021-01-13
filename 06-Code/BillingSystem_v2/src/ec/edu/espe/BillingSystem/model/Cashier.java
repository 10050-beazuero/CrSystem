/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BillingSystem.model;

/**
 *
 * @author casa
 */
public class Cashier {
    private String name;
    private String lastname;

    @Override
    public String toString() {
        return "Cashier{" + "name=" + name + ", lastname=" + lastname + '}';
    }

    public Cashier(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
