
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        
        //Ejercicio 6
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla 
        el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
        Math.sqrt().*/
       
        Scanner leer = new Scanner(System.in);
        int num,doble,triple;
        double rc;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        doble = num * 2;
        triple = num * 3;
        rc = Math.sqrt(num);
        System.out.println("El doble de " +num+ " es igual a " +doble);
        System.out.println("El triple de " +num+ " es igual a " +triple);
        System.out.println("La raiz cuadrada de " +num+ " es igual a " +rc);
    }
    
}
