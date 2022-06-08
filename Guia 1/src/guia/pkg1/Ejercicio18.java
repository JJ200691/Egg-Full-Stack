
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        
        //Ejercicio 18
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
        del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
        por una E. Ejemplo:
                           0-0-0
                           0-0-1
                           0-0-2
                           0-0-E
                           0-0-4
                           .
                           .
                           0-1-2
                           0-1-E
        Nota: investigar función equals() y como convertir números a String*/
        
        Scanner leer = new Scanner(System.in);
        String a,b,c;
        
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                a = "E";
            }else{
                a = String.valueOf(i);
            }
            for (int j = 0; j < 10; j++) {
                if(j == 3){
                b = "E";
                }else{
                    b = String.valueOf(j);
                }
                for (int k = 0; k < 10; k++) {
                    if(k == 3){
                    c = "E";
                    }else{
                        c = String.valueOf(k);
                    }
                    System.out.println(a+"-"+b+"-"+c);
                    }
                   
                }
                
            }
           
        }
    }
    

