package Extra06;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {

        System.out.print("Ingrese una palabra: ");
        String palabra = leer.next();
        System.out.print("Ingrese la cantidad máxima de jugadas: ");
        int jugadas = leer.nextInt();
        String vector[] = new String[palabra.length()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        return new Ahorcado(vector, palabra, jugadas);
    }

    public void longitud(Ahorcado a) {

        System.out.println("La palabra contiene " + a.getPalabra().length + " caracteres");
    }

    public void juego(Ahorcado a) {

        System.out.print("Ingrese una letra: ");
        String letra = leer.next();
        int c = 0;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(letra)) {
                System.out.println("Letra encontrada");
                c++;
                System.out.println("Restan " + (a.getPalabra().length - c) + " palabras");
            }
        }
    }
}
