
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        
        //Ejercicio21
        /*Crea una aplicación que a través de una función nos convierta una cantidad de 
        euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
        libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
        converir que será una cadena, este no devolverá ningún valor y mostrará un 
        mensaje indicando el cambio (void).
        El cambio de divisas es:
                                * 0.86 libras es un 1 €
                                * 1.28611 $ es un 1 €
                                * 129.852 yenes es un 1 €*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor en euros");
        double euros = leer.nextDouble();
        System.out.println("Que tipo de cambio desea hacer: libra,yen,dolar");
        String cambio = leer.next();
        Conversion (euros,cambio);
      
    }
    
     public static void Conversion (double euros,String cambio){
         
         switch(cambio){
             case "libra":
                 euros = euros * 0.86;
                 break;
             case "yen":
                 euros = euros * 129.852;
                 break;
             case "dolar":
                 euros = euros * 1.28611;
                 break;
         }
         System.out.println("El cambio es igual a: "+euros);
         
     }
         
    
}
