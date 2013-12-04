/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pismena;

/**
 *
 * @author Venda
 */
public class Objekty {
  
    public void generation(){
    
                char znak = 'a' ;
                znak = (char) (128.0 * Math.random());
                
                System.out.println("Vygeneroval jsem znak " + znak );
                
    }
    
    public void exit(){
    
        System.out.println("Ukončení aplikace .\n");
        
    }
    
} 
