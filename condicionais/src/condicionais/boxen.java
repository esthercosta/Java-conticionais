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
public class boxen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double peso ;
       
    peso = Double.parseDouble(JOptionPane.showInputDialog(" Qual seu peso "));
       
    
    
 if (( peso >=46.27) && ( peso < 47.63)){
   JOptionPane.showMessageDialog(null, " peso palha ligeiro ");
     
 }
 
if(( peso >= 47.63) && ( peso <48.99)) { 
 JOptionPane.showMessageDialog(null, "  peso palha ");   

}  

        
if(( peso >= 48.99) && ( peso < 50.35)) {
  JOptionPane.showMessageDialog(null, "peso mosca ligeiro ");  

}  

if(( peso >= 50.35) && ( peso < 51.71)) {
JOptionPane.showMessageDialog(null, " peso mosca  ");    

}  
    
if (( peso >= 51.71) && ( peso < 53.52)) {
 JOptionPane.showMessageDialog(null, " peso super mosca ");   

}

if(( peso >= 53.52 ) && ( peso < 55.34)) {
JOptionPane.showMessageDialog(null, " peso galo ");    
 
}
   
if (( peso >= 55.34) && ( peso < 57.15)) { 
 JOptionPane.showMessageDialog(null, " peso super galo ");   

}

if (( peso >= 57.15) && ( peso < 58.97)) { 
 JOptionPane.showMessageDialog(null, "peso pena ");   

} 

if (( peso >= 58.97) && ( peso < 61.23)) {
 JOptionPane.showMessageDialog(null, " peso super pena ");   
 
}   

if (( peso >= 61.23) && ( peso <63.5)) { 
JOptionPane.showMessageDialog(null, " peso leve ");    

}   
       

if (( peso >= 63.50 ) && ( peso < 66.68)) { 
    JOptionPane.showMessageDialog(null, " peso super leve ");
}
    

if (( peso >= 66.68) && ( peso < 69.85)) {
JOptionPane.showMessageDialog(null, " peso meio medio ");    

}   
        
if(( peso >= 69.85) && ( peso < 73.03)) {
  JOptionPane.showMessageDialog(null, " peso super meio medio  ");  

}
        
if(( peso >= 73.03) && ( peso < 76.2)){ 
    JOptionPane.showMessageDialog(null, " peso medio  ");
}
  

if (( peso >= 76.2) && ( peso < 79.38)) { 
    JOptionPane.showMessageDialog(null, "peso super medio  ");
}
   
        
        
if (( peso >= 79.38) && ( peso < 90.72)) { 
    JOptionPane.showMessageDialog(null, " peso meio pesado ");
}

if(( peso <= 90.72) && ( peso > 79.38)) { 
    JOptionPane.showMessageDialog(null, " peso cruzador ");
}   
        
        
if (( peso > 90.72)) { 
    JOptionPane.showMessageDialog(null, " peso pesado   ");
    
} 


   
      
    }
    
}

    
    

