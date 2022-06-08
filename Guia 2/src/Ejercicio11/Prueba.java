package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        //Ejercicio 11
        /*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
        la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
        clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
        pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
        de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
        fecha actual, que se puede conseguir instanciando un objeto Date con constructor
        vacío. 
            Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
            Ejemplo fecha actual: Date fechaActual = new Date();*/
       
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = leer.nextInt();
        anio -= 1900;
        System.out.print("Ingrese un mes: ");
        int mes = leer.nextInt();
        mes -= 1;
        System.out.print("Ingrese un día: ");
        int dia = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
        System.out.println(fecha);
        Date fechaAct = new Date();
        System.out.println(fechaAct);
        int dif = fechaAct.getYear() - fecha.getYear();

        System.out.println("La diferencia en años entre la fecha ingresada y la actual es: " + dif + " años");

    }
}
