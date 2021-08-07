package fr.snooker4real.facturation.business;

public class Prestation {
    private Long id;
    private String nom;
    private Float montant;

    public Prestation() {
    }

    public Prestation(String nom, Float montant) {
        this.nom = nom;
        this.montant = montant;
    }

    public Prestation(Long id, String nom, Float montant) {
        this(nom, montant);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Prestation{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", montant=" + montant +
                '}';
    }
}
