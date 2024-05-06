package model;

public class Abbonamento extends Tessera{
    private String tipologia; // se abbonamento annuale, mensile, semestrale etc..
    private String stato; // se attivo o da rinnovare

    // metodi get e set

    public String getTipologia(){
        return tipologia;
    }

    public void setTipologia(String tipologia){
        this.tipologia = tipologia;
    }

    public String getStato(){
        return stato;
    }

    public void setStato(String stato){
        this.stato = stato;
    }
}
