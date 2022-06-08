package Extra02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<CantanteFamoso> crearLista() {

        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        int c = 0;

        do {

            CantanteFamoso x = new CantanteFamoso();
            System.out.print("Ingrese un cantante: ");
            x.setCantante(leer.next());
            System.out.print("Ingrese el disco que más vendió: ");
            x.setDiscoMasVendido(leer.next());
            cantantes.add(x);

        } while (cantantes.size() < 5);

        for (CantanteFamoso aux : cantantes) {
            System.out.println(c++ + " " + aux);
        }
        return cantantes;
    }

    public void agregarCantante(ArrayList<CantanteFamoso> x) {

        CantanteFamoso a = new CantanteFamoso();
        System.out.print("Ingrese el nuevo cantante: ");
        a.setCantante(leer.next());
        System.out.print("Ingrese el disco: ");
        a.setDiscoMasVendido(leer.next());
        x.add(a);
    }

    public void mostrarLista(ArrayList<CantanteFamoso> x) {

        int c = 0;
        for (CantanteFamoso aux : x) {
            System.out.println(c++ + " " + aux);
        }
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> x) {

        System.out.print("Ingrese el cantante a eliminar: ");
        String elim = leer.next();
        Iterator<CantanteFamoso> it = x.iterator();

        while (it.hasNext()) {
            CantanteFamoso aux = it.next();
            if (aux.getCantante().equalsIgnoreCase(elim)) {
                it.remove();
            }
        }
    }

    public void menu(ArrayList<CantanteFamoso> x) {

        int opc;

        do {
            System.out.println("***MENU***\n"
                    + "1- Crear Lista\n"
                    + "2- Agregar Cantante\n"
                    + "3- Mostrar Lista\n"
                    + "4- Eliminar Cantante\n"
                    + "5- Salir");
            System.out.print("Ingrese una opción: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    crearLista();
                    break;
                case 2:
                    agregarCantante(x);
                    break;
                case 3:
                    mostrarLista(x);
                    break;
                case 4:
                    eliminarCantante(x);
                    break;
                case 5:
                    System.out.println("Adios");
            }

        } while (opc != 5);
    }
}
