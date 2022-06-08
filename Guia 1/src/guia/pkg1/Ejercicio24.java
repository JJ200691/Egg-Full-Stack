
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        
        //Ejercicio 24
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos)*/
        
        Scanner leer = new Scanner(System.in);
        int vector[] = new int [99999];
        int aux = 0;
        int cifras = 0;
        int undig = 0;
        int dosdig = 0;
        int tresdig = 0;
        int cuatrodig = 0;
        int cincodig = 0;
        
        for (int i = 0; i < vector.length; i++) {
            int numale = (int) (Math.random() * 99999);
            vector[i] = numale;
            System.out.println("["+vector[i]+"]");
        }
        for (int i = 0; i < vector.length; i++) {
            do {
                aux = vector[i] / 10;
                cifras++;
            } while (aux == 0);
            if (cifras == 1) {
                undig++;
            }else if (cifras == 2){
                dosdig++;  
            }else if (cifras == 3) {
                tresdig++;
            }else if (cifras == 4) {
                cuatrodig++;
            }else if (cifras == 5) {
                cincodig++;
            }
          
        }
        
          switch (cifras){
                case 1:
                    System.out.println("Existen " +undig+ " números de 1 digito");
                case 2:
                    System.out.println("Existen " +dosdig+ " números de 2 digitos");
                case 3:
                    System.out.println("Existen " +tresdig+ " números de 3 digitos");
                case 4:
                    System.out.println("Existen " +cuatrodig+ " números de 4 digitos");
                case 5:
                    System.out.println("Existen " +cincodig+ " números de 5 digitos");
            }
    }
}
    

