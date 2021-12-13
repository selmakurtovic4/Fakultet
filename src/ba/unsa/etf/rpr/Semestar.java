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
    public void dodajObavezniPredmet(Predmet predmet){
        obavezniPredmeti.stream()
                .filter(p->p.equals(predmet))
                .findFirst()
                .ifPresentOrElse( p->{ throw  new IllegalArgumentException("Taj predmet je vec prisutan!"); },
                        ()->obavezniPredmeti.add(predmet));
    }
    public void dodajIzborniPredmet(Predmet predmet){
        izborniPredmeti.stream()
                .filter(p->p.equals(predmet))
                .findFirst()
                .ifPresentOrElse( p->{ throw  new IllegalArgumentException("Taj predmet je vec prisutan!"); },
                        ()->izborniPredmeti.add(predmet));
    }


}
