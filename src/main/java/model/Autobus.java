package model;

import java.util.Date;

public class Autobus extends Mezzo {
    public Autobus(int id, String targa, String stato, Date entrataInServizio) {
        super(id, 40, targa, stato, entrataInServizio);
    }
}
