package model;

public class Distributore {
    private String nomeDistributore; // diamo un nome univoco al distributore collegato per logica al id dell'autobus
    private String stato; // se in funzione o fuori servizio
    private double conteggioBigliettiEmessi;

    // getter e setter

    public String getNomeDistributore(){
        return nomeDistributore;
    }

    public void setNomeDistributore(String nomeDistributore){
        this.nomeDistributore = nomeDistributore;
    }

    public String getStato(){
        return stato;
    }

    public void setStato(String stato){
        this.stato = stato;
    }

    public double getConteggioBigliettiEmessi(){
        return conteggioBigliettiEmessi;
    }

    public void setConteggioBigliettiEmessi(double conteggioBigliettiEmessi){
        this.conteggioBigliettiEmessi = conteggioBigliettiEmessi;
    }

}