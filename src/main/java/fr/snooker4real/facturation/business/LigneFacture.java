package fr.snooker4real.facturation.business;
public class LigneFacture {

    private Long id;
    private float quantite;
    private Float remise;
    private Prestation prestation;
    private Facture facture;

    public LigneFacture(Facture facture, Prestation prestation, float quantite, Float remise) {
        this.prestation = prestation;
        this.facture = facture;
        this.quantite = quantite;
        this.remise = remise;
    }


    public LigneFacture(Long id, Facture facture, Prestation prestation, float quantite, Float remise) {
        this(facture, prestation, quantite, remise);
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public Float getRemise() {
        return remise;
    }

    public void setRemise(Float remise) {
        this.remise = remise;
    }

    public Prestation getPrestation() {
        return prestation;
    }

    public void setPrestation(Prestation prestation) {
        this.prestation = prestation;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    @Override
    public String toString() {
        return "LigneFacture [id=" + id + ", quantite=" + quantite + ", remise=" + remise + ", prestation=" + prestation
                + "]";
    }

}
