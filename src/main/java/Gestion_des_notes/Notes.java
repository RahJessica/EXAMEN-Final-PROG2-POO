package Gestion_des_notes;

import java.time.Instant;

public class Notes {
    private Double note;
    private String motifChangementDeNote;
    private Instant dateDebut;
    private Cours cours;
    private Examen examen;

    // 2 constructeurs pour soit : note lié à un cours soit une note liée à un examen (polymorphisme)
    public Notes(Double note, String motifChangementDeNote, Instant dateDebut, Cours cours) {
        this.note = note;
        this.motifChangementDeNote = motifChangementDeNote;
        this.dateDebut = dateDebut;
    }

    public Notes(Double note, String motifChangementDeNote, Instant dateDebut, Examen examen) {
        this.note = note;
        this.motifChangementDeNote = motifChangementDeNote;
        this.dateDebut = dateDebut;
        this.examen = examen;
    }

    public Double getNoteInitiale() {
        return note;
    }

    public void setNoteInitiale(Double noteInitiale) {
        this.note = note;
    }

    public String getMotifChangementDeNote() {
        return motifChangementDeNote;
    }

    public void setMotifChangementDeNote(String motifChangementDeNote) {
        this.motifChangementDeNote = motifChangementDeNote;
    }

    public Instant getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Instant dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
}
