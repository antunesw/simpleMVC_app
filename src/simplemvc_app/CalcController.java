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
public class CalcController {
    
    private CalcView theView;
    private CalcModel theModel;
    
    
    public CalcController( CalcView theView, CalcModel theModel){
    
       this.theView = theView;
       this.theModel = theModel;
    
       this.theView.addCalcListener( new CalcListener());
    }

    class CalcListener implements Actionlistener{
    
    public void actionPerformed(ActionEvent arg0){}
    
    }
}

