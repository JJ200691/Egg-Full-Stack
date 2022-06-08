package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class DAO {

    EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
}
