package model;

import java.util.Date;

public class Biglietto {
    private int id;
    private String tipologia; // se emesso da distributore o rivenditore
    private boolean vidimato; // quando il biglietto viene vidimato e successivamente annullato ( false non vidimato, true vidimato)
    private Date dataEmissione; // quando il biglietto viene emesso
    private final int validitaBiglietto = 60; // il biglietto ha validita' 60 giorni dall'acquisto se non vidimato

    // getter e setter

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTipologia(){
        return tipologia;
    }

    public void setTipologia(String tipologia){
        this.tipologia = tipologia;
    }

    public boolean getVidimato(){
        return vidimato;
    }

    public void setVidimato(boolean vidimato){
        this.vidimato = vidimato;
    }

    public Date getDataEmissione(){
        return dataEmissione;
    }

    public void setDataEmissione(Date dataEmissione){
        this.dataEmissione = dataEmissione;
    }
}