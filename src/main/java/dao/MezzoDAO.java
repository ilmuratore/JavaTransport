package dao;

import model.Mezzo;

import java.util.List;

public interface MezzoDAO {
    void save(Mezzo mezzo);
    Mezzo trovaPerId(int id);
    List<Mezzo> trovaTutti();
    void update(Mezzo mezzo);
    void delete(int id);
}
