package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private String indeks;
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

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public Student(String ime, String prezime, String indeks) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return  ime + " " + prezime + " "+ indeks+"\n";
    }
}
