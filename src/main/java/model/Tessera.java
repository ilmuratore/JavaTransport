package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class Tessera {
    @Id
    @GeneratedValue
    private int idTessera;
    @OneToOne
    @JoinColumn(name = "passeggero_id")
    private Passeggero passeggero;
    private Date emissione;
    private boolean isValid;
    @Embedded
    private Abbonamento abbonamento;


    public Tessera(int idTessera, Passeggero passeggero, Date emissione, boolean isValid, Abbonamento abbonamento) {
        this.idTessera = idTessera;
        this.passeggero = passeggero;
        this.emissione = emissione;
        this.isValid = isValid;
        this.abbonamento = abbonamento;
    }

}