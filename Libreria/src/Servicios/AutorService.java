package Servicios;

import Moldes.Autor;
import Persistencia.AutorDAO;
import java.util.Scanner;

public class AutorService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private AutorDAO dao;

    public AutorService() {
        dao = new AutorDAO();
    }

    public void crearAutor() {

        try {
            Autor x = new Autor();
            System.out.print("Ingrese el nombre del autor: ");
            x.setNombre(leer.next());
            x.setAlta(true);
            dao.guardar(x);
        } catch (Exception e) {
            e.getCause();
        }
    }

    public Autor borrarAutor() {

        Autor x = new Autor();
        try {
            System.out.print("Ingrese el id del autor a borrar: ");
            x.setId(leer.nextInt());
            x.setAlta(false);
            dao.eliminarPorId(x);
        } catch (Exception e) {
            e.getCause();
        }
        return x;
    }

    public Autor modificarAutor() {

        Autor x = new Autor();
        try {
            System.out.print("Ingrese el id del autor a modificar: ");
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
            dao.listarAutores();
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void menu() {

        int opc;
        try {
            do {
                System.out.println("|||||MENU|||||\n"
                        + "1- CREAR AUTOR\n"
                        + "2- BORRAR AUTOR\n"
                        + "3- MODIFICAR AUTOR\n"
                        + "4- VER LISTA\n"
                        + "5- SALIR\n"
                        + "Ingrese una opción: ");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        this.crearAutor();
                        break;
                    case 2:
                        this.borrarAutor();
                        break;
                    case 3:
                        this.modificarAutor();
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
