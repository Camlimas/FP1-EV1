/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_conversiones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONVERSIONES DE TEMPERATURA 
        double fahr,cent,kel;
       Scanner captu=new Scanner(System.in);
       
       System.out.println("Captura los °Farhernheit:");
       fahr = captu.nextDouble();
       cent = (fahr - 32) / 1.8 ; //expresión
       System.out.println("°C =" + cent);
       
       System.out.println("Captura los °Celsius:");
         cent =captu.nextDouble();
         fahr = (cent -32) /1.8;
         System.out.println("°F =" + fahr);
                 
         System.out.println("Captura los °Celsius:");
         cent= captu.nextDouble();
         kel= cent + 273.15;
         System.out.println("°K =" + kel);
         
          System.out.println("Captura los °Farahernheit:");
          fahr =captu.nextDouble();
           kel=(fahr - 32)+ 273.15 ;
           System.out.println("°K =" + kel);
                 
         
    }
    
}
