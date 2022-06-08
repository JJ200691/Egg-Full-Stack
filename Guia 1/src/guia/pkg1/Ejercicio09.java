
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        
        //Ejercicio 9
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
        investigar la función equals() en Java.*/
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una palabra");
        String frase = leer.nextLine();
        if(frase.equals("eureka")){
            System.out.println("Correcto"); 
        }else{
            System.out.println("Incorrecto");
        }
        
            
            
            
        }
        
        
    }
        
    
    

