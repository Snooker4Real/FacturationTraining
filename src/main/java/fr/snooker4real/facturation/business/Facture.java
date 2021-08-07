package fr.snooker4real.facturation.business;

import java.util.Date;

public class Facture {
    private Long id;
    private Date dateCreation;
    private Date dateEcheance;
    private Client client;

    public Facture(Client client) {
        this.client = client;
        dateCreation = new Date();
    }

    public Facture(Date dateCreation, Date dateEcheance, Client client) {
        super();
        this.dateCreation = dateCreation;
        this.dateEcheance = dateEcheance;
        this.client = client;
    }

    public Facture(Long id, Date dateCreation, Date dateEcheance, Client client) {
        super();
        this.id = id;
        this.dateCreation = dateCreation;
        this.dateEcheance = dateEcheance;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", dateCreation=" + dateCreation +
                ", dateEcheance=" + dateEcheance +
                ", client=" + client.getNom() +
                '}';
    }
}
