package fr.snooker4real.facturation.dao;

import fr.snooker4real.facturation.business.Prestation;

import java.sql.SQLException;
import java.util.List;

public interface PrestationDao {
    Prestation create(Prestation prestation) throws SQLException;
    List<Prestation> findAll() throws SQLException;
    Prestation findOne(Long id) throws SQLException;
}
