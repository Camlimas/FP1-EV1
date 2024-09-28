/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner captu= new Scanner(System.in);
        
        System.out.println("CUAL ES TU CALIFICACION NUMRTICA:");
        num = captu.nextInt();
        captu.nextLine();
        
        if(num >= 90){
         System.out.println("A");
    }else if(num >=80){
        System.out.println("B");
    }else if(num>=70){
        System.out.println("C");
    }else if(num>=60){
        System.out.println("D"); 
    }else if (num>= 0){
        System.out.println("F");
    }else{
        System.out.println("CALIFICACION REPROBATORIA");
    }
    }
    
}
