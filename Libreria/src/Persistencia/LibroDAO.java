package Persistencia;

import Moldes.Libro;
import java.util.List;

public class LibroDAO extends DAO {

    public void eliminarPorId(Libro x) {

        try {
            x = em.find(Libro.class, x.getISBN());
            em.getTransaction().begin();
            em.remove(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }

    public Libro consultarPorId(Libro x) {

        try {
            x = em.find(Libro.class, x.getISBN());
        } catch (Exception e) {
            e.getCause();
        }
        return x;
    }

    public void listarLibros() {

        try {
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
            for (Libro aux : libros) {
                System.out.println(aux);
            }
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void modificarPorId(Libro x) {

        try {
            x = em.find(x.getClass(), x.getISBN());
            em.getTransaction().begin();
            em.merge(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void guardar(Libro x) {

        try {
            em.getTransaction().begin();
            em.persist(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }
}
