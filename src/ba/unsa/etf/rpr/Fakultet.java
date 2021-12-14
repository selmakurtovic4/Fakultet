package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Fakultet {
    private ArrayList<UgovorZaProfesora>ugovoriZaProfesore;
    private ArrayList<UgovorZaStudenta> ugovoriZaStudente;
    private ArrayList<CiklusStudija> ciklusiStudija;
    private ArrayList<Student> studenti;
    private ArrayList<Profesor>profesori;
    public Fakultet() {
    }
    public void zaposliProfesora(Profesor profesor, ArrayList<Predmet> predmeti){
        UgovorZaProfesora ugovor=new UgovorZaProfesora(profesor, this);
        ugovor.setPredmeti(predmeti);

    }
    public void dodajNoviPredmetProfesoru(Profesor profesor, Predmet predmet){
        ugovoriZaProfesore.stream().filter(ugovorZaProfesora -> ugovorZaProfesora.getProfesor().equals(profesor))
                .findFirst().get().dodajPredmet(predmet);
    }
    public void otpustiProfesora(Profesor profesor){
        ugovoriZaProfesore.stream()
                .filter(ugovor->ugovor.getProfesor().equals(profesor))
                .findFirst()
                .ifPresent(ugovor->ugovoriZaProfesore.remove(ugovor));
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



    public ArrayList<UgovorZaProfesora> getUgovoriZaProfesore() {
        return ugovoriZaProfesore;
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
}
