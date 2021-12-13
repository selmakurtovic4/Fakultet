package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Fakultet {
    public ArrayList<Profesor> getProfesori() {
        return profesori;
    }

    public ArrayList<UgovorZaStudenta> getUgovori() {
        return ugovori;
    }

    public ArrayList<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    ArrayList<Profesor> profesori;
    ArrayList<UgovorZaStudenta> ugovori;
    ArrayList<Predmet> izborniPredmeti;

    public Fakultet() {
    }

}
