package Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Utente")
public class Utente {
    @Id
    private int UtenteId;
    private String UtenteNome;
    private String UtenteCognome;
    private String tesseraUtente;


    // costruttore
    public Utente(int UtenteId, String UtenteNome, String UtenteCognome) {
        this.UtenteId = UtenteId;
        this.UtenteNome = UtenteNome;
        this.UtenteCognome = UtenteCognome;
    }

    // metodi getter e setter

    public int getUtenteId() {
        return UtenteId;
    }

    public void setUtenteId(int utenteId) {
        UtenteId = utenteId;
    }

    public String getUtenteNome() {
        return UtenteNome;
    }

    public void setUtenteNome(String utenteNome) {
        UtenteNome = utenteNome;
    }

    public String getUtenteCognome() {
        return UtenteCognome;
    }

    public void setUtenteCognome(String utenteCognome) {
        UtenteCognome = utenteCognome;
    }
}
