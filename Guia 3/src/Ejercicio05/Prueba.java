package Ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        //Ejercicio 5
        /*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
        repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
        guardará el país en el conjunto y después se le preguntará al usuario si quiere
        guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
        guardados en el conjunto.
        Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
        recordar como se ordena un conjunto.
        Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
        Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
        país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
        en el conjunto se le informará al usuario*/
        
        Scanner leer = new Scanner(System.in);
        HashSet<String> paises = new HashSet();
        String resp;
        do {
            System.out.print("Ingrese un país: ");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("Desea ingresar otro país? S/N");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));

        for (String aux : paises) {
            System.out.println(aux);
        }

        System.out.println("---------------------------------");

        ArrayList<String> paises2 = new ArrayList(paises);

        Collections.sort(paises2);

        for (String aux : paises2) {
            System.out.println(aux);
        }

        Iterator<String> it = paises.iterator();

        System.out.print("Ingrese un país a eliminar: ");
        String elim = leer.next();

        if (paises.contains(elim)) {
            while (it.hasNext()) {
                String aux = it.next();
                if (aux.equals(elim)) {
                    it.remove();
                }
            }
        } else {
            System.out.println("El país ingresado no se encuentra en la lista");
        }
        System.out.println("---------------------------------");
        for (String aux : paises) {
            System.out.println(aux);
        }
    }
}
