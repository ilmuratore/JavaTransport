package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Autobus")
public class Autobus extends Mezzo {
    public Autobus(int MezziId, int capienzaMezzo, StatoMezzo statoMezzo, List<Biglietto> vidimati, Tratta tratta, int manutenzioneId) {
        super(MezziId, 60, statoMezzo, vidimati, tratta, manutenzioneId);
    }

}
