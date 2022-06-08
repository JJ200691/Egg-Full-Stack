package Ejercicio08;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {

        System.out.print("Ingrese una palabra o una frase: ");
        String frase = leer.nextLine();
        int longitud = frase.length();
        return new Cadena(frase, longitud);
    }

    public void mostrarVoc(Cadena c) {

        String fraseMin = c.getFrase().toLowerCase();
        int con = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (fraseMin.substring(i, i + 1).equals("a") || fraseMin.substring(i, i + 1).equals("e") || fraseMin.substring(i, i + 1).equals("i")
                    || fraseMin.substring(i, i + 1).equals("o") || fraseMin.substring(i, i + 1).equals("u")) {
                con++;
            }
        }
        System.out.println("La cantidad de vocales en la frase o palabra es: " + con);
    }

    public void invertirFrase(Cadena c) {
        
        System.out.print("La frase invertida quedaría: ");
        for (int i = c.getLongitud() - 1; i > 0; i--) {
            System.out.print(c.getFrase().substring(i, i + 1));
        }
        System.out.println(" ");
    }

    public void vecesRepetido(Cadena c) {

        System.out.print("Ingrese un caracter a contabilizar en la frase: ");
        String letra = leer.nextLine().toLowerCase();
        String fraseMin = c.getFrase().toLowerCase();
        int con = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (fraseMin.substring(i, i + 1).equals(letra)) {
                con++;
            }
        }
        System.out.println("El caracter ingresado se repite " + con + " veces");
    }

    public void compararLongitud(Cadena c) {

        System.out.print("Ingrese una frase nueva: ");
        String frase2 = leer.nextLine();
        if (frase2.length() < c.getLongitud()) {
            System.out.println("La frase ingresada es mas corta que la primer frase");
        } else if (frase2.length() > c.getLongitud()) {
            System.out.println("La frase ingresada es mas larga que la primer frase");
        } else {
            System.out.println("La frase ingresada posee la misma longitud que la primer frase");
        }
    }

    public void unirFrases(Cadena c) {

        System.out.print("Ingrese una nueva frase: ");
        String frase2 = leer.nextLine();
        System.out.println("La frase resultante es: " + c.getFrase() + " " + frase2);
    }

    public void reemplazar(Cadena c) {

        System.out.print("Ingrese un caracter para reemplazar todas las 'a': ");
        String caracter = leer.nextLine();
        String frase2 = c.getFrase().replace("a", caracter);
        frase2 = frase2.replace("A", caracter);
        System.out.println(frase2);
    }

    public void contiene(Cadena c) {

        boolean val = false;
        System.out.print("Ingrese una letra para verificar si está contenida en la frase: ");
        String letra = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i + 1).equals(letra)) {
                val = true;
            }
        }
        System.out.println(val);
    }
}
