package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar
{
    final Integer idSemestra;
    ArrayList<Predmet> obavezniPredmeti;
    ArrayList<Predmet> izborniPredmeti;

    public Semestar(Integer idSemestra) {
        this.idSemestra = idSemestra;
        obavezniPredmeti=new ArrayList<>();
        izborniPredmeti=new ArrayList<>();
    }

    public Integer getIdSemestra() {
        return idSemestra;
    }

    public ArrayList<Predmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public ArrayList<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }
}
