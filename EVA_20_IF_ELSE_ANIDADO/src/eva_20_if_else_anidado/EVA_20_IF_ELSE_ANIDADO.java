/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_20_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int diasem;
        
        Scanner captu= new Scanner(System.in);
        
        System.out.println("INGRESA UN NUMERO ENTRE EL 1-7");
        diasem = captu.nextInt();
        captu.nextLine();
        
        if(diasem ==1){
            System.out.println("DOMINGO");
        }else if(diasem ==2){
            System.out.println("LUNES");
        }else if(diasem ==3){
            System.out.println("MARTES");
        }else if(diasem ==4){
            System.out.println("MIERCOLES");
        }else if(diasem ==5){
            System.out.println("JUEVES");
        }else if(diasem ==6){
            System.out.println("VIERNES");
        }else if(diasem ==7){
            System.out.println("SABADO");
        }else {
          System.out.println("NUMERO DE DIA INCORRECTO");
        }
        }     
    } 
 

