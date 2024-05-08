package Entities;

public class Tratta {
    private int trattaId;
    private String partenzaTratta;
    private String capolineaTratta;
    private int tempoPercorrenzaTratta;
    private int tempoEffettivoTratta;

    // costruttore

    public Tratta(int trattaId, String partenzaTratta, String capolineaTratta, int tempoPercorrenzaTratta, int tempoEffettivoTratta) {
        this.trattaId = trattaId;
        this.partenzaTratta = partenzaTratta;
        this.capolineaTratta = capolineaTratta;
        this.tempoPercorrenzaTratta = tempoPercorrenzaTratta;
        this.tempoEffettivoTratta = tempoEffettivoTratta;
    }

    // metodi getter e setter


    public int getTrattaId() {
        return trattaId;
    }

    public void setTrattaId(int trattaId) {
        this.trattaId = trattaId;
    }

    public String getPartenzaTratta() {
        return partenzaTratta;
    }

    public void setPartenzaTratta(String partenzaTratta) {
        this.partenzaTratta = partenzaTratta;
    }

    public String getCapolineaTratta() {
        return capolineaTratta;
    }

    public void setCapolineaTratta(String capolineaTratta) {
        this.capolineaTratta = capolineaTratta;
    }

    public int getTempoPercorrenzaTratta() {
        return tempoPercorrenzaTratta;
    }

    public void setTempoPercorrenzaTratta(int tempoPercorrenzaTratta) {
        this.tempoPercorrenzaTratta = tempoPercorrenzaTratta;
    }

    public int getTempoEffettivoTratta() {
        return tempoEffettivoTratta;
    }

    public void setTempoEffettivoTratta(int tempoEffettivoTratta) {
        this.tempoEffettivoTratta = tempoEffettivoTratta;
    }
}
