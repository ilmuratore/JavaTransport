package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Tram")
public class Tram extends Mezzo {
    public Tram(int MezziId, int capienzaMezzo, StatoMezzo statoMezzo, List<Biglietto> vidimati, Tratta tratta, int manutenzioneId) {
        super(MezziId, 40, statoMezzo, vidimati, tratta, manutenzioneId);
    }

}
