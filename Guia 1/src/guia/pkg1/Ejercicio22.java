
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        
        //Ejercicio 22
        /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
        los muestre por pantalla en orden descendente.*/
        
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        int c = 0;
        
        for (int i = 0; i < vector.length; i++) {
            c = c + 1;
            vector[i] = c;
        }
        
        for (int i = 99; i < vector.length; i--) {
            System.out.print("["+vector[i]+"]"); 
        }
            
        }
        }
        
    
    

