package Extra01;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        //Extra 1
        /*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
        y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
        introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
        programa mostrará por pantalla el número de valores que se han leído, su suma y su
        media (promedio).*/
       
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList();
        Integer n;
        String resp;
        int suma = 0;
        double prom = 0;

        do {

            System.out.print("Ingrese un número: ");
            n = leer.nextInt();
            if (n != (-99)) {
                num.add(n);
            } else {
                break;
            }
            System.out.println("Desea ingresar otro número? S/N");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("S"));

        System.out.println("La cantidad de números ingresados es: " + num.size());

        for (Integer aux : num) {
            suma += aux;
        }

        System.out.println("La suma de todos los números ingresados es: " + suma);
        System.out.println("El promedio de todos los números ingresados es: " + (suma / num.size()));

    }

}
