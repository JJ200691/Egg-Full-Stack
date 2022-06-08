package Persistencia;

import Moldes.Editorial;
import java.util.List;

public class EditorialDAO extends DAO {

    public void eliminarPorId(Editorial x) {

        try {
            x = em.find(Editorial.class, x.getId());
            em.getTransaction().begin();
            em.remove(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }

    public Editorial consultarPorId(Editorial x) {

        try {
            x = em.find(Editorial.class, x.getId());
        } catch (Exception e) {
            e.getCause();
        }
        return x;
    }

    public void listarEditoriales() {

        try {
            List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e").getResultList();
            for (Editorial aux : editoriales) {
                System.out.println(aux);
            }
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void modificarPorId(Editorial x) {

        try {
            x = em.find(Editorial.class, x.getId());
            em.getTransaction().begin();
            em.merge(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void guardar(Editorial x) {

        try {
            em.getTransaction().begin();
            em.persist(x);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getCause();
        }
    }
}
