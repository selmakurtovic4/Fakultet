package ba.unsa.etf.rpr;

public class Predmet {
    Integer sifraPredmeta;
    String naziv;
    Integer bodovi;
    Profesor predmetniNastavnik;

    public Predmet(Integer sifraPredmeta, String naziv, Integer bodovi) {
        this.sifraPredmeta = sifraPredmeta;
        this.naziv = naziv;
        this.bodovi = bodovi;
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

    public Profesor getPredmetniNastavnik() {
        return predmetniNastavnik;
    }

    public void setPredmetniNastavnik(Profesor predmetniNastavnik) {
        this.predmetniNastavnik = predmetniNastavnik;
    }
}