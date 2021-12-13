package ba.unsa.etf.rpr;

import java.util.ArrayList;


public class CiklusStudija {
    final Integer sifra;
    String naziv;
    ArrayList<Semestar> semestri;

    public CiklusStudija(Integer sifra, String naziv) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.semestri = new ArrayList<>();
    }

    public Integer getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public ArrayList<Semestar> getSemestri() {
        return semestri;
    }
}
