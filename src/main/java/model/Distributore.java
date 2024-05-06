package model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Distributore {
    private int numDistributore; // diamo un nome univoco al distributore collegato per logica al id del mezzo
    @OneToOne
    @JoinColumn(name = "mezzo_id")
    private Mezzo mezzo;
    private String stato; // se in funzione o fuori servizio
    private double conteggioBigliettiEmessi;

    public Distributore() {
    }

    public Distributore(int numDistributore, Mezzo mezzo, String stato, double conteggioBigliettiEmessi) {
        this.numDistributore = numDistributore;
        this.mezzo = mezzo;
        this.stato = stato;
        this.conteggioBigliettiEmessi = conteggioBigliettiEmessi;
    }

    // getter e setter

    public int getNumDistributore() {
        return numDistributore;
    }

    public void setNumDistributore(int numDistributore) {
        this.numDistributore = numDistributore;
    }

    public Mezzo getMezzo() {
        return mezzo;
    }

    public void setMezzo(Mezzo mezzo) {
        this.mezzo = mezzo;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public double getConteggioBigliettiEmessi() {
        return conteggioBigliettiEmessi;
    }

    public void setConteggioBigliettiEmessi(double conteggioBigliettiEmessi) {
        this.conteggioBigliettiEmessi = conteggioBigliettiEmessi;
    }

}