/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año;
        Scanner captu= new Scanner(System.in);
        
       System.out.println("Ingresa el año");
       año = captu.nextInt();
        captu.nextLine();
        
        if(año %400 ==0){
            System.out.println("Es un año biciesto");
        }else if(año % 100 ==0){
            System.out.println("No es un año biciesto");
        }else if(año% 4 ==0)
             System.out.println("Es un año biciesto");
    }
    
}
