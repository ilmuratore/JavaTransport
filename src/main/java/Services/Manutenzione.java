package Services;

import java.util.Date;

import Entities.Mezzo;
import Entities.StatoMezzo;

public class Manutenzione {
    private int manutenzioneId;
    private Date dataInizioManutenzione;
    private Date dataFineManutenzione;

    // costruttore
    public Manutenzione(int manutenzioneId, Date dataInizioManutenzione, Date dataFineManutenzione){
        this.manutenzioneId = manutenzioneId;
        this.dataInizioManutenzione = dataInizioManutenzione;
        this.dataFineManutenzione = dataFineManutenzione;
    }

    // metodo per inizio manutenzione

    public void inizioManutenzione(Mezzo mezzo){
        mezzo.setStatoMezzo(StatoMezzo.IN_MANUTENZIONE);
        mezzo.setManutenzioneId(this.manutenzioneId);
    }

    // metodo per fine manutenzione

    public void fineManutenzione(Mezzo mezzo){
        mezzo.setStatoMezzo(StatoMezzo.DISPONIBILE);
        mezzo.setManutenzioneId(0);
    }

    // getter e setter

    public int getManutenzioneId() {
        return manutenzioneId;
    }

    public void setManutenzioneId(int manutenzioneId) {
        this.manutenzioneId = manutenzioneId;
    }

    public Date getDataInizioManutenzione() {
        return dataInizioManutenzione;
    }

    public void setDataInizioManutenzione(Date dataInizioManutenzione) {
        this.dataInizioManutenzione = dataInizioManutenzione;
    }

    public Date getDataFineManutenzione() {
        return dataFineManutenzione;
    }

    public void setDataFineManutenzione(Date dataFineManutenzione) {
        this.dataFineManutenzione = dataFineManutenzione;
    }
}
