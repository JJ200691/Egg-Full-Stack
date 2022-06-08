package Ejercicio02;

import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Perro IngresarRazas() {

        Perro p = new Perro();
        String resp;
        do {
            System.out.print("Ingrese una raza de perro: ");
            String raza = leer.nextLine();
            p.getRazas().add(raza);
            System.out.println("Desea ingresar otra raza? S/N");
            resp = leer.nextLine().toUpperCase();
        } while (resp.equals("S"));

        System.out.println("*******************************");
        int c = 0;
        for (String aux : p.getRazas()) {
            c++;
            System.out.println(c + "-" + aux);

        }
        return p;
    }

    public void buscarRaza(Perro x) {

        System.out.print("Ingrese una raza para buscar y remover: ");
        String raza = leer.nextLine();
        Iterator<String> it = x.getRazas().iterator();
        int dim = x.getRazas().size();

        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(raza)) {
                it.remove();
            }
        }
        if (dim != x.getRazas().size()) {
            System.out.println("La raza ingresada fue removida");
        } else {
            System.out.println("La raza ingresada no se encuentra en la lista");
        }

        System.out.println("*******************************");
        int c = 0;
        for (String aux : x.getRazas()) {
            c++;
            System.out.println(c + "-" + aux);
        }

    }

}
