/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pismena;

import java.util.Scanner;

/**
 *
 * @author Venda
 */
public class Pismena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Objekty objekty = new Objekty();       
        
        Scanner sc = new Scanner(System.in, "UTF-8");
        String volba = "";                
        
        while (!volba.equals("2"))
        {        
        System.out.println("Vítejte!");
        System.out.println("1 - Vygenerovat ná hodný znak");
        System.out.println("2 - Ukončit program");
        volba = sc.nextLine();
        System.out.println();
                // reakce na volbu
                switch (volba)
                {
                        case "1":       
                                        objekty.generation();
                                        break;
                        case "2":
                                        objekty.exit();
                                        break;
                        default:
                                        System.out.println("Ani neumíš stisnout klávesu od 1 do 2.Seš lama.\n");
                                        break;
                }
                
            }
        
    }
    
}
