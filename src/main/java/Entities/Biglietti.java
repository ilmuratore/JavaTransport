package Entities;

import java.util.Date;

public class Biglietti {
    private int BigliettoId;
    private boolean vidimato;
    private Date dataConvalida;

    // costruttore

    public Biglietti(int BigliettoId, boolean vidimato, Date dataConvalida) {
        this.BigliettoId = BigliettoId;
        this.vidimato = vidimato;
        this.dataConvalida = dataConvalida;
    }

    // getter e setter

    public int getBigliettoId() {
        return BigliettoId;
    }

    public void setBigliettoId(int bigliettoId) {
        BigliettoId = bigliettoId;
    }

    public boolean isVidimato() {
        return vidimato;
    }

    public void setVidimato(boolean vidimato) {
        this.vidimato = vidimato;
    }

    public Date getDataConvalida() {
        return dataConvalida;
    }

    public void setDataConvalida(Date dataConvalida) {
        this.dataConvalida = dataConvalida;
    }
}
