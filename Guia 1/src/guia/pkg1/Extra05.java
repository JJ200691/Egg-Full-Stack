
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Extra05 {

    public static void main(String[] args) {
        
        //Extra 5
        /*Una obra social tiene tres clases de socios: 
                o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
                descuento en todos los tipos de tratamientos. 
                o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
                descuento para los mismos tratamientos que los socios del tipo A. 
                o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
                dichos tratamientos. 
        Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
        que represente el costo del tratamiento (previo al descuento) y determine el importe 
        en efectivo a pagar por dicho socio.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su clase");
        String clase = leer.next();
        clase = clase.toUpperCase();
        
        do {
            switch (clase) {
                case "A":
                    {
                        System.out.println("Ingrese el monto del tratamiento a realizar");
                        double costo = leer.nextInt();
                        costo = costo - (costo * 0.5);
                        break;
                    }
                case "B":
                    {
                        System.out.println("Ingrese el monto del tratamiento a realizar");
                        double costo = leer.nextInt();
                        costo = costo - (costo * 0.35);
                        break;
                    }
                case "C":
                {
                    System.out.println("Ingrese el monto del tratamiento a relizar");
                    double costo = leer.nextInt();
                    System.out.println("Su clase no tiene descuentos");
                }
                default:
                    System.out.println("La clase ingresada no existe");
            }
        } while (!clase.equals("A") || !clase.equals("B") || !clase.equals("C"));
        
        System.out.println("El costo de su tratamiento es");
        
    }
}
            
        
    

    

