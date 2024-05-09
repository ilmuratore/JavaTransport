package DAO;

import Connection.DatabaseConnection;
import Entities.Autobus;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class AutobusDAO extends GenericDAO<Autobus>{
    public AutobusDAO() {
        super(Autobus.class);
    }

    @Override
    public void save(Autobus autobus) {
        var entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Inheritance");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(autobus);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Autobus trovaPerId(int id) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        Autobus autobus = entityManager.find(Autobus.class, id);
        entityManager.close();
        return autobus;
    }

    @Override
    public List<Autobus> trovaTutti() {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        List<Autobus> autobusList = entityManager.createQuery("SELECT a FROM Autobus a", Autobus.class).getResultList();
        entityManager.close();
        return autobusList;
    }

    @Override
    public void update(Autobus autobus) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(autobus);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void delete(int id) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        Autobus autobus = entityManager.find(Autobus.class, id);
        if (autobus != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(autobus);
            entityManager.getTransaction().commit();
        }
        entityManager.close();
    }
}
