/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import ec.edu.espe.billingSystem.model.Customer;

/**
 *
 * @author Bryan Azuero
 */
public class BaseData {
    private DB dataBase;
    private DBCollection collection;
    private BasicDBObject document = new BasicDBObject();
    
    public BaseData(){
        try {
            MongoClientURI uri = new MongoClientURI(
                    "mongodb+srv://Bryan:12345@cluster0.zqr7o.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");

            MongoClient mongoClient = new MongoClient(uri);
            dataBase = mongoClient.getDB("Customer");
            collection = dataBase.getCollection("Person");

        } catch (Exception ex) {
            System.out.println("The connection was unsuccesfull");
        }
    }
    public void create(Customer customer) {

        getDocument().put("Name", customer.getName());
        getDocument().put("IdDocument", customer.getDocument());
        getDocument().put("LastName", customer.getLastName());
        getDocument().put("Address", customer.getAddress());
        getDocument().put("Number Phone", customer.getPhone());

        getCollection().insert(getDocument());
    }

    /**
     * @return the dataBase
     */
    public DB getDataBase() {
        return dataBase;
    }

    /**
     * @param dataBase the dataBase to set
     */
    public void setDataBase(DB dataBase) {
        this.dataBase = dataBase;
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

    /**
     * @return the document
     */
    public BasicDBObject getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(BasicDBObject document) {
        this.document = document;
    }
}
