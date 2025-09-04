package Gestion_des_notes;

import java.time.Instant;
import java.util.List;

public class Etudiants {
    private Integer id;
    private String nom;
    private String prenom;
    private Instant dateDeNaissance;
    private String email;
    private String telephone;
    private String groupe;
    private Tuteurs tuteur;
    private List<Notes> historiqueNotes;

    public Etudiants(Integer id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, String groupe, Tuteurs tuteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.telephone = telephone;
        this.groupe = groupe;
        this.tuteur = tuteur;
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

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public Tuteurs getTuteur() {
        return tuteur;
    }

    public void setTuteur(Tuteurs tuteur) {
        this.tuteur = tuteur;
    }

    public List<Notes> getHistoriqueNotes() {
        return historiqueNotes;
    }

    public void setHistoriqueNotes(List<Notes> historiqueNotes) {
        this.historiqueNotes = historiqueNotes;
    }

    @Override
    public String toString() {
        return "Etudiants{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", groupe='" + groupe + '\'' +
                ", tuteur=" + tuteur +
                '}';
    }
}
