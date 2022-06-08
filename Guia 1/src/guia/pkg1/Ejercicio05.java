
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        
        //Ejercicio 5
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
        grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
       
        Scanner leer = new Scanner(System.in);
        float celsius;
        System.out.println("Ingrese la temperatura en grados Celsius");
        celsius = leer.nextFloat();
        float fahrenheit = 32 + (9*celsius/5);
        System.out.println("Convertidos a Fahrenheit es igual a " +fahrenheit);

    }
    
}
