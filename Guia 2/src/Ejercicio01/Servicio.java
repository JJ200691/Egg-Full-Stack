package Ejercicio01;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {

        Libro l1 = new Libro();
        System.out.print("Ingrese el titulo del libro: ");
        l1.titulo = leer.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        l1.autor = leer.nextLine();
        System.out.print("Ingrese la cantidad de páginas: ");
        l1.cant_pag = leer.nextInt();
        System.out.print("Ingrese su código ISBN: ");
        l1.ISBN = leer.nextInt();

        return l1;
    }

    public void mostrarLibro(Libro l1) {

        System.out.println("-----------------------------------\n"
                + "Los datos ingresados son los siguientes:\n"
                + "Titulo: " + l1.titulo + "\n"
                + "Autor: " + l1.autor + "\n"
                + "Cantidad de páginas: " + l1.cant_pag + "\n"
                + "Código ISBN: " + l1.ISBN);
    }
}
