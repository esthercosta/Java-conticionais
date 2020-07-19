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
public class imcn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           double altura, peso ;
       double imc ;
      
 altura = Double.parseDouble(JOptionPane.showInputDialog(" Qual sua  altura "));
        
  peso  = Double.parseDouble(JOptionPane.showInputDialog(" Qual seu peso  "));
     
  imc = (peso/(altura*altura));
    

  if (( imc <=18.5)) {
   JOptionPane.showMessageDialog(null, " abaixo do peso com imc de " + imc );   
        
    }
  
  
  if (( imc > 18.5) && (imc <= 24.9)){ 
    JOptionPane.showMessageDialog(null, "  peso  normal com imc de "+ imc );   
   
  }
   

if (( imc >= 25) && (imc <= 29.9)) { 
 JOptionPane.showMessageDialog(null, "  sobrepeso  com imc de " +imc );   
      

}
   
if(( imc >= 30) && (imc <= 34.9)) {
  JOptionPane.showMessageDialog(null, " obesidade grau 1  com imc de " + imc );   
     
}
  

if(( imc >= 35) && (imc <= 39.9)){
 JOptionPane.showMessageDialog(null, "  Obesidade grau 2 com imc de " +imc );   
     
}

    
if (( imc >= 40)) {
  JOptionPane.showMessageDialog(null, " obesidade grau 3 com imc de  " + imc  );   
     
}

    
    }
 


}

    
    

