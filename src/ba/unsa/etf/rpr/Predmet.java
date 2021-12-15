package ba.unsa.etf.rpr;

import java.util.Objects;

public class Predmet {
    private final Integer sifraPredmeta;
    private final String naziv;
    private final Integer bodovi;
    private final  Integer brojCasova;


    public Predmet(Integer sifraPredmeta, String naziv, Integer bodovi, Integer brojCasova) {
        this.sifraPredmeta = sifraPredmeta;
        this.naziv = naziv;
        this.bodovi = bodovi;
        this.brojCasova=brojCasova;
    }


    public Integer getBodovi() {
        return bodovi;
    }


    public Integer getBrojCasova() {
        return brojCasova;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predmet predmet = (Predmet) o;
        return Objects.equals(sifraPredmeta, predmet.sifraPredmeta) && Objects.equals(naziv, predmet.naziv)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sifraPredmeta, naziv, bodovi, brojCasova);
    }

    @Override
    public String toString() {
        return sifraPredmeta +" "+ naziv + " "+bodovi+" ESCT "+"brojCasova: "+brojCasova;

    }
}
