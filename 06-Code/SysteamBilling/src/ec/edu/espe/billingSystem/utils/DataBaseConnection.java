/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.utils;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Azuero
 */
public final class DataBaseConnection {
    private MongoClient mongoClient;
    private MongoClientURI mongoURI;
    private DB database;
    private DBCollection collection;

    public DataBaseConnection(){
        mongoURI = new MongoClientURI("mongodb+srv://Bryan:12345@cluster0.zqr7o.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        mongoClient = new MongoClient(getMongoURI());
        database = mongoClient.getDB("Billing system");
        collection = database.getCollection("Person");
        JOptionPane.showMessageDialog(null,"Established Connection");
    }

    /**
     * @return the mongoClient
     */
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    /**
     * @param mongoClient the mongoClient to set
     */
    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    /**
     * @return the mongoURI
     */
    public MongoClientURI getMongoURI() {
        return mongoURI;
    }

    /**
     * @param mongoURI the mongoURI to set
     */
    public void setMongoURI(MongoClientURI mongoURI) {
        this.mongoURI = mongoURI;
    }

    /**
     * @return the database
     */
    public DB getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(DB database) {
        this.database = database;
    }

    /**
     * @return the collection
     */
    public DBCollection getCollection() {
        return collection;
    }

    /**
     * @param collection the collection to set
     */
    public void setCollection(DBCollection collection) {
        this.collection = collection;
    }
    
    
}

