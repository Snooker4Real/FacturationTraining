package fr.snooker4real.facturation.dao.impl;

import fr.snooker4real.facturation.business.Facture;
import fr.snooker4real.facturation.business.LigneFacture;
import fr.snooker4real.facturation.business.Prestation;
import fr.snooker4real.facturation.dao.ConnexionBdd;
import fr.snooker4real.facturation.dao.LigneFactureDao;
import fr.snooker4real.facturation.dao.PrestationDao;
import fr.snooker4real.facturation.dao.Requetes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LigneFactureDaoImpl implements LigneFactureDao {

    private Connection connection;
    private PrestationDao prestationDao = null;

    public LigneFactureDaoImpl() {
        try {
            connection = ConnexionBdd.getConnection();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        prestationDao = new PrestationDaoImpl();
    }

    @Override
    public LigneFacture create(LigneFacture ligneFacture) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(Requetes.AJOUT_LIGNE_FACTURE, Statement.RETURN_GENERATED_KEYS);
        ps.setLong(1, ligneFacture.getFacture().getId());
        ps.setLong(2, ligneFacture.getPrestation().getId());
        ps.setFloat(3, ligneFacture.getQuantite());
        ps.setFloat(4, ligneFacture.getRemise());

        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
            ligneFacture.setId(rs.getLong(1));
        }
        return ligneFacture;
    }

    @Override
    public List<LigneFacture> findByFacture(Facture facture) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(Requetes.RECUPERATION_LIGNES_FACTURES_PAR_FACTURE);
        ps.setLong(1, facture.getId());
        ResultSet rs = ps.executeQuery();

        List<LigneFacture> lignesFacture = new ArrayList<>();

        while (rs.next()) {
            Long id = rs.getLong("id");
            float quantite = rs.getFloat("quantite");
            Float remise = rs.getFloat("remise");
            Prestation prestation = prestationDao.findOne(rs.getLong("prestation_id"));
            lignesFacture.add(new LigneFacture(id, facture, prestation, quantite, remise));
        }

        return lignesFacture;
    }

}
