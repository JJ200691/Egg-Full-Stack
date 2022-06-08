package Extra04;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public NIF crearNIF() {

        System.out.print("Ingrese su número de DNI: ");
        long DNI = leer.nextLong();
        long calculo = DNI % 23;
        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P",
            "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int a = Math.round(calculo);
        String letra = vector[a];
        return new NIF(DNI, letra);
    }

    public void mostrar(NIF a) {

        System.out.println(a.getDNI() + "-" + a.getLetra());
    }

}
