/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FileManagerProyect.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USUARIO
 */
public class Data {
    static int lineasTotales;
    static int totalCoincidencias;
    public static void save(String fileName, String record) throws IOException  {
        //TODO code to save data in a file
        System.out.println("Calling save method, with parameters: " + fileName + " and " + record);
        
        File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();    
            }      
        try {              
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            fw.write(record);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
     public static void find(File  fileName, String data){
        //TODO code to find information in a file
        try{
                    if(fileName.exists()){
                        BufferedReader readArchive=new BufferedReader(new FileReader(fileName));
                        String readLine;
                        
                        while((readLine=readArchive.readLine())!=null){
                            lineasTotales=lineasTotales+1;
                            String[] words=readLine.split(",");
                            
                            for(int i=0;i<words.length;i++){
                                if(words[i].equals(data)){
                                    totalCoincidencias=totalCoincidencias+1;
                                    System.out.println(readLine);
                                    System.out.println("\nOn the line: "+lineasTotales+" the word was found: "+totalCoincidencias+" occasion.");
                                }
                            }    
                        }
                    }  
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
    }
    
    public static boolean remove(String fileName, String data){
        //TODO code to remove information in a file
        
        boolean removed;
        
        removed = true;
        return removed;
        
    }
    
    public static boolean update(String fileName, String data){
        //TODO code to update information in a file
        
        boolean modified;
        
        modified = true;
        return modified;
        
    }
    
    public static String findAll(String fileName, String data){
        //TODO code to find information in a file
        
        String results;
        
        results = "Bryan Azuero,San carlos ,1751986162,0988912907\n";
        return results;
        
    } 
    
}
