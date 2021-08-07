package fr.snooker4real.facturation.dao.impl;

import fr.snooker4real.facturation.business.Client;
import fr.snooker4real.facturation.dao.ClientDao;
import fr.snooker4real.facturation.dao.ConnexionBdd;
import fr.snooker4real.facturation.dao.Requetes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl implements ClientDao {
    private Connection connection;

    public ClientDaoImpl(){
        try {
            connection = ConnexionBdd.getConnection();
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Client create(Client client) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(Requetes.AJOUT_CLIENT, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, client.getNom());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
            client.setId(rs.getLong(1));
        }

        return client;
    }

    @Override
    public List<Client> findAll() throws SQLException {
        PreparedStatement ps = connection.prepareStatement(Requetes.RECUPERATION_CLIENTS);
        ResultSet rs = ps.executeQuery();

        List<Client> clients = new ArrayList<>();

        while (rs.next()) {
            Long id = rs.getLong("id");
            String nom = rs.getString("nom");
            clients.add(new Client(id, nom));
        }
        return clients;
    }

    @Override
    public Client findOne(Long id) throws SQLException {
        String query = Requetes.RECUPERATION_CLIENT_PAR_ID;
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();

        Client client = null;

        if (rs.next()) {
            client = new Client(rs.getString("nom"));
            client.setId(rs.getLong("id"));
        }
        return client;
    }

    @Override
    public Client update(Client client) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(Requetes.UPDATE_CLIENT);

        ps.setString(1, client.getNom());
        ps.setLong(2, client.getId());

        ps.executeUpdate();
        return client;
    }

    @Override
    public boolean delete(Client client) throws SQLException {
        boolean estPresent = false;

        if (findOne(client.getId()) != null){
            PreparedStatement ps = connection.prepareStatement(Requetes.DELETE_CLIENT);
            ps.setLong(1, client.getId());
            ps.executeUpdate();
            estPresent = true;
        }

        return estPresent;
    }
}
