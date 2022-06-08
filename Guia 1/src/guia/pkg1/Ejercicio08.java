
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio08 {

    public static void main(String[] args) {
    
        //Ejercicio 8
        /*Crear un programa que dado un numero determine si es par o impar.*/
      
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número entero");
        num = leer.nextInt();
        if(num % 2 == 0){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado es impar");
        }
    }
    
}
