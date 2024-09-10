/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURAR LA EDAD 
        int edad;
         Scanner captu=new Scanner (System.in);
         System.out.println("EDAD:");
         edad = captu.nextInt();
         
         if(edad >=18){
         System.out.println("ERES MAYOR DE EDAD");
         
    }else {
             System.out.println("ERES MENOR DE EDAD");
         }
    }

}