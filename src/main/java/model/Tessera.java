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

}