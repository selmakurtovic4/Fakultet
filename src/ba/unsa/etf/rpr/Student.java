package ba.unsa.etf.rpr;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return  Objects.equals(indeks, student.indeks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, indeks);
    }
}
