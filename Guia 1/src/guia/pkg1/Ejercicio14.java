
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
        //Ejercicio 14
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
        solicite números al usuario hasta que la suma de los números introducidos supere 
        el límite inicial.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número límite positivo");
        int limite = leer.nextInt();
        int suma;
        suma = 0;
        System.out.println("Ingrese números hasta llegar al límite ingresado");
        while (suma < limite){
            int num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("Se ha llegado al límite ingresado");
            
        }
    }
    
