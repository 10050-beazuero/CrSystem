/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MCD.controller;

/**
 *
 * @author Bryan Castro
 */
public class Operation implements IOperation {

    @Override
    public float mcd(float divisor1, float divisor2) {
        
        float mcd = 0 ;
            while(divisor1 != divisor2)
                if(divisor1 > divisor2)
                 mcd= divisor1 - divisor2;
                else
                    mcd= divisor2 - divisor1;
        return mcd;  
        
            }
}
