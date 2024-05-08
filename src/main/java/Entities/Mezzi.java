package Entities;

import java.util.List;


public class Mezzi {
    private int MezziId;
    private int capienzaMezzo;
    private StatoMezzo statoMezzo;
    private List<Biglietti> vidimati;
    private Tratta tratta;
    private int manutenzioneId;

    // costruttore

    public Mezzi(int mezziId, int capienzaMezzo, StatoMezzo statoMezzo, List<Biglietti> vidimati, Tratta tratta, int manutenzioneId){
        MezziId = mezziId;
        this.capienzaMezzo = capienzaMezzo;
        this.statoMezzo = statoMezzo;
        this.vidimati = vidimati;
        this.tratta = tratta;
        this.manutenzioneId = manutenzioneId;
    }


    // getter e setter


    public int getMezziId() {
        return MezziId;
    }

    public void setMezziId(int mezziId) {
        MezziId = mezziId;
    }

    public int getCapienzaMezzo() {
        return capienzaMezzo;
    }

    public void setCapienzaMezzo(int capienzaMezzo) {
        this.capienzaMezzo = capienzaMezzo;
    }

    public StatoMezzo getStatoMezzo() {
        return statoMezzo;
    }

    public void setStatoMezzo(StatoMezzo statoMezzo) {
        this.statoMezzo = statoMezzo;
    }

    public List<Biglietti> getVidimati() {
        return vidimati;
    }

    public void setVidimati(List<Biglietti> vidimati) {
        this.vidimati = vidimati;
    }

    public Tratta getTratta() {
        return tratta;
    }

    public void setTratta(Tratta tratta) {
        this.tratta = tratta;
    }

    public int getManutenzioneId() {
        return manutenzioneId;
    }

    public void setManutenzioneId(int manutenzioneId) {
        this.manutenzioneId = manutenzioneId;
    }

}
