package model;

import java.util.Date;

public class ManutenzioneVeicoli {
    private String veicoloId;
    private Date inizioManutenzione;
    private Date fineManutenzione;
    private String statoVeicolo;

    // getter e setter

    public String getVeicoloId(){
        return veicoloId;
    }

    public void setVeicoloId(String veicoloId){
        this.veicoloId = veicoloId;
    }

    public Date getInizioManutenzione(){
        return inizioManutenzione;
    }

    public void setInizioManutenzione(Date inizioManutenzione){
        this.inizioManutenzione = inizioManutenzione;
    }

    public Date getFineManutenzione(){
        return fineManutenzione;
    }

    public void setFineManutenzione(Date fineManutenzione){
        this.fineManutenzione = fineManutenzione;
    }

    public String getStatoVeicolo(){
        return statoVeicolo;
    }

    public void setStatoVeicolo(String statoVeicolo){
        this.statoVeicolo = statoVeicolo;
    }

}