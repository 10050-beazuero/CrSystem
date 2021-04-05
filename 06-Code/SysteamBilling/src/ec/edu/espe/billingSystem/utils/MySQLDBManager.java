/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.utils;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Home
 */
public class MySQLDBManager extends SQLDBManager {

    @Override
    public boolean testConnection(String connection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean openConnection(String URL) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean closeConnection(String connection) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean create(String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String find(String dataToFind, String field, String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean update(String dataToFind, String newData, String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean delete(String dataToFind, String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String read(String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean create(String data, String table, BasicDBObject document) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String find(String dataBase, String dataToFind, String field, String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(String dataBase, String dataToFind, String newData, String field, String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean delete(String dataBase, String dataToFind, String field, String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String read(String dataBase, String table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
