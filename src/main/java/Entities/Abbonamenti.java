package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;


@Entity
@Table(name = "Abbonamenti")
public class Abbonamenti{
    @Id
    private int abbonamentoId;
    private TipoAbbonamento tipoAbbonamento;
    private Date scadenzaAnnuale;
    private Utente utente;
    private Date pagato;
    private Date dataEmissione;


    //costruttore

    public Abbonamenti(int abbonamentoId, TipoAbbonamento tipoAbbonamento, Date scadenzaAnnuale, Utente utente, Date pagato, Date dataEmissione) {
        this.abbonamentoId = abbonamentoId;
        this.tipoAbbonamento = tipoAbbonamento;
        this.scadenzaAnnuale = scadenzaAnnuale;
        this.utente = utente;
        this.pagato = pagato;
        this.dataEmissione = dataEmissione;
    }

    //metodi getter e setter


    public int getAbbonamentoId() {
        return abbonamentoId;
    }

    public void setAbbonamentoId(int abbonamentoId) {
        this.abbonamentoId = abbonamentoId;
    }

    public TipoAbbonamento getTipoAbbonamento() {
        return tipoAbbonamento;
    }

    public void setTipoAbbonamento(TipoAbbonamento tipoAbbonamento) {
        this.tipoAbbonamento = tipoAbbonamento;
    }

    public Date getScadenzaAnnuale() {
        return scadenzaAnnuale;
    }

    public void setScadenzaAnnuale(Date scadenzaAnnuale) {
        this.scadenzaAnnuale = scadenzaAnnuale;
    }

     public Utente getUtente() {
          return utente;
     }

        public void setUtente(Utente utente) {
            this.utente = utente;
        }

    public Date getPagato() {
        return pagato;
    }

    public void setPagato(Date pagato) {
        this.pagato = pagato;
    }

    public Date getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(Date dataEmissione) {
        this.dataEmissione = dataEmissione;
    }
}
