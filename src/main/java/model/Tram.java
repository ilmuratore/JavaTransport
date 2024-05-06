package model;

import java.util.Date;

public class Tram extends Mezzo{
    public Tram(int id, String targa, String stato, Date entrataInServizio) {
        super(id, 25, targa, stato, entrataInServizio);
    }
}
