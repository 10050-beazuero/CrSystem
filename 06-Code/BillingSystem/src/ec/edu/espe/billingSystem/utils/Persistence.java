/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.utils;

/**
 *
 * @author Angel Aguirre
 */
public interface Persistence {
    boolean save(String data, String table);
    String find(String dataToFind, String field, String table);
    boolean update(String dataToFind, String newData, String table);
    boolean delete(String datatoFind, String table);
    String read(String table);
}
