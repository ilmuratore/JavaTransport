package test;


import dao.AutobusDAO;
import model.Autobus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AutobusDAOTest {
 @Test
    void save(){
        AutobusDAO autobusDAO = new AutobusDAO();
        Autobus autobus = new Autobus(1975, "CC785NE", "In Servizio", 2024);
        // Imposta i valori di autobus
        autobusDAO.save(autobus);
        Autobus savedAutobus = (Autobus) autobusDAO.trovaPerId(autobus.getId());


 }
}
