/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_x;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String curp;
        int edad;
        double promedio;
        
        // CREAR NUESTRO SCANNER
        Scanner captu;
        captu = new Scanner(System.in);
        
        //CAPTURAR
        System.out.println("CAPTURA TU NOMBRE COMPLETO");
        nombre= captu.nextLine();
        System.out.println("CAPTURA LA CURP");
       curp= captu.nextLine();
       System.out.println("CAPTURA LA EDAD");
        edad= captu.nextInt();
        System.out.println("CAPTURA EL PROMEDIO");
        promedio= captu.nextInt();
        
        //IMPRECCION
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
        
    }
    
}
