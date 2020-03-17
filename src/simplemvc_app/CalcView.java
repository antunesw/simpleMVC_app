/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemvc_app;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcView extends JFrame {
    
private JTextField firstNumber = new JTextField(10);
private JLabel additionLabel = new JLabel("+");
private JTextField secondNumber = new JTextField("10");
private JButton calcButton = new JButton ();
private JTextField calcSolution = new JTextField ("10");

    CalcView (){
    
        JPanel calcPanel = new JPanel ();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calcButton);
        calcPanel.add(calcSolution);
        
        this.add(calcPanel);
      }
    public int getFirstNumber(){
    
    return Integer.parseInt(firstNumber.getText());
    }
    
    public int getSecondNumber(){
    
    return Integer.parseInt(secondNumber.getText());
    
    }
   
    public int getCalcSolution(){
    
        return Integer.parseInt(calcSolution.getText());
    }
    
    public void setCalcSolution(int solution){
    
        calcSolution.setText(Integer.toString(solution));
    
    }
    
    void addCalcListener(ActionListener listenForCalcButton){
    
        calculateButton.addActionlistener(listenerForCalcButton);
        
    }
    
    void displayErrorMessage(String errorMessage){
    
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    
}
