
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Extra01 {

    public static void main(String[] args) {
        
        //Extra 1
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
        el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
        horas.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int tiempo = leer.nextInt();
        
       int dias = tiempo / 1440;
       int horas = (tiempo - (dias*1440) / 1440);
       
        System.out.println("El tiempo ingresado equivale a "+dias+" días y "+horas+ " horas");
    }
    
}
