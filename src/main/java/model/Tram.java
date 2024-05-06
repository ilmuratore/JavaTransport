package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Tram {
    @Id
    @GeneratedValue
    private int id;
    private int capacita;
    private String stato;
    private Date entrataInServizio;

    public Tram() {
    }

    public Tram(int id, int capacita, String stato, Date entrataInServizio) {
        this.id = id;
        this.capacita = capacita;
        this.stato = stato;
        this.entrataInServizio = entrataInServizio;
    }

    // getter e setter eventuali
    // getter e setter
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getCapacita(){
        return capacita;
    }

    public void setCapacita(int capacita){
        this.capacita = capacita;
    }

    public String getStato(){
        return stato;
    }

    public void setStato(String stato){
        this.stato = stato;
    }

    public Date getEntrataInServizio(){
        return entrataInServizio;
    }

    public void setEntrataInServizio(Date entrataInServizio){
        this.entrataInServizio = entrataInServizio;
    }

    // metodo gestione in servizio

    public boolean inServizio(){
        return "in service".equals(stato);
    }
}
