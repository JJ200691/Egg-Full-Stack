package Extra03;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Raices crear() {

        System.out.print("Inserte un valor para a: ");
        double a = leer.nextDouble();
        System.out.print("Inserte un valor para b: ");
        double b = leer.nextDouble();
        System.out.print("Inserte un valor para c: ");
        double c = leer.nextDouble();
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices r) {

        System.out.print("El valor del discriminante es: ");
        return (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
    }

    public boolean tieneRaices(Raices r) {

        boolean val = false;
        if (getDiscriminante(r) >= 0) {
            val = true;
        }
        return val;
    }

    public boolean tieneRaiz(Raices r) {

        boolean val = false;
        if (getDiscriminante(r) == 0) {
            val = true;
        }
        return val;
    }

    public void obtenerRaices(Raices r) {
        
        if (tieneRaices(r) == true) {
            double res1 = (-r.getB()) + Math.sqrt((Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC())) / (2 * r.getA()));
            double res2 = (-r.getB()) - Math.sqrt((Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC())) / (2 * r.getA()));
            System.out.println("El primer resultado es: " + res1 + "\n"
                    + "El segundo resultado es: " + res2);
        }
    }

    public void obtenerRaiz(Raices r) {

        if (tieneRaiz(r) == true) {
            double res = (-r.getB()) + Math.sqrt((Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC())) / (2 * r.getA()));
            System.out.println("El unico resultado posible es: " + res);
        }
    }
}
