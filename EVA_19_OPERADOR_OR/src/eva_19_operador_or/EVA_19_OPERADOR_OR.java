/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_19_operador_or;

import java.util.Scanner;



/**
 *
 * @author invitado
 */
public class EVA_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int meses,km;
      Scanner captu = new Scanner(System.in);
      
      System.out.println("Captura el kilometraje: ");
      km=captu.nextInt();
       System.out.println("Captura los meses: ");
      meses=captu.nextInt();
      
      if(km>=5000 || meses>=6){
           System.out.println("Cambio de aceite");
   }else{
           System.out.println("Todo bien con el veiculo ");
      }
              
    }
    
}
