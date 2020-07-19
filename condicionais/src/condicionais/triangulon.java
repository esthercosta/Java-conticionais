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
public class triangulon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          double a,b,c;
  
a=  Double.parseDouble(JOptionPane.showInputDialog(" Digite o primeiro lado do triangulo " ));

 b= Double.parseDouble(JOptionPane.showInputDialog(" Digite o segundo lado do triangulo"));

c=  Double.parseDouble(JOptionPane.showInputDialog(" Digite o terceiro lado do triangulo"));

     
    
 if(((a<(b+c)) && (a > (Math.abs(b-c)))) && ((b<(a+c)) && (b > (Math.abs(a-c)))) && ((c<(b+a)) && (c> (Math.abs(b-a))))) {
 
     if(((a==b) && (b==c) && (a==c))){
     JOptionPane.showMessageDialog(null, " É triangulo equilatero ");
     
     }
     
     
      if(((a!=b)&&(b!=c) && (a!=c))){
     JOptionPane.showMessageDialog(null, " É triangulo escaleno ");
     
      }
     
      if(   a != b || b == c&&(b != c||c == a)&&(a != c||c == b)){
      } else {
          JOptionPane.showMessageDialog(null, " É triangulo isóceles ");
            }
        
      
      
 }else{
            
     JOptionPane.showMessageDialog(null, " Não é um triangulo ");
          
 }         
     
    }    
    
 

}
    
    