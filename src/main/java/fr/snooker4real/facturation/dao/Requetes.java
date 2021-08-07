package fr.snooker4real.facturation.dao;

public class Requetes {
    public static final String AJOUT_CLIENT = "INSERT INTO client (nom) VALUES (?)";
    public static final String AJOUT_FACTURE = "INSERT INTO facture (date_creation, date_echeance, client_id) VALUES (?, ?, ?)";
    public static final String AJOUT_PRESTATION = "INSERT INTO prestation (nom, montant) VALUES (?, ?)";
    public static final String AJOUT_LIGNE_FACTURE = "INSERT INTO ligne_facture (facture_id, prestation_id, quantite, remise) VALUES (?, ?, ?, ?)";

    public static final String RECUPERATION_CLIENTS = "SELECT id, nom from client";
    public static final String RECUPERATION_CLIENT_PAR_ID = "SELECT id, nom from client WHERE id = ?";

    public static final String RECUPERATION_FACTURES = "SELECT id, date_creation, date_echeance, client_id from facture";
    public static final String RECUPERATION_FACTURE_PAR_ID = "SELECT id, date_creation, date_echeance, client_id from facture WHERE id = ?";
    public static final String RECUPERATION_FACTURES_PAR_CLIENT = "SELECT id, date_creation, date_echeance, client_id from facture WHERE client_id=? ORDER BY id";

    public static final String RECUPERATION_PRESTATIONS = "SELECT id, nom, montant from prestation";
    public static final String RECUPERATION_PRESTATION_PAR_ID = "SELECT id, nom, montant from prestation WHERE id=?";

    public static final String RECUPERATION_LIGNES_FACTURES_PAR_FACTURE = "SELECT id, facture_id, prestation_id, quantite, remise FROM ligne_facture WHERE facture_id=?";

    public static final String UPDATE_CLIENT = "UPDATE client SET nom=? WHERE id=?";

    public static final String DELETE_CLIENT = "DELETE from client WHERE id=?";
    public static final String DELETE_FACTURE = "DELETE from facture WHERE id=?";
}
