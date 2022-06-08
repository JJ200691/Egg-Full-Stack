
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        
        //Ejercicio 4
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
        después toda en minúsculas. Nota: investigar la función toUpperCase() y 
        toLowerCase() en Java.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase cualquiera ");
        String frase = leer.nextLine();
        System.out.println("Su frase en mayúsculas se ve asi: " +frase.toUpperCase());
        System.out.println("Su frase en minúsculas se ve asi: " +frase.toLowerCase());
        
    }
    
}
