package ba.unsa.etf.rpr;

import java.util.ArrayList;


public class CiklusStudija {
    private final Integer sifra;
    private final String naziv;
    private final ArrayList<Semestar> semestri;

    public CiklusStudija(Integer sifra, String naziv) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.semestri = new ArrayList<>();
    }



    public String getNaziv() {
        return naziv;
    }

    public ArrayList<Semestar> getSemestri() {
        return semestri;
    }
    public Semestar dajSemestarPoSifri(int sifra){
        return semestri
                .stream()
                .filter(s->s.getIdSemestra().equals(sifra))
                .findFirst()
                .get();

    }
    public void dodajSemestar(Semestar semestar){
        semestri.add(semestar);
    }
}
