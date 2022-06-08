
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        
        //Ejercicio 23
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
        pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
        encuentra el numero y si se encuentra repetido*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int [leer.nextInt()];
        
        for (int i = 0; i < vector.length; i++) {
            int numale = (int) (Math.random() * 10);
            vector[i] = numale;
        }
        System.out.println("Ingrese un número del 0 al 10 para buscar en el vector");
        int buscarnum = leer.nextInt();
        
         for (int i = 0; i < vector.length; i++) {
             if (vector[i] == buscarnum) {
                 System.out.println("El número ingresado se encuentra en la posicíon "+i+ " del vector");
             }
 {
                 
             }
         }
    }
   
}
