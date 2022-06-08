package Ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList crearPeli() {

        ArrayList<Pelicula> listaPelis = new ArrayList();
        String resp;

        do {
            Pelicula x = new Pelicula();
            System.out.print("Ingrese el título de la película: ");
            x.setTitulo(leer.next());
            System.out.print("Ingrese el director: ");
            x.setDirector(leer.next());
            System.out.print("Ingrese la duración: ");
            x.setDuracion(leer.nextInt());
            listaPelis.add(x);
            System.out.println("Desea ingresar otra película? S/N");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));

        return listaPelis;
    }

    public void mostrarPelis(ArrayList<Pelicula> x) {

        System.out.println("*******************************\n"
                + "La lista de películas ingresadas es la siguientes:");
        for (Pelicula aux : x) {
            System.out.println(aux.getTitulo());
        }
    }

    public void mostrarPelisHora(ArrayList<Pelicula> x) {

        System.out.println("*******************************\n"
                + "Las películas que duran más de una hora son las siguientes:");
        for (Pelicula aux : x) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux.getTitulo());
            }
        }
    }

    public void mostrarOrden(ArrayList<Pelicula> x) {

        System.out.println("*******************************\n"
                + "Las películas ordenadas de mayor a menor según su duración son:");
        Collections.sort(x, Comparadores.duracionMayAMen);
        for (Pelicula aux : x) {
            System.out.println(aux.getTitulo());
        }

        System.out.println("*******************************\n"
                + "Las películas ordenadas de menor a mayor según su duración son:");
        Collections.sort(x, Comparadores.duracionMenAMay);
        for (Pelicula aux : x) {
            System.out.println(aux.getTitulo());
        }

        System.out.println("*******************************\n"
                + "Las películas ordenadas alfabéticamnete según el título son:");
        Collections.sort(x, Comparadores.tituloAlfa);
        for (Pelicula aux : x) {
            System.out.println(aux.getTitulo());
        }

        System.out.println("*******************************\n"
                + "Las películas ordenadas alfabéticamente según su director son:");
        Collections.sort(x, Comparadores.directorAlfa);
        for (Pelicula aux : x) {
            System.out.println(aux.getDirector());
        }
    }

}
