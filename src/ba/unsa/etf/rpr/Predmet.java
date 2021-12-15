package ba.unsa.etf.rpr;

import java.util.Objects;

public class Predmet {
    private Integer sifraPredmeta;
    private String naziv;
    private Integer bodovi;
    private final  Integer brojCasova;


    public Predmet(Integer sifraPredmeta, String naziv, Integer bodovi, Integer brojCasova) {
        this.sifraPredmeta = sifraPredmeta;
        this.naziv = naziv;
        this.bodovi = bodovi;
        this.brojCasova=brojCasova;
    }


    public Integer getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(Integer sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getBodovi() {
        return bodovi;
    }

    public void setBodovi(Integer bodovi) {
        this.bodovi = bodovi;
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
