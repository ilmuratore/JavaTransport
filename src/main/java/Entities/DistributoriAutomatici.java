package Entities;

import Entities.Biglietteria;

import java.util.Date;

public class DistributoriAutomatici extends Biglietteria{
    private int DistributoreId;
    private StatoDistributore statoDistributore;

    //costruttore

    public DistributoriAutomatici(int DistributoreId, Date dataEmissione, int emettitoreId, StatoDistributore statoDistributore) {
        super(DistributoreId, dataEmissione, emettitoreId);
        this.DistributoreId = emettitoreId;
        this.statoDistributore = statoDistributore;
    }

    // metodo per emissione biglietto
    public Biglietti emettiBigliettoDaDistributore(int id, boolean vidimato, Date dataConvalida){
        return emettiBiglietto(id,false, dataConvalida);
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
