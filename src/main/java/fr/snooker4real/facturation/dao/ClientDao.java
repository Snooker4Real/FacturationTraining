package fr.snooker4real.facturation.dao;

import fr.snooker4real.facturation.business.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientDao {
    Client create(Client client) throws SQLException;
    List<Client> findAll() throws SQLException;
    Client findOne(Long id) throws SQLException;
    Client update(Client client) throws SQLException;
    boolean delete(Client client) throws SQLException;
}
