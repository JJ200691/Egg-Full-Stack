
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio13 {

    public static void main(String[] args) {
       
        //Ejercicio 13
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
        la nota se pedirá de nuevo hasta que la nota sea correcta.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        int nota = leer.nextInt();
        while(nota < 0 || nota > 10) {
            System.out.println("La nota es incorrecta, ingrésela nuevamente");
            nota = leer.nextInt();
        }
        System.out.println("La nota es correcta");
    }
    
}
 