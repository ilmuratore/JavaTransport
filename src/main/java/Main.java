import Entities.Biglietto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Date;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String PERSISTENCE_UNIT = "JPA_Inheritance";
    public static void main (String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager em = emf.createEntityManager();

        try { var p = new Biglietto(1, false, new Date(2023 - 1900, 5 - 1, 5));
                var t = em.getTransaction();
                t.begin();
                t.commit();
            //nuova instanza

            //log.debug("messaggio di quell che sto per fare")
            EntityTransaction trans = em.getTransaction();
            trans.begin();

            //log.debug("messaggio di quell che sto per fare")
            //em.persist(istanza);

            //log.debug("messaggio di quell che sto per fare")
            trans.commit();
        }
        catch (Exception e) {
            log.error("eccezione durante le operazioni", e);
        }
        finally {
            em.close();
            emf.close();
        }
    }
}
