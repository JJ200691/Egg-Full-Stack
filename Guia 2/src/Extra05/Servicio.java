package Extra05;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public void adivinarMes(Mes m) {

        String mesSecreto1 = "";

        do {
            System.out.print("Ingrese el mes que considera secreto: ");
            mesSecreto1 = leer.next();
            if (mesSecreto1.equals(m.getMesSecreto())) {
                System.out.println("Acertaste!!!");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            }
        } while (!mesSecreto1.equals(m.getMesSecreto()));

    }

}
