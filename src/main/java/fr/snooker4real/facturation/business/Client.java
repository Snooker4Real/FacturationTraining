package fr.snooker4real.facturation.business;

public class Client {
    private Long id;
    private String nom;

    public Client(String nom) {
        this.nom = nom;
    }

    public Client(Long id, String nom) {
        this(nom);
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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
