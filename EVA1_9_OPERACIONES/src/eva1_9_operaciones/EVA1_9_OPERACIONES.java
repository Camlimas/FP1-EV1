/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACION ARITMETICAS
        //inicializacion de una variable 
        int x = 10; //declaracion y asignació
        int y =5; 
        //si nescitan muchas variables:
        int suma, resta, mult, div, pot, raiz;
        //suma y resta
         suma = x + y;//operador de suma +
       System.out.println("El resultado de la suma de x + y:");
       System.out.print(suma);
       
       resta= x - y;//operador de resta -
       System.out.println("El resultado de la resta de x - y:");
       System.out.print(resta);
       
       mult= x * y;//operador de multiplicacion *
       System.out.println("El resultado de la multiplicacion de x * y:");
       System.out.print(mult);
       
       //EN JAVA,LAS OPERACIONES DEPENDEN DEL TIPO DE DATO
       //DIVIDES ENTERO,JAVA DE COMO RESTULTADO UN ENTERO 
       div= x / y;//operador de división /
       System.out.println("El resultado de la división de x / y:");
       System.out.print(div);
       
       x =5;
       y=2;
       div = x / y;
       System.out.println("Division de x(5) / y (2):");
       System.out.println(div);
       
       //division con numeros con punto flotante
       double val1= 5;
       double val2= 2;
       double resu;
       resu= val1 /val2;
        System.out.println("Division de val1 (5) / val2 (2):");
       System.out.println(resu);
       
    }
    
}
