
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        
        //Ejercicio 15
        /*Realizar un programa que pida dos números enteros positivos por teclado y 
        muestre por pantalla el siguiente menú:
                                MENU
                            1. Sumar
                            2. Restar
                            3. Multiplicar
                            4. Dividir
                            5. Salir
                            Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
        del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
        carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos");
        System.out.print("Número 1: ");
        int num1 = leer.nextInt();
        System.out.print("Número 2: ");
        int num2 = leer.nextInt();
        String resp;
        resp = "";
       
            do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            
            int opc = leer.nextInt();
            switch (opc){
                case 1:
                   int resultado = num1 + num2;
                    System.out.println("El resultado es: " +resultado);
                   break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado es: " +resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " +resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado es: " +resultado);
                    break;
                case 5:
                    System.out.print("Está seguro que desea salir del programa? (S/N)");
                    resp = leer.next();
                    if (resp.equals("S")){
                    break;
                    }
            } 
                    } while (resp.equals("N"));
        
        }
}

        
             
        



     
