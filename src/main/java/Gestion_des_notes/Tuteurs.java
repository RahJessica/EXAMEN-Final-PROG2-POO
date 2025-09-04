package Gestion_des_notes;

import java.time.Instant;

public class Tuteurs {
    private Integer id;
    private String nom;
    private String prenom;
    private Instant dateDeNaissance;
    private String email;
    private String telephone;
    private String descriptionLienEtudiant;

    public Tuteurs(Integer id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, String descriptionLienEtudiant) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.telephone = telephone;
        this.descriptionLienEtudiant = descriptionLienEtudiant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Instant getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Instant dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDescriptionLienEtudiant() {
        return descriptionLienEtudiant;
    }

    public void setDescriptionLienEtudiant(String descriptionLienEtudiant) {
        this.descriptionLienEtudiant = descriptionLienEtudiant;
    }

    @Override
    public String toString() {
        return "Tuteurs{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", descriptionLienEtudiant='" + descriptionLienEtudiant + '\'' +
                '}';
    }
}
