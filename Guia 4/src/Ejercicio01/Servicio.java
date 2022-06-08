package Ejercicio01;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {

        Perro x = new Perro();
        System.out.print("Ingrese el nombre del perro: ");
        x.setNombre(leer.next());
        System.out.print("Ingrese la raza del perro: ");
        x.setRaza(leer.next());
        System.out.print("Ingrese la edad del perro: ");
        x.setEdad(leer.nextInt());
        System.out.print("Ingrese el tamaño del perro: ");
        x.setTamaño(leer.next());
        System.out.println("**********************************");

        return x;
    }

    public Persona crearPersona(Perro x) {

        Persona y = new Persona();
        System.out.print("Ingrese el nombre: ");
        y.setNombre(leer.next());
        System.out.print("Ingrese el apellido: ");
        y.setApellido(leer.next());
        System.out.print("Ingrese el DNI: ");
        y.setDni(leer.nextInt());
        System.out.print("Ingrese la edad: ");
        y.setEdad(leer.nextInt());
        y.setPerro(x);
        System.out.println("**********************************");

        return y;
    }

}
