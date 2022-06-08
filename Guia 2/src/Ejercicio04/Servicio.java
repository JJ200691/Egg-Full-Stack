package Ejercicio04;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRec() {

        Rectangulo r1 = new Rectangulo();
        System.out.print("Ingrese la base del rectángulo: ");
        r1.setBase(leer.nextDouble());
        System.out.print("Ingrese la altura del rectángulo: ");
        r1.setAltura(leer.nextDouble());
        return r1;
    }

    public double calcularSup(Rectangulo r1) {

        System.out.print("La superficie del rectángulo es: ");
        return Math.round(r1.getBase() * r1.getAltura());
    }

    public double calcularPer(Rectangulo r1) {

        System.out.print("El perímetro del rectángulo es: ");
        return Math.round((r1.getBase() + r1.getAltura()) * 2);
    }

    public void dibujarRec(Rectangulo r1) {

        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
            }
        }
    }
}
