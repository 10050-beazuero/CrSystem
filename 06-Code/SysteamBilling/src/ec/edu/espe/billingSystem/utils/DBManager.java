package ec.edu.espe.billingSystem.utils;

/**
 *
 * @author Home
 */
public interface DBManager extends Persistance {
   
    boolean openConnection(String URL);
    boolean closeConnection(String connection);
    
}
