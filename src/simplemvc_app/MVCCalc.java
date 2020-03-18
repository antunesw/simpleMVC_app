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
public class MVCCalc {
    
    
    public static void main(String[] args) {
       
    CalcView  theView = new CalcView();
    CalcModel theModel = new CalcModel();
    
    CalcController theController = new CalcController( theView, theModel);
    
    theView.setVisible(true);
    }
    
    

}
