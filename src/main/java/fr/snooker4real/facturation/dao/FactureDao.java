package fr.snooker4real.facturation.dao;

import fr.snooker4real.facturation.business.Client;
import fr.snooker4real.facturation.business.Facture;

import java.sql.SQLException;
import java.util.List;

public interface FactureDao {
    Facture create(Facture facture) throws SQLException;
    List<Facture> findAll() throws SQLException;
    Facture findOne(Long id) throws SQLException;
    List<Facture> findByClients(Client client) throws SQLException;
}
