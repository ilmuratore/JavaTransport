package model;

public class Passeggero {
    private String nome;
    private String cognome;
    private boolean tesserato; // se true tesserato se false non tesserato
    private boolean abbonamentoValido; // se true abbonamento valido se false abbonamento scaduto

    // getter e setter

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public boolean getTesserato(){
        return tesserato;
    }

    public void setTesserato(boolean tesserato){
        this.tesserato = tesserato;
    }

    public boolean getAbbonamentoValido(){
        return abbonamentoValido;
    }

    public void setAbbonamentoValido(boolean abbonamentoValido){
        this.abbonamentoValido = abbonamentoValido;
    }
}