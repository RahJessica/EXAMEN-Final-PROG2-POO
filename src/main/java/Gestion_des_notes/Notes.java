package Gestion_des_notes;

import java.time.Instant;

public class Notes {
    private Double noteInitiale;
    private String motifChangementDeNote;
    private Instant dateDebut;

    public Notes(Double noteInitiale, String motifChangementDeNote, Instant dateDebut) {
        this.noteInitiale = noteInitiale;
        this.motifChangementDeNote = motifChangementDeNote;
        this.dateDebut = dateDebut;
    }

    public Double getNoteInitiale() {
        return noteInitiale;
    }

    public void setNoteInitiale(Double noteInitiale) {
        this.noteInitiale = noteInitiale;
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
}
