/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_captura._auto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_7_CAPTURA_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int year;
        double precio;
        
        Scanner captu;
        captu=new Scanner(System.in);
        
        System.out.println("MARCA DEL CARRO:");
        marca=captu.nextLine();
        System.out.println("MODELO DEL CARRO:");
        modelo=captu.nextLine();
        System.out.println("AÑO DEL CARRO:");
       year=captu.nextInt();
       System.out.println("PRECIO DEL CARRO:");
        precio=captu.nextInt();
        
        
       System.out.println(marca);
       System.out.println(modelo);
       System.out.println(year);
       System.out.println(precio);
        
    }
    
}
