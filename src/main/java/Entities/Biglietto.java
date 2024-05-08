package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Biglietto")
public class Biglietto {
    @Id
    private int bigliettoId;
    private boolean vidimato;
    private Date dataConvalida;

    // costruttore

    public Biglietto(int bigliettoId, boolean vidimato, Date dataConvalida) {
        this.bigliettoId = bigliettoId;
        this.vidimato = vidimato;
        this.dataConvalida = dataConvalida;

    }

    public Biglietto() {

    }

    // getter e setter

    public int getBigliettoId() {
        return bigliettoId;
    }

    public void setBigliettoId(int bigliettoId) {
        this.bigliettoId = bigliettoId;
    }

    public boolean isVidimato() {
        return vidimato;
    }

    public void setVidimato(boolean vidimato) {
        this.vidimato = vidimato;
    }

    public Date getDataConvalida() {
        return dataConvalida;
    }

    public void setDataConvalida(Date dataConvalida) {
        this.dataConvalida = dataConvalida;
    }
}
