package Ejercicio01;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public void IngresarRazas() {

        Perro p = new Perro();
        String resp;
        do {
            System.out.print("Ingrese una raza de perro: ");
            String raza = leer.nextLine();
            p.getRazas().add(raza);
            System.out.println("Desea ingresar otra raza? S/N");
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("S"));

        System.out.println("*******************************");
        int c = 0;
        for (String aux : p.getRazas()) {
            c++;
            System.out.println(c + "-" + aux);

        }
    }
}
