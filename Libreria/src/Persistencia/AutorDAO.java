package Persistencia;

import Moldes.Autor;
import java.util.List;

public class AutorDAO extends DAO {

    public void eliminarPorId(Autor x) {

        try {
            x = em.find(Autor.class, x.getId());
            em.getTransaction().begin();
            em.remove(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }

    public Autor consultarPorId(Autor x) {

        try {
            x = em.find(Autor.class, x.getId());
        } catch (Exception e) {
            e.getCause();
        }
        return x;
    }

    public void listarAutores() {

        try {
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
            for (Autor aux : autores) {
                System.out.println(aux);
            }
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void modificarPorId(Autor x) {

        try {
            x = em.find(Autor.class, x.getId());
            em.getTransaction().begin();
            em.merge(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void guardar(Autor x) {

        try {
            em.getTransaction().begin();
            em.persist(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }
}
