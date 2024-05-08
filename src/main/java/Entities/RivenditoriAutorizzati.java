package Entities;

import Services.EmissioneBiglietti;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;


@Entity
@Table(name = "RivenditoriAutorizzati")
public class RivenditoriAutorizzati extends EmissioneBiglietti {
    @Id
    private int RivenditoreId;

    // costruttore
    public RivenditoriAutorizzati(int RivenditoreId) {
        this.RivenditoreId = RivenditoreId;
    }

    // metodo per emissione biglietto
    public Biglietto emettiBigliettoDaRivenditore(int id, boolean vidimato, Date dataConvalida) {
        return emettiBiglietto(id, false, dataConvalida);
    }

    // metodi getter e setter

    public int getRivenditoreId() {
        return RivenditoreId;
    }

    public void setRivenditoreId(int rivenditoreId) {
        RivenditoreId = rivenditoreId;
    }
}
