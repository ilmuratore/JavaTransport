package model;

import jakarta.persistence.*;
import org.hibernate.mapping.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Venditore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
