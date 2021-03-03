/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.billingSystem.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

/**
 *
 * @author Bryan Azuero
 */
public class DataBase {
    DB dataBase;
    DBCollection colection;
    BasicDBObject file = new BasicDBObject();

    public DataBase(){
        Mongo mongo = new Mongo("localHost",27017);
        dataBase = mongo.getDB("DataBase");
        colection = dataBase.getCollection("Person");
        System.out.println("Established connection");
    }
     public boolean insert(String coleccion,String name,String lastname,String address,int document){
        colection = dataBase.getCollection(coleccion);
        file.put("Name:",name);
        file.put("Lastname:",lastname);
        file.put("Address:",address);
        file.put("IdDocument:",document);
        colection.insert(file);
        return true;
    }
     public void mostrar(String coleccion){
        colection = dataBase.getCollection(coleccion);
        DBCursor cursor = colection.find();
        while(cursor.hasNext()){
            System.out.println("*" + cursor.next());
        }
    }
     public void SeachrByName(String coleccion,String name){
        colection = dataBase.getCollection(coleccion);
        BasicDBObject consulta = new BasicDBObject();
        consulta.put("Name:",name);
        DBCursor cursor = colection.find(consulta);
        while(cursor.hasNext()){
            System.out.println("--"+ cursor.next().get("Name:")+" - " + cursor.curr().get("Lastname:")+
                    " - "+ cursor.curr().get("Address:")+" - "+cursor.curr().get("IdDocument:"));
        }
    }
    public void updateAdrees(String coleccion,String name,String addressNew){
        colection = dataBase.getCollection(coleccion);
        BasicDBObject actualizarAddress = new BasicDBObject();
        actualizarAddress.append("$set",new BasicDBObject().append("Address:",addressNew));
        BasicDBObject bucarPorNombre = new BasicDBObject();
        bucarPorNombre.append("Name:",name);
        colection.updateMulti(bucarPorNombre,actualizarAddress);
    }
    public void updateName(String coleccion,String name,String nameNew){
        colection = dataBase.getCollection(coleccion);
        BasicDBObject actualizarName = new BasicDBObject();
        actualizarName.append("$set",new BasicDBObject().append("Name:",nameNew));
        BasicDBObject bucarPorNombre = new BasicDBObject();
        bucarPorNombre.append("Name:",name);
        colection.updateMulti(bucarPorNombre,actualizarName);
        
    }
    public void updateLastName(String coleccion,String name,String lastNameNew){
        colection = dataBase.getCollection(coleccion);
        BasicDBObject actualizarLastname = new BasicDBObject();
        actualizarLastname.append("$set",new BasicDBObject().append("Lastname:",lastNameNew));
        BasicDBObject bucarPorNombre = new BasicDBObject();
        bucarPorNombre.append("Name:",name);
        colection.updateMulti(bucarPorNombre,actualizarLastname);
    }
    public void delate(String coleccion,String name){
        colection = dataBase.getCollection(coleccion);
        colection.remove(new BasicDBObject().append("Name:",name));
    }
     
     
    
}
