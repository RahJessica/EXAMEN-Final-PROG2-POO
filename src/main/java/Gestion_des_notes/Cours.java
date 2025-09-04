package Gestion_des_notes;

public class Cours {
    private Integer id;
    private Label label;
    private Integer credits;
    private Enseignants enseignant;

    public enum Label {
        PROG1, PROG2, PROG3, PROG4, PROG5,
        SYS1, SYS2, SYS3, SYS4,
        WEB1, WEB2, WEB3,
        MGT1, MGT2,
        FRANCAIS;
    }

    public Cours(Integer id, Label label, Integer credits, Enseignants enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Enseignants getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignants enseignant) {
        this.enseignant = enseignant;
    }
}
