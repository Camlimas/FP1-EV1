/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_21_meses_años;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_21_MESES_AÑOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Mesaño;
        
        Scanner captu= new Scanner(System.in);
        
        System.out.println("INGRESA UN NUMERO ENTRE EL 1-12");
        Mesaño = captu.nextInt();
        captu.nextLine();
        
        if(Mesaño ==12){
            System.out.println("DICIEMBRE");
        }else if(Mesaño ==11){
            System.out.println("NOIVEMBRE");
        }else if(Mesaño ==10){
            System.out.println("OCTUBRE");
        }else if(Mesaño ==9){
            System.out.println("SEPTIEMBRE");
        }else if(Mesaño ==8){
            System.out.println("AGOSTO");
        }else if(Mesaño ==7){
            System.out.println("JULIO");
        }else if(Mesaño ==6){
            System.out.println("JUNIO");
        }else if(Mesaño ==5){
            System.out.println("MAYO");
        }else if(Mesaño ==4){
            System.out.println("ABRIL");
        }else if(Mesaño ==3){
            System.out.println("MARZO");
        }else if(Mesaño ==2){
            System.out.println("FEBRERO");
        }else if(Mesaño ==1){
            System.out.println("ENERO");
        } else {
          System.out.println("NUMERO DE MES INCORRECTO");
        }
    }
    
}
