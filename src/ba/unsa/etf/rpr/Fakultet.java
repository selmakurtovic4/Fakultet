package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Fakultet {
    private final ArrayList<UgovorZaProfesora>ugovoriZaProfesore;
    private final ArrayList<UgovorZaStudenta> ugovoriZaStudente;
    private final ArrayList<CiklusStudija> ciklusiStudija;
    private final ArrayList<Student> studenti;
    private ArrayList<Profesor>profesori;
    public Fakultet(){
        ugovoriZaProfesore=new ArrayList<>();
        ugovoriZaStudente=new ArrayList<>();
        ciklusiStudija=new ArrayList<>();
        studenti=new ArrayList<>();
        profesori=new ArrayList<>();
    }
    public void zaposliProfesora(Profesor profesor ){
        UgovorZaProfesora ugovor=new UgovorZaProfesora(profesor, this);
        ugovoriZaProfesore.add(ugovor);
        profesori.add(profesor);

    }
    public void dodajNoviPredmetProfesoru(Profesor profesor, Predmet predmet){
        ugovoriZaProfesore.stream().filter(ugovorZaProfesora -> ugovorZaProfesora.getProfesor().equals(profesor))
                .findFirst().ifPresentOrElse(ugovorZaProfesora -> ugovorZaProfesora.dodajPredmet(predmet),
                        ()->{ throw new IllegalArgumentException("Ne postoji taj profesor!"); }     );
                //.get().dodajPredmet(predmet);
    }
    /*public void otpustiProfesora(Profesor profesor){
        ugovoriZaProfesore.stream()
                .filter(ugovor->ugovor.getProfesor().equals(profesor))
                .findFirst()
                .ifPresent(ugovor->ugovoriZaProfesore.remove(ugovor));
    }*/

    public UgovorZaStudenta upisiStudenta(Student student, CiklusStudija ciklusStudija,int sifraSemestra){
     UgovorZaStudenta ugovor=new UgovorZaStudenta(student);
     ugovor.setCiklusStudija(ciklusStudija);
     ugovor.setSifraSemestra(sifraSemestra);
     studenti.add(student);
     ugovoriZaStudente.add(ugovor);
     return ugovor;
    }
    public void dodajCiklusStudija( CiklusStudija ciklusStudija){
        ciklusiStudija.add(ciklusStudija);
    }
    public ArrayList<Profesor> dajProfesoreBezNorme(){
       return ugovoriZaProfesore.stream()
                .filter(ugovor -> ugovor.getNorma() < 120)
                .map(ugovor -> ugovor.getProfesor())
               .collect(Collectors.toCollection(ArrayList::new));

    }
    public ArrayList<Profesor> dajProfesorePrekoNorme(){
        return ugovoriZaProfesore.stream()
                .filter(ugovor -> ugovor.getNorma() > 150)
                .map(ugovor -> ugovor.getProfesor())
                .collect(Collectors.toCollection(ArrayList::new));

    }
    public void sortirajProfesorePoNormi(){
              profesori=ugovoriZaProfesore.stream()
                      .sorted(Comparator.comparingInt(UgovorZaProfesora::getNorma))
                      .map(ugovorZaProfesora -> ugovorZaProfesora.getProfesor())
                      .collect(Collectors.toCollection(ArrayList::new));

    }





    public ArrayList<UgovorZaStudenta> getUgovoriZaStudente() {
        return ugovoriZaStudente;
    }

    public ArrayList<CiklusStudija> getCiklusiStudija() {
        return ciklusiStudija;
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public ArrayList<Profesor> getProfesori() {
        return profesori;
    }
    public UgovorZaProfesora dajUgovorZaProfesora(Profesor profesor) throws Exception{
        return ugovoriZaProfesore.stream()
                .filter(ugovor->ugovor.getProfesor().equals(profesor)).findFirst()
                .orElseThrow(()->new Exception("Nema tog profesora!"));
        }



}
