package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Tram extends Mezzo{

    @OneToOne(mappedBy = "tram")
    private Distributore distributore;

}
