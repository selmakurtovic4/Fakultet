package ba.unsa.etf.rpr;

public class Profesor {
    private String ime;
    private String prezime;


    public Profesor(String ime, String prezime, Integer norma) {
        this.ime = ime;
        this.prezime = prezime;

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }



}
