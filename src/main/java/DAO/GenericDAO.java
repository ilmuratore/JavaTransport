package DAO;

import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;

public class GenericDAO<T> {
    private final Class<T> entityClass;

    public GenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void save(T entity) {
        EntityManager em = DatabaseConnection.getInstance().getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }

    public T find(int id) {
        EntityManager em = DatabaseConnection.getInstance().getEntityManager();
        T entity = em.find(entityClass, id);
        em.close();
        return entity;
    }

    public void update(T entity) {
        EntityManager em = DatabaseConnection.getInstance().getEntityManager();
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(T entity) {
        EntityManager em = DatabaseConnection.getInstance().getEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(entity) ? entity : em.merge(entity));
        em.getTransaction().commit();
        em.close();
    }
}
