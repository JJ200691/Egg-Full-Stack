
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        
        //Ejercicio 26
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
        que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
        cambiada de signo. Es decir, A es anti simétrica si A = -AT
        La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus 
        filas por columnas (o viceversa).*/
        
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        int matrizT [][] = new int [3][3];
        int c = 0;
        System.out.println("Ingrese los elementos de la matriz");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[i][j] = matriz[j][i];
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matrizT[i][j]+"]");  
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matrizT[i][j]*(-1) == matriz[i][j]) {
                    c++;
                }
            }
        }
        if (c == 3) {
            System.out.println("La matriz es antisemétrica");   
        }else{
            System.out.println("La matriz no es antisemétrica");
        }
    }
}
