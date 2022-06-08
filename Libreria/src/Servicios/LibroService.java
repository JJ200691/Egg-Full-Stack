package Servicios;

import Moldes.Libro;
import Persistencia.LibroDAO;
import java.util.Scanner;

public class LibroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private LibroDAO dao;
    
    public LibroService() {
        dao = new LibroDAO();
    }
    
    public void crearLibro() {
        
        try {
            Libro x = new Libro();
            System.out.print("Ingrese el titulo del libro: ");
            x.setTitulo(leer.next());
            System.out.print("Ingrese el año del libro: ");
            x.setAnio(leer.nextInt());
            System.out.print("Cuantos ejemplares del libro existen: ");
            x.setEjemplares(leer.nextInt());
            System.out.print("Cuanto ejemplares se encuentran prestados: ");
            x.setEjemplaresPrestados(leer.nextInt());
            x.setEjemplaresRestantes(x.getEjemplares() - x.getEjemplaresPrestados());
            x.setEditorial(x.getEditorial());
            x.setAutor(x.getAutor());
            x.setAlta(true);
            dao.guardar(x);
        } catch (Exception e) {
            e.getCause();
        }
    }
    
    public Libro borrarLibro() {
        
        Libro x = new Libro();
        try {
            System.out.print("Ingrese el id del libro a borrar: ");
            x.setISBN(leer.nextInt());
            x.setAlta(false);
            dao.eliminarPorId(x);
        } catch (Exception e) {
            e.getCause();
        }
        return x;
    }
    
    public Libro modificarLibro() {
        
        Libro x = new Libro();
        try {
            System.out.print("Ingrese el id del libro a modificar: ");
            x.setISBN(leer.nextInt());
            System.out.print("Modifique el nombre: ");
            x.setTitulo(leer.next());
            dao.modificarPorId(x);
        } catch (Exception e) {
            e.getCause();
        }
        return x;
    }
    
    public void verLista() {
        
        try {
            dao.listarLibros();
        } catch (Exception e) {
            e.getCause();
        }
    }
    
    public void menu() {
        
        int opc;
        try {
            do {
                System.out.println("|||||MENU|||||\n"
                        + "1- CREAR LIBRO\n"
                        + "2- BORRAR LIBRO\n"
                        + "3- MODIFICAR LIBRO\n"
                        + "4- VER LISTA\n"
                        + "5- SALIR\n"
                        + "Ingrese una opción: ");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        this.crearLibro();
                        break;
                    case 2:
                        this.borrarLibro();
                        break;
                    case 3:
                        this.modificarLibro();
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
