package model;

public class Tratta {
    private String nomeTratta;
    private String partenzaTratta;
    private String fineTratta;
    private double percorrenzaMedia; // minuti previsti tratta
    private int kmTratta; //
    private double percorrenzaEffettiva;  // minuti effettivi tratta


    // getter e setter

    public String getNomeTratta(){
        return nomeTratta;
    }

    public void setNomeTratta(String nomeTratta){
        this.nomeTratta = nomeTratta;
    }

    public String getPartenzaTratta() {
        return partenzaTratta;
    }

    public void setPartenzaTratta(String partenzaTratta) {
        this.partenzaTratta = partenzaTratta;
    }

    public String getFineTratta() {
        return fineTratta;
    }

    public void setFineTratta(String fineTratta) {
        this.fineTratta = fineTratta;
    }

    public double getPercorrenzaMedia() {
        return percorrenzaMedia;
    }

    public void setPercorrenzaMedia(double percorrenzaMedia) {
        this.percorrenzaMedia = percorrenzaMedia;
    }

    public int getKmTratta() {
        return kmTratta;
    }

    public void setKmTratta(int kmTratta) {
        this.kmTratta = kmTratta;
    }

    public double getPercorrenzaEffettiva() {
        return percorrenzaEffettiva;
    }

    public void setPercorrenzaEffettiva(double percorrenzaEffettiva) {
        this.percorrenzaEffettiva = percorrenzaEffettiva;
    }

}
