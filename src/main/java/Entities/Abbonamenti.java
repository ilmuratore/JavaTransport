package Entities;

import java.util.Date;

public class Abbonamenti {
    private int AbbonamentoId;
    private TipoAbbonamento tipoAbbonamento;
    private Date scadenzaAnnuale;
    private int utenteId;
    private Date pagato;
    private Date dataEmissione;

    //costruttore

    public Abbonamenti(int AbbonamentoId, TipoAbbonamento tipoAbbonamento, Date scadenzaAnnuale, int utenteId, Date pagato, Date dataEmissione) {
        this.AbbonamentoId = AbbonamentoId;
        this.tipoAbbonamento = tipoAbbonamento;
        this.scadenzaAnnuale = scadenzaAnnuale;
        this.utenteId = utenteId;
        this.pagato = pagato;
        this.dataEmissione = dataEmissione;
    }

    //metodi getter e setter


    public int getAbbonamentoId() {
        return AbbonamentoId;
    }

    public void setAbbonamentoId(int abbonamentoId) {
        AbbonamentoId = abbonamentoId;
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

    public int getUtenteId() {
        return utenteId;
    }

    public void setUtenteId(int utenteId) {
        this.utenteId = utenteId;
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
