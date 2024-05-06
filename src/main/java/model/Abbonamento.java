package model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Abbonamento{
    private Frequenza frequenza; // se abbonamento settimanale, mensile
    private boolean isValid; // true = attivo, false = scaduto/non presente

    public Abbonamento() {
    }

    public Abbonamento(Frequenza frequenza, boolean isValid) {
        this.frequenza = frequenza;
        this.isValid = isValid;
    }
}



