
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio03 {

    public static void main(String[] args) {
       
        //Ejercicio 3
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
        por pantalla*/
         
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre = leer.nextLine();
        System.out.println("Su nombre es " +nombre);
    }
    
}
