package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class UgovorZaStudenta {
    Student student;
    CiklusStudija ciklusStudija;
    ArrayList<Predmet> izborniPredmeti;
    Integer sifraSemestra;

    public UgovorZaStudenta(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public CiklusStudija getCiklusStudija() {
        return ciklusStudija;
    }

    public void setCiklusStudija(CiklusStudija ciklusStudija) {
        this.ciklusStudija = ciklusStudija;
    }

    public ArrayList<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public void setIzborniPredmeti(ArrayList<Predmet> izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }

    public Semestar dajSemestar(){
        return ciklusStudija.semestri.stream().filter(s->s.getIdSemestra().equals(sifraSemestra) ).findFirst().get();
    }

    public void setSifraSemestra(Integer sifraSemestra) {
        this.sifraSemestra = sifraSemestra;
    }
}
