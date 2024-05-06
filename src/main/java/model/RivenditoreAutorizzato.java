package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class RivenditoreAutorizzato {
    @Id
    @GeneratedValue
    private int numRivenditore;
    private String name;
    private double conteggioBigliettiEmessi;

    public RivenditoreAutorizzato() {
    }

    public RivenditoreAutorizzato(String name, double conteggioBigliettiEmessi) {
        this.name = name;
        this.conteggioBigliettiEmessi = conteggioBigliettiEmessi;
    }

    // Getters and Setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getConteggioBigliettiEmessi(){
        return conteggioBigliettiEmessi;
    }

    public void setConteggioBigliettiEmessi(double conteggioBigliettiEmessi){
        this.conteggioBigliettiEmessi = conteggioBigliettiEmessi;
    }
}