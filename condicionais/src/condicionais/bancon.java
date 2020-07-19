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
public class bancon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saque, saldoatual, saldofinal, sobra,limite ;
        saldoatual = 1000;
        limite = 2000;
        
      saque = Double.parseDouble( JOptionPane.showInputDialog(" quanto voce quer sacar "));
      
      
      saldofinal = saldoatual - saque;
      
      
      if (saldofinal>=0) {
      JOptionPane.showMessageDialog(null," seu saldo e positivo com R$"+saldofinal);
      }
      if ((saldofinal<0) && (saldofinal>=(-limite))) {
       
      JOptionPane.showMessageDialog(null," seu saldo e negativo com R$"+saldofinal);
          
      }else{
      
       JOptionPane.showMessageDialog(null," voce nao tem limite  suficiente, seu limite é de R$"+limite);
          
          
      }
      
    }
              
              
        
      }
    
    
    

