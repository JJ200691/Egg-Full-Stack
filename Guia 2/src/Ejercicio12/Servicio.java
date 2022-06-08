package Ejercicio12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Año: ");
        int anio = Integer.parseInt(leer.nextLine());
        System.out.print("Mes: ");
        int mes = Integer.parseInt(leer.nextLine());
        System.out.print("Dia: ");
        int dia = Integer.parseInt(leer.nextLine());
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return new Persona(nombre, fecha);
    }

    public int calcularEdad(Persona p) {

        // traemos la fecha de nacimiento del objeto
        LocalDate fecha = p.getFecha();

        // Obtenemos la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calculamos la edad de la persona con el tiempo transcurido entre fechas
        int calcularEdad = (int) ChronoUnit.YEARS.between(fecha, fechaActual);

        return calcularEdad;

    }

    public void menorQue(Persona p) {

        boolean val;
        System.out.print("Ingrese una nueva edad: ");
        int edad = leer.nextInt();

    }
}
