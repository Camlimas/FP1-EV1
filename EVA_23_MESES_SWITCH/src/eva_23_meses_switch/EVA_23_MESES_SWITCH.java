/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_23_meses_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_23_MESES_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int Mes;
        
        Scanner captu= new Scanner(System.in);
        
        System.out.println("INGRESA UN NUMERO ENTRE EL 1-12");
        Mes = captu.nextInt();
        captu.nextLine();
        
        switch(Mes){
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break; 
            case 3:
                System.out.println("MARZO");
                break; 
             case 4:
                System.out.println("ABRIL");
                break; 
             case 5:
                System.out.println("MAYO");
                break;
             case 6:
                System.out.println("JUNIO");
                break;
             case 7:
                System.out.println("JULIO");
                break;
             case 8:
                System.out.println("AGOSTO");
                break; 
            case 9:
                System.out.println("SEPTIEMBRE");
                break; 
              case 10:
                System.out.println("OCTUBRE");
                break; 
             case 11:
                System.out.println("NOVIEMBRE");
                break;
             case 12:
                System.out.println("DICIEMBRE");
                break; 
                  default:
                 System.out.println("NUMERO NO VALIDO");
    }
    }
}
