package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Autobus {
    @Id
    @GeneratedValue
    private int id;
    private int capacita;
    private String stato;
    private Date entrataInServizio;
    @OneToOne(mappedBy = "autobus")
    private Distributore distributore;

    public Autobus() {
    }



    // metodo gestione in servizio

    public boolean inServizio(){
        return "in service".equals(stato);
    }

}
