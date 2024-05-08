package Services;

import java.util.Date;
import Entities.Biglietti;

public class EmissioneBiglietti {
    public Biglietti emettiBiglietto(int id, boolean vidimato, Date dataConvalida){
        Biglietti biglietto = new Biglietti(id, false, dataConvalida);
        return biglietto;
    }

}


// biglietto salvato sul database
