package fr.snooker4real.facturation.dao;

import fr.snooker4real.facturation.business.Facture;
import fr.snooker4real.facturation.business.LigneFacture;

import java.sql.SQLException;
import java.util.List;

public interface LigneFactureDao {
    public LigneFacture create(LigneFacture ligneFacture) throws SQLException;
    public List<LigneFacture> findByFacture(Facture Facture) throws SQLException;
}
