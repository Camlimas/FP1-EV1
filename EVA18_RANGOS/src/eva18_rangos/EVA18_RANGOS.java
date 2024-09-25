/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva18_rangos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA18_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cal;
        Scanner captu = new Scanner(System.in);
           
        System.out.println("Ingresa calificacion: ");
        cal =captu.nextInt ();
        
        if(cal>= 0 && cal <= 100 ){
            System.out.println("Calificacion Valida");
        }else{
            System.out.println("Calificacion no Valida");
        }
           
    }
    
}
