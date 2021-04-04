package ec.edu.espe.billingSystem.utils;

import ec.edu.espe.billingSystem.utils.Persistance;

/**
 *
 * @author Home
 */
public interface DBManager extends Persistance {
   
    boolean openConnection(String URL);
    boolean closeConnection(String connection);
    
}
