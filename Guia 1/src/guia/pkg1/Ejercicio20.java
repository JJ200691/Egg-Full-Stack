
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        
        //Ejercicio 20
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
        número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
                5 *****
                3 ***
                11 ***********
                2 **                                                                    */
        
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese 4 números enteros entre 1 y 20");
         int num1 = leer.nextInt();
         int num2 = leer.nextInt();
         int num3 = leer.nextInt();
         int num4 = leer.nextInt();
         
         if(num1 >= 1 && num1 <= 20){
         for (int i = 0; i < 1; i++) {
             System.out.print(num1+" ");
             for (int j = 0; j < num1; j++) {
                 System.out.print("*");
                 System.out.print("");
             }
              System.out.println("");
        }
         }else{
             System.out.println("El número es incorrecto");
         }
         if(num2 >= 1 && num2 <= 20){
          for (int i = 0; i < 1; i++) {
             System.out.print(num2+" ");
             for (int j = 0; j < num2; j++) {
                 System.out.print("*");
                 System.out.print("");
         }
              System.out.println("");
          }
         }else{
             System.out.println("El número es incorrecto");
         }
         if(num3 >= 1 && num3 <= 20){
           for (int i = 0; i < 1; i++) {
             System.out.print(num3+" ");
             for (int j = 0; j < num3; j++) {
                 System.out.print("*");
                 System.out.print("");
             }
              System.out.println("");
           }
         }else{
             System.out.println("El número es incorrecto");
         }
         if(num4 >= 1 && num4 <= 20){
            for (int i = 0; i < 1; i++) {
             System.out.print(num4+" ");
             for (int j = 0; j < num4; j++) {
                 System.out.print("*");
                 System.out.print("");
             }
              System.out.println("");
            } 
         }else{
             System.out.println("El número es incorrecto");
         }
    } 
        }
             
         


