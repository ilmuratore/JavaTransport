import Entities.Utente;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            var u = new Utente(1, "Mario", "Rossi", 1);
            log.debug("ho creato l'utente:{}", u);
        } catch (Exception e) {
            log.error("eccezione durante le operazioni", e);
        } finally {
            //em.close();
            //emf.close();
        }
    }
}
