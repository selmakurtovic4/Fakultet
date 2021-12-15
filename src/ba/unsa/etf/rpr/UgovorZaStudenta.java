package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UgovorZaStudenta {
    private Student student;
    private  CiklusStudija ciklusStudija;
    private final ArrayList<Predmet> izborniPredmeti=new ArrayList<>();
    private int sifraSemestra;
    HashMap<Integer, Map<Predmet, Integer>> prepisOcjena;
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

    public HashMap<Integer, Map<Predmet, Integer>> dajPrepisOcjena(){
      return prepisOcjena;
    }
    public void dodajOcjenu(Predmet predmet, Integer ocjena) {

       prepisOcjena.put(sifraSemestra, Collections.singletonMap(predmet,ocjena));

    }
    public void setSifraSemestra(Integer sifraSemestra) {
        this.sifraSemestra = sifraSemestra;
    }
}
