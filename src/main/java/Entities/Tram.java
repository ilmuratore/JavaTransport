package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Tram")
public class Tram extends Mezzi{
    public Tram(int MezziId, int capienzaMezzo, StatoMezzo statoMezzo, List<Biglietti> vidimati, Tratta tratta, int manutenzioneId) {
        super(MezziId, 40, statoMezzo, vidimati, tratta, manutenzioneId);
    }

}
