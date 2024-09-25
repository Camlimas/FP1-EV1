/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva17_control_de_acceso;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA17_CONTROL_DE_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String usu,con;
         Scanner captu = new Scanner(System.in);
          
         System.out.println("Ingresa el usuario: ");
         usu = captu.next();
          System.out.println("Ingresa la contraseña: ");
         con = captu.next();
         
         if(usu.equals("Admin") && con.equals("1234")){
             System.out.println("ACCESO CONCEDIDO!!");
    }else{
         System.out.println("ACCESO DENEGADO!!");
         
         }
         
         
    }
    
}
