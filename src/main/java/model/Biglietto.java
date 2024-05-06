package model;

import java.util.Date;

public class Biglietto {
    private int id;
    private String tipologia; // se emesso da distributore o rivenditore
    private boolean vidimato; // quando il biglietto viene vidimato e successivamente annullato ( false non vidimato, true vidimato)
    private Date dataEmissione; // quando il biglietto viene emesso
    private final int validitaBiglietto = 60; // il biglietto ha validita' 60 giorni dall'acquisto se non vidimato


    // getter e setter

    public int setId(){
        return id;
    }

    public void getId(int id){
        this.id = id;
    }

    public String setTipologia(){
        return tipologia;
    }

    public void getTipologia(String tipologia){
        this.tipologia = tipologia;
    }

    public boolean setVidimato(){
        return vidimato;
    }

    public void getVidimato(boolean vidimato){
        this.vidimato = vidimato;
    }

    public Date setDataEmissione(){
        return dataEmissione;
    }

    public void getDataEmissione(Date dataEmissione){
        this.dataEmissione = dataEmissione;
    }


}
