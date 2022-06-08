
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        
        //Ejercicio 25
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la 
        muestre ordenada por sus columnas.*/
        
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int [4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                 int numale = (int) (Math.random() * 9);
                 matriz[i][j] = numale;
                 System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
