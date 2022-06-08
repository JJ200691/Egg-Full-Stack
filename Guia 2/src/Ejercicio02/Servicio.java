package Ejercicio02;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        Circunferencia c1 = new Circunferencia();
        System.out.print("Ingrese el radio de la circunferencia: ");
        c1.setRadio(leer.nextDouble());
        return c1;
    }

    public double area(Circunferencia c1) {
        
        System.out.print("El área de la circunferencia es: ");
        return Math.round(Math.PI * Math.pow(c1.getRadio(), 2));
    }

    public double perimetro(Circunferencia c1) {
        
        System.out.print("El perímetro de la circunferencia es: ");
        return Math.round(2 * Math.PI * c1.getRadio());
    }
}
