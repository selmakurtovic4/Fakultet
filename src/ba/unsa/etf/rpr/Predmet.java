package ba.unsa.etf.rpr;

public class Predmet {
    private Integer sifraPredmeta;
    private String naziv;
    private Integer bodovi;
    private Integer brojCasova;


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
}
