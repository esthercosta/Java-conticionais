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
public class impostorendan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double salario, resp = 0;
        
  salario = Double.parseDouble(JOptionPane.showInputDialog(" Qual seu salario "));
  
  if ( salario<=1903.98){ 
    resp = 0 ;
   }  

   else if  (( salario>=1903.98) && (salario<=2826.65)){ 
    resp = salario * 0.075;
   }
    

if (( salario>=2826.66) && (salario<=3751.05)) {
    resp = salario * 0.15 ;
}
    

if (( salario>=3751.06) && (salario<=4664.68)){ 
    resp = salario * 0.225 ;
} 

if(salario>4664.68){ 
   resp = salario * 0.275 ;
}
 
    

         JOptionPane.showMessageDialog(null," o desconto na sua folha de pagamento sera de R$ " + resp);
    
    }

}





    
    

