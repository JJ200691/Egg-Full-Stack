package Servicios;

import Moldes.Editorial;
import Persistencia.EditorialDAO;
import java.util.Scanner;

public class EditorialService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private EditorialDAO dao;

    public EditorialService() {
        dao = new EditorialDAO();
    }

    public void crearEditorial() {

        try {
            Editorial x = new Editorial();
            System.out.print("Ingrese el nombre de la editorial: ");
            x.setNombre(leer.next());
            x.setAlta(true);
            dao.guardar(x);
        } catch (Exception e) {
            e.getCause();
        }
    }

    public Editorial borrarEditorial() {

        Editorial x = new Editorial();
        try {
            System.out.print("Ingrese el id de la editorial a borrar: ");
            x.setId(leer.nextInt());
            x.setAlta(false);
            dao.eliminarPorId(x);
        } catch (Exception e) {
            e.getCause();
        }
        return x;
    }

    public Editorial modificarEditorial() {

        Editorial x = new Editorial();
        try {
            System.out.print("Ingrese el id de la editorial a modificar: ");
            x.setId(leer.nextInt());
            System.out.print("Modifique el nombre: ");
            x.setNombre(leer.next());
            dao.modificarPorId(x);
        } catch (Exception e) {
            e.getCause();
        }
        return x;
    }

    public void verLista() {

        try {
            dao.listarEditoriales();
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void menu() {

        int opc;
        try {
            do {
                System.out.println("|||||MENU|||||\n"
                        + "1- CREAR EDITORIAL\n"
                        + "2- BORRAR EDITORIAL\n"
                        + "3- MODIFICAR EDITORIAL\n"
                        + "4- VER LISTA\n"
                        + "5- SALIR\n"
                        + "Ingrese una opción: ");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        this.crearEditorial();
                        break;
                    case 2:
                        this.borrarEditorial();
                        break;
                    case 3:
                        this.modificarEditorial();
                        break;
                    case 4:
                        this.verLista();
                        break;
                    case 5:
                        System.out.println("Ha salido del programa...");
                        break;
                }
            } while (opc != 5);
        } catch (Exception e) {
            e.getCause();
        }
    }
}
