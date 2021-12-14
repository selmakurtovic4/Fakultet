package ba.unsa.etf.rpr;

import java.util.Locale;
import java.util.Objects;

public class Profesor {
    private String ime;
    private String prezime;
  //  private UgovorZaProfesora ugovorZaProfesora;


    public Profesor(String ime, String prezime) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return this.ime.equalsIgnoreCase(profesor.ime) && prezime.equalsIgnoreCase(profesor.prezime)
                && ime.trim().equals(profesor.ime.trim()) && prezime.trim().equals(profesor.prezime.trim());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime);
    }



    /*public UgovorZaProfesora getUgovorZaProfesora() {
        return ugovorZaProfesora;
    }

    public void setUgovorZaProfesora(UgovorZaProfesora ugovorZaProfesora) {
        this.ugovorZaProfesora = ugovorZaProfesora;
    }*/
}
