package Entities;

import Services.EmissioneBiglietti;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Biglietterie")
public class Biglietteria extends EmissioneBiglietti {
    @Id
    private int BiglietteriaId;
    private Date dataEmissione;
    private int emettitoreId; // collegato agli id delle classi distributori automatici e rivenditori autorizzati

    // costruttore

    public Biglietteria(int BiglietteriaId, Date dataEmissione, int emettitoreId) {
        this.BiglietteriaId = BiglietteriaId;
        this.dataEmissione = dataEmissione;
        this.emettitoreId = emettitoreId;
    }

    // metodi getter e setter

    public int getBiglietteriaId() {
        return BiglietteriaId;
    }

    public void setBiglietteriaId(int biglietteriaId) {
        BiglietteriaId = biglietteriaId;
    }

    public Date getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(Date dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    public int getEmettitoreId() {
        return emettitoreId;
    }

    public void setEmettitoreId(int emettitoreId) {
        this.emettitoreId = emettitoreId;
    }
}
