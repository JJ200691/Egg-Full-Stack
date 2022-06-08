package Ejercicio02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public RevolverDeAgua llenarRevolver() {

        Random r = new Random();
        int posActual = r.nextInt(6) + 1;
        int posAgua = r.nextInt(6) + 1;
        return new RevolverDeAgua(posActual, posAgua);
    }

    public boolean mojar(RevolverDeAgua x) {

        boolean aux = false;
        if (x.getPosAgua() == x.getPosActual()) {
            aux = true;
        }
        return aux;
    }

    public void siguienteChorro(RevolverDeAgua x) {

        if (x.getPosActual() == 6) {
            x.setPosActual(1);
        } else {
            x.setPosActual(x.getPosActual() + 1);
        }
    }

    public Jugador crearJugador() {

        System.out.print("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese el ID: ");
        int ID = leer.nextInt();

        return new Jugador(ID, nombre, false);
    }

    public boolean disparo(RevolverDeAgua r, Jugador j) {

        if (mojar(r)) {
            System.out.println("El jugador " + j.getNombre() + " se ha mojado");
            return true;
        } else {
            this.siguienteChorro(r);
            System.out.println("El jugador " + j.getNombre() + " no se mojó");
            return false;
        }

    }

    public Juego llenarJuego() {

        System.out.print("Ingrese la cantidad de jugadores: ");
        int cant = leer.nextInt();
        ArrayList<Jugador> jugadores = new ArrayList();
        for (int i = 0; i < cant; i++) {
            Jugador j = this.crearJugador();
            jugadores.add(j);
        }
        RevolverDeAgua r = this.llenarRevolver();
        return new Juego(jugadores, r);
    }

    public boolean ronda(Juego x) {

        for (int i = 0; i < x.getX().size(); i++) {
            if (this.disparo(x.getRevolver(), x.getX().get(i))) {
                return true;
            } else {
                System.out.println(x.getRevolver().toString());
            }
        }
        return false;
    }

}
