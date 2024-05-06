package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class Tessera {
    @Id
    @GeneratedValue
    private int idTessera;
    @OneToOne
    @JoinColumn(name = "passeggero_id")
    private Passeggero passeggero;
    private Date emissione;
    @Column(name = "isValid", insertable = false, updatable = false)
    private boolean isValid;
    @Embedded
    private Abbonamento abbonamento;



    public Tessera(int idTessera, Passeggero passeggero, Date emissione, boolean isValid, Abbonamento abbonamento) {
        this.idTessera = idTessera;
        this.passeggero = passeggero;
        this.emissione = emissione;
        this.isValid = isValid;
        this.abbonamento = abbonamento;
    }

    // getter e setter

    public int getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(int idTessera) {
        this.idTessera = idTessera;
    }

    public Passeggero getPasseggero() {
        return passeggero;
    }

    public void setPasseggero(Passeggero passeggero) {
        this.passeggero = passeggero;
    }

    public Date getEmissione() {
        return emissione;
    }

    public void setEmissione(Date emissione) {
        this.emissione = emissione;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public Abbonamento getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }

}