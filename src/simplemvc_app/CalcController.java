/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemvc_app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class CalcController {
    
    private CalcView theView;
    private CalcModel theModel;
    
    
    public CalcController( CalcView theView, CalcModel theModel){
    
       this.theView = theView;
       this.theModel = theModel;
    
       this.theView.addCalcListener( new CalcListener());
    }

   class CalcListener implements ActionListener{


      @Override
      public void actionPerformed(ActionEvent ae) {
          int firstNumber,secondNumber = 0;

          try{
          
              firstNumber = theView.getFirstNumber();
              secondNumber = theView.getSecondNumber();
              
              theModel.addNumbers(firstNumber, secondNumber);
         
              theView.setCalcSolution(theModel.getValue());
          }
            catch(NumberFormatException ex){
                theView.displayErrorMessage("Enter two integers");
            }
      
      }
   
   
   }
}

