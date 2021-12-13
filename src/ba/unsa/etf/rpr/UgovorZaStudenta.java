package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class UgovorZaStudenta {
    private Student student;
    private  CiklusStudija ciklusStudija;
    private ArrayList<Predmet> izborniPredmeti;
    private Integer sifraSemestra;
   public boolean provjera(Predmet predmet){
       if(izborniPredmeti.stream()
               .reduce(0, (a,b)->a+ b.getBrojCasovaMjesecno(), Integer::sum)+predmet.getBrojCasovaMjesecno()<30)
           return true;
       return false;
   }
    public void dodajIzborniPredmet(Predmet predmet){
       if(provjera(predmet))
           izborniPredmeti.add(predmet);
       else
           throw new IllegalArgumentException("Suma je veca od 30! Izaberite drugi predmet!");

    }
    public UgovorZaStudenta(Student student) {
        this.student = student;
    }
    public void izbaciPredmet(Predmet predmet){
       izborniPredmeti.remove(predmet);
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

    public Semestar dajSemestar(){
        return ciklusStudija.semestri.stream().filter(s->s.getIdSemestra().equals(sifraSemestra) ).findFirst().get();
    }

    public void setSifraSemestra(Integer sifraSemestra) {
        this.sifraSemestra = sifraSemestra;
    }
}
