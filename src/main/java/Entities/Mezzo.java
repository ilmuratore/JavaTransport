package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Mezzo")
public class Mezzo {
    @Id
    private int MezziId;
    private int capienzaMezzo;
    private StatoMezzo statoMezzo;
    private List<Biglietto> vidimati;
    private Tratta tratta;
    private int manutenzioneId;

    // costruttore

    public Mezzo(int mezziId, int capienzaMezzo, StatoMezzo statoMezzo, List<Biglietto> vidimati, Tratta tratta, int manutenzioneId){
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

    public List<Biglietto> getVidimati() {
        return vidimati;
    }

    public void setVidimati(List<Biglietto> vidimati) {
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
