package Ejercicio06;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera crear() {

        Cafetera caf1 = new Cafetera();
        caf1.setCantMax(3000);
        return caf1;
    }

    public void llenarCaf(Cafetera caf1) {

        caf1.setCantAct(caf1.getCantMax());
        System.out.println("La cafetera está llena de café");
    }

    public void servirTaza(Cafetera caf1) {

        System.out.print("Ingrese el volumen de la taza: ");
        double taza = leer.nextDouble();
        if (taza > caf1.getCantAct()) {
            System.out.println("La cantidad de cafe es insuficiente para llenar la taza...\n"
                    + "Su taza quedó con " + caf1.getCantAct() + "ml de café");
            caf1.setCantAct(0);
        } else {
            caf1.setCantAct(caf1.getCantAct() - taza);
            System.out.println("Su taza se llenó...\n"
                    + "La cafetera contiene " + caf1.getCantAct() + "ml de café");
        }
    }

    public void vaciarCaf(Cafetera caf1) {

        System.out.println("La cafetera se ha vaciado...");
        caf1.setCantAct(0);
    }

    public void agregarCafe(Cafetera caf1) {

        System.out.print("Cuanto café desea agregar: ");
        double agrega = leer.nextDouble();
        if (agrega > caf1.getCantMax()) {
            System.out.println("La cafetera se ha llenado...");
            caf1.setCantAct(caf1.getCantMax());
        } else {
            caf1.setCantAct(caf1.getCantAct() + agrega);
        }
    }

    public void menu(Cafetera caf1) {

        int opc;

        do {

            System.out.println("***ELIJA UNA OPCION***\n"
                    + "1 - LLENAR CAFETERA\n"
                    + "2 - SERVIR TAZA\n"
                    + "3 - VACIAR CAFETERA\n"
                    + "4 - AGREGAR CAFÉ\n"
                    + "5 - SALIR");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    llenarCaf(caf1);
                    break;
                case 2:
                    servirTaza(caf1);
                    break;
                case 3:
                    vaciarCaf(caf1);
                    break;
                case 4:
                    agregarCafe(caf1);
                    break;
                case 5:
                    System.out.println("Que tenga un buen dia!!!");
            }
        } while (opc != 5);
    }
}
