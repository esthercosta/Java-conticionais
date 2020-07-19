/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class podeounaocompetirn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double altura, idade ;
        
        
 altura = Double.parseDouble(JOptionPane.showInputDialog(" Qual sua altura "));
  idade = Double.parseDouble(JOptionPane.showInputDialog(" Qual sua idade "));
   
         
   if ((altura >= 1.75) && (idade >= 18)) {
  JOptionPane.showMessageDialog(null, "  pode competir ");       
} 
              
            
 if (( altura < 1.75) && ( idade < 18 )) {
   JOptionPane.showMessageDialog(null, " nao pode competir ");     

 }
 
 
    }


    
    
}
