package model;

import java.util.Date;

public class Tram {
    private int id;
    private int capacita;
    private String stato;
    private Date entrataInServizio;


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
