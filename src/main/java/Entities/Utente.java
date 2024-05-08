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
    private String TesseraUtente;


    // costruttore
    public Utente(int UtenteId, String UtenteNome, String UtenteCognome, String TesseraUtente) {
        this.UtenteId = UtenteId;
        this.UtenteNome = UtenteNome;
        this.UtenteCognome = UtenteCognome;
        this.TesseraUtente = TesseraUtente;
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

    public String getTesseraUtente() {return TesseraUtente;}

    public void setTesseraUtente(String tesseraUtente) { TesseraUtente = tesseraUtente;}
}
