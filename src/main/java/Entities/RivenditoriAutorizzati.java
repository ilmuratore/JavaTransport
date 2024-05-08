package Entities;

import Services.EmissioneBiglietti;
import java.util.Date;

public class RivenditoriAutorizzati extends EmissioneBiglietti {
    private int RivenditoreId;

    // costruttore

    public RivenditoriAutorizzati(int RivenditoreId) {
        this.RivenditoreId = RivenditoreId;
    }

    // metodo per emissione biglietto

    public Biglietti emettiBigliettoDaRivenditore(int id, Date dataConvalida) {
        return emettiBiglietto(id, dataConvalida);
    }
    // metodi getter e setter


    public int getRivenditoreId() {
        return RivenditoreId;
    }

    public void setRivenditoreId(int rivenditoreId) {
        RivenditoreId = rivenditoreId;
    }
}
