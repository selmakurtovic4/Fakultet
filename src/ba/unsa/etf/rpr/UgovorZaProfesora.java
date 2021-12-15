package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class UgovorZaProfesora {
    private final Profesor profesor;
    private final ArrayList<Predmet> predmeti;
    private Integer norma;
    private final Fakultet fakultet;

    public UgovorZaProfesora(Profesor profesor, Fakultet fakultet) {
        this.profesor = profesor;
        this.fakultet = fakultet;
        predmeti=new ArrayList<>();
    }

    public void dodajPredmet(Predmet predmet) {
        predmeti.add(predmet);
       norma= izracunajNormu();
    }

    private Integer izracunajNormu() {
        int norma = 0;

        for (var predmet : predmeti)

            if (jeLiPredmetObavezan(predmet) || jeLiPredmetIzborniiZauzet(predmet))
                norma = norma + (predmet.getBrojCasova() );


        return norma;

    }
   private boolean jeLiPredmetObavezan(Predmet predmet){
       return fakultet.getCiklusiStudija().stream()
               .map(CiklusStudija::getSemestri)
               .flatMap(ArrayList<Semestar>::stream)
               .anyMatch(semestar -> semestar.getObavezniPredmeti().contains(predmet));


   }
   private boolean jeLiPredmetIzborniiZauzet(Predmet predmet){
        return fakultet.getUgovoriZaStudente().stream()
                .anyMatch(ugovor -> ugovor.getIzborniPredmeti().contains(predmet));
   }

    public Integer getNorma() {
        norma=izracunajNormu();
        return norma;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    public int dajBrojStudenata(){
        int broj=0;
       for(var predmet: predmeti)
           if (jeLiPredmetObavezan(predmet))
               broj += fakultet.getUgovoriZaStudente()
                       .stream()
                       .filter(ugovor -> ugovor.dajSemestar().getObavezniPredmeti().contains(predmet))
                       .count();
           else if (jeLiPredmetIzborniiZauzet(predmet))
               broj += fakultet.getUgovoriZaStudente()
                       .stream()
                       .filter(ugovor -> ugovor.getIzborniPredmeti().contains(predmet))
                       .count();
       return broj;
    }
    @Override
    public String toString() {
       String ispis= "UgovorZaProfesora:\n" +
                "Ime:" + profesor.getIme() +
                "\nPrezime: "+profesor.getPrezime();
        ispis+= "\nVasi predmeti su: \n" + predmeti.stream().map(Predmet::toString).collect(Collectors.joining("\n")) ;
           ispis+=     "\nnorma:" + norma ;

           return ispis;
    }

}
