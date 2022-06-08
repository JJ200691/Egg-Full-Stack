package Extra02;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {

        System.out.print("Ingrese un valor para x1: ");
        int x1 = leer.nextInt();
        System.out.print("Ingrese un valor para y1: ");
        int y1 = leer.nextInt();
        System.out.print("Ingrese un valor para x2: ");
        int x2 = leer.nextInt();
        System.out.print("Ingrese un valor para y2: ");
        int y2 = leer.nextInt();
        return new Puntos(x1, y1, x2, y2);
    }

    public double calcluarDistancia(Puntos p) {

        System.out.print("La distancia entre ambos puntos es: ");
        return Math.sqrt((Math.pow(p.getX2() - p.getX1(), 2)) + (Math.pow(p.getY2() - p.getY1(), 2)));

    }

}
