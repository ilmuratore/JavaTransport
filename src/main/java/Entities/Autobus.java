package Entities;

import java.util.List;

public class Autobus extends Mezzi{
    public Autobus(int MezziId, int capienzaMezzo, StatoMezzo statoMezzo, List<Biglietti> vidimati, Tratta tratta, int manutenzioneId) {
        super(MezziId, 60, statoMezzo, vidimati, tratta, manutenzioneId);
    }

}
