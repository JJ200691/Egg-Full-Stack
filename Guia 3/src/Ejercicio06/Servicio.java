package Ejercicio06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashMap<Integer, String> crearMap() {

        HashMap<Integer, String> autos = new HashMap();
        String resp;

        do {
            Auto x = new Auto();
            System.out.print("Nombre del auto: ");
            x.setNombre(leer.next());
            System.out.print("Precio del auto: ");
            x.setPrecio(leer.nextInt());
            autos.put(x.getPrecio(), x.getNombre());
            System.out.println("Desea agregar otro auto? S/N");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));
        return autos;
    }

    public void modificarPrecio(HashMap<Integer, String> x) {

        System.out.print("Ingrese el nombre del vehiculo a modificar: ");
        String autoMod = leer.next();
        if (x.containsValue(autoMod)) {
            System.out.print("Ingrese el nuevo precio: ");
            x.replace(leer.nextInt(), autoMod);
            System.out.println("El precio del vehiculo fue modificado");
        } else {
            System.out.println("El vehiculo ingresado no se encuentra en la lista");
        }
    }

    public void eliminarAuto(HashMap<Integer, String> x) {

        System.out.print("Ingrese el nombre del vehiculo a eliminar: ");
        String autoEli = leer.next();
        if (x.containsValue(autoEli)) {
            x.remove(autoEli);
            System.out.println("El vehiculo fue eliminado");
        } else {
            System.out.println("El vehiculo ingresado no se encuentra en la lista");
        }
    }

    public void mostrarMap(HashMap<Integer, String> x) {

        System.out.println("La lista de autos es la siguiente:");
        for (Map.Entry<Integer, String> entry : x.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Precio $" + key + " Vehiculo: " + value);
        }
    }

    public void menu(HashMap<Integer, String> x) {

        int opc;

        do {

            System.out.println("Ingrese que acción desea realizar\n"
                    + "***1)Crear lista de vehiculos***\n"
                    + "***2)Modificar precio de un vehiculo***\n"
                    + "***3)Eliminar un vehiculo de la lista***\n"
                    + "***4)Mostrar lista***\n"
                    + "***5)Salir***");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    crearMap();
                    break;
                case 2:
                    modificarPrecio(x);
                    break;
                case 3:
                    eliminarAuto(x);
                    break;
                case 4:
                    mostrarMap(x);
                    break;
                case 5:
                    System.out.println("Usted ha salido del programa");
            }

        } while (opc != 5);
    }
}
