/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_variables.pkg2;

/**
 *
 * @author invitado
 */
public class EVA1_3_VARIABLES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VEHICULOS
        String marca; //No puedes declarar dos variable con el mismo nombre
        String modelo;
        int year; //La ñ en otros lenguajes no es aceptada
        double precio;
        
        //ASIGNACIÓN
        
        marca = "NISSAN";
        modelo = "GTR";
        year = 2008;
        precio = 1000000.1;
        
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
    
}
