package Entities;

import java.util.List;

public class Tram extends Mezzi{
    public Tram(int MezziId, int capienzaMezzo, StatoMezzo statoMezzo, List<Biglietti> vidimati, Tratta tratta, int manutenzioneId) {
        super(MezziId, 40, statoMezzo, vidimati, tratta, manutenzioneId);
    }

}
