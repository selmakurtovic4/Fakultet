package ba.unsa.etf.rpr;

import java.util.Objects;

public class Student {
    private final String ime;
    private final String prezime;
    private final String indeks;
    public String getIme() {
        return ime;
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
