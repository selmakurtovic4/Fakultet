package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UgovorZaStudenta {
    private Student student;
    private  CiklusStudija ciklusStudija;
    private final ArrayList<Predmet> izborniPredmeti=new ArrayList<>();
    private int sifraSemestra;
    Map<Predmet, Integer> prepisOcjena=new HashMap<>();
   public Integer dajSumuBodova(){
       int suma=izborniPredmeti.stream().reduce(0, (a,b)->a+ b.getBodovi(), Integer::sum);
       return suma+ ciklusStudija.dajSemestarPoSifri(sifraSemestra).getObavezniPredmeti()
               .stream().
               reduce(0, (a,b) -> a+b.getBodovi(),Integer::sum );
   }
    public void dodajIzborniPredmet(Predmet predmet)throws Exception{
       int suma=dajSumuBodova()+predmet.getBodovi();
       if(suma>30) {
           throw new Exception("Suma je veca od 30! Izaberite drugi predmet!");
       }
       else if(suma==30)
           System.out.println("Imate tacno 30 bodova!");
       izborniPredmeti.add(predmet);

    }



    public Semestar dajSemestar(){
       return ciklusStudija.dajSemestarPoSifri(sifraSemestra);
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

    public String dajPrepisOcjena(){
      return  prepisOcjena.toString();
    }
    public void dodajOcjenu(Integer sifraSemestr,Predmet predmet, Integer ocjena) {

       prepisOcjena.put(predmet,ocjena);

    }
    public void setSifraSemestra(Integer sifraSemestra) {
        this.sifraSemestra = sifraSemestra;
    }

    @Override
    public String toString() {
        return "UgovorZaStudenta:\n" +
                "student: " + student +
                "\nCiklus studija: " + ciklusStudija.getNaziv() +
                "\nSemestar: " + sifraSemestra +
                "\nIzborniPredmeti: "  + izborniPredmeti
                .stream().map(predmet -> predmet.toString())
                .collect(Collectors.joining(","));
    }

}
