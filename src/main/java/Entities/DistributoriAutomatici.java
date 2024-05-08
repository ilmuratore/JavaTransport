package Entities;

import Services.EmissioneBiglietti;

import java.util.Date;

public class DistributoriAutomatici extends EmissioneBiglietti{
    private int DistributoreId;
    private StatoDistributore statoDistributore;

    //costruttore

    public DistributoriAutomatici(int DistributoreId, StatoDistributore statoDistributore) {
        this.DistributoreId = DistributoreId;
        this.statoDistributore = statoDistributore;
    }

    // metodo per emissione biglietto
    public Biglietti emettiBigliettoDaDistributore(int id, Date dataConvalida){
        return emettiBiglietto(id, dataConvalida);
    }

    // metodi getter e setter

    public int getDistributoreId() {
        return DistributoreId;
    }

    public void setDistributoreId(int distributoreId) {
        DistributoreId = distributoreId;
    }

    public StatoDistributore getStatoDistributore() {
        return statoDistributore;
    }

    public void setStatoDistributore(StatoDistributore statoDistributore) {
        this.statoDistributore = statoDistributore;
    }
}
