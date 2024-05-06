package model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

public class Mezzo {
    @Id
    @GeneratedValue
    private int id;
    private int capacita;
    private String stato;
    private Date entrataInServizio;

    public Mezzo() {
    }

    public Mezzo(int id, int capacita, String stato, Date entrataInServizio) {
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

    public boolean inServizio(){
        return "in service".equals(stato);
    }