/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemvc_app;

/**
 *
 * @author HP
 */
public class CalcModel {
    
    private int calcValue;

    public void addNumbers(int firstValue , int secondValue){
    
        calcValue = firstValue + secondValue;
        
    }

        public int getValue (){
        
            return calcValue;
        }
        
        
}
