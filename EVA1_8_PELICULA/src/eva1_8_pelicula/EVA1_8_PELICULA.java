/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        String Genero;
        int Duracion;
        String Reparto;
        String Clasificacion;
        
        Scanner captu;
        captu= new Scanner(System.in);
        
       System.out.println("Captura el nombre de la pelicula");
       Nombre = captu.nextLine();
        System.out.println("Captura el genero de la pelicula");
      Genero = captu.nextLine();
        System.out.println("Captura la duracion de la pelicula");
       Duracion = captu.nextInt();
       captu.nextLine();
       System.out.println("Captura el reparto de la pelicula");
      Reparto = captu.nextLine();
        System.out.println("Captura la clasificacon de la pelicula");
       Clasificacion = captu.nextLine();
       
       System.out.println("El nombre de la peicula" + Nombre);
       System.out.println("El genero de la peicula" + Genero);        
       System.out.println("El duracion de la peicula" + Duracion);
       System.out.println("El reparto de la peicula" + Reparto);
       System.out.println("El clasificacion de la peicula" + Clasificacion);
    }
    
}
