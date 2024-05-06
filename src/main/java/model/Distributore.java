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



}