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
public class aumentosalarion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double salario, resp ;
        
      //entrada
      
    salario= Double.parseDouble( JOptionPane.showInputDialog(" digite seu salario "));
    if(salario<=1500){
    resp = salario*1.20;
        
    }
    else if (salario>1500 && salario <=3000) {
    resp = salario*1.15;
    }else {
    resp = salario*1.10;
    }
 
    JOptionPane.showMessageDialog(null," seu salario com aumento sera de R$ " +resp);
}


    
    
    }
    

