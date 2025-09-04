package Gestion_des_notes;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

public class Examen {
    private Integer id;
    private String titre;
    private Cours cours;
    private Instant dateEtHeure;
    private Integer coefficient;

    public Examen(Integer id, String titre, Cours cours, Instant dateEtHeure, Integer coefficient) {
        this.id = id;
        this.titre = titre;
        this.cours = cours;
        this.dateEtHeure = dateEtHeure;
        this.coefficient = coefficient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Instant getDateEtHeure() {
        return dateEtHeure;
    }

    public void setDateEtHeure(Instant dateEtHeure) {
        this.dateEtHeure = dateEtHeure;
    }

    public Integer getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }

    public Double getExamGrade(Examen examen, Etudiants etudiants, Instant t) {
        return etudiants.getHistoriqueNotes()
                .stream()
                .filter(note -> note.getDateDebut() == t)
                .filter(note -> note.getExamen().equals(examen))
                .max(Comparator.comparing(Notes::getDateDebut))
                .map(Notes::getNoteInitiale)
                .get();
    }

    public static void main(String[] args) {

    }
}
