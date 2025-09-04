import Gestion_des_notes.*;
import org.junit.jupiter.api.BeforeEach;

import java.time.Instant;

public class TestExamGrade {
    private Etudiants jessica;
    private Enseignants Toky;
    private Tuteurs tuteurJessica;
    private Notes noteJessica;
    private Examen examenJessica;
    private Cours prog2;

    @BeforeEach
    void setUp(){
        tuteurJessica = new Tuteurs(1, "Marie", "Ginette", Instant.parse("1997-06-26T12:00:00.20Z"), "gin@gmil.com", "0330945695", "Lien maternel");
        prog2 = new Cours(1, Cours.Label.PROG2, 200, Toky);
        examenJessica = new Examen(1, "Examen Final PROG2 POO", prog2, Instant.parse("2006-06-26T15:00:00.20Z"), 2);
        noteJessica = new Notes(14.0, "Points mal calcules", Instant.parse("2025-08-12T12:00:00.20Z"), examenJessica);
        jessica = new Etudiants(1, "Kantotiana", "Jessica", Instant.parse("2006-06-26T15:00:00.20Z"), "jess@gmail.com", "0337066830", "K1", tuteurJessica);
    }
}
