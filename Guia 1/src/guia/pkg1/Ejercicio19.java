
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        
        //Ejercicio 19
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
        si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
                                    * * * * 
                                    *     *
                                    *     *
                                    * * * *                                     */
        
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de elementos del cuadrado");
         int lados = leer.nextInt();
         
         for (int i = 0; i < lados; i++) {
             System.out.print("* ");  
             }
         System.out.println(" ");
         for (int i = 0; i < lados-2; i++) {
             System.out.print("* ");
             for (int j = 0; j < lados-2; j++) {
                 System.out.print("  ");
             }
             System.out.println("*");
        }
         for (int i = 0; i < lados; i++) {
             System.out.print("* ");
            
        }
                
                 
             }
             
           
        }

