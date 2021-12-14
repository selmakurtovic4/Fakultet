package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class UgovorZaStudenta {
    private Student student;
    private  CiklusStudija ciklusStudija;
    private ArrayList<Predmet> izborniPredmeti=new ArrayList<>();
    private Integer sifraSemestra;
   public Integer dajSumuBodova(){
       return izborniPredmeti.stream().reduce(0, (a,b)->a+ b.getBodovi(), Integer::sum);

   }
    public void dodajIzborniPredmet(Predmet predmet){
       Integer suma=dajSumuBodova()+predmet.getBodovi();
       if(suma>30) {
           throw new IllegalArgumentException("Suma je veca od 30! Izaberite drugi predmet!");
       }
       else if(suma==30)
           System.out.println("Imate tacno 30 bodova!");
       izborniPredmeti.add(predmet);


    }
    public UgovorZaStudenta(Student student) {
        this.student = student;
    }
    public UgovorZaStudenta(){

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
        return ciklusStudija.getSemestri().stream().filter(s->s.getIdSemestra().equals(sifraSemestra) ).findFirst().get();
    }

    public void setSifraSemestra(Integer sifraSemestra) {
        this.sifraSemestra = sifraSemestra;
    }
}
