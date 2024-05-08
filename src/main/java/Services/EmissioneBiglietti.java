package Services;

import java.util.Date;
import Entities.Biglietti;

public class EmissioneBiglietti {
    public Biglietti emettiBiglietto(int id, Date dataConvalida){
        Biglietti biglietto = new Biglietti(id, false, dataConvalida);
        return biglietto;
    }

}
