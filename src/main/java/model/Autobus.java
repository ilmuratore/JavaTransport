package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Autobus extends Mezzo{

    @OneToOne(mappedBy = "autobus")
    private Distributore distributore;

    public Autobus() {
    }

}
