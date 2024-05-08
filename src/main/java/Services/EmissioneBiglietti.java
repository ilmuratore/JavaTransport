package Services;

import java.util.Date;
import Entities.Biglietto;

public class EmissioneBiglietti {
    public Biglietto emettiBiglietto(int id, boolean vidimato, Date dataConvalida){
        Biglietto biglietto = new Biglietto(id, false, dataConvalida);
        return biglietto;
    }

}


// biglietto salvato sul database
