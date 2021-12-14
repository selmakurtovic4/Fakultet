package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UgovorZaProfesora {
    private Profesor profesor;
    private ArrayList<Predmet> predmeti;
    private Integer norma;
    private Fakultet fakultet;

    public UgovorZaProfesora(Profesor profesor, Fakultet fakultet) {
        this.profesor = profesor;
        this.fakultet = fakultet;
    }

    public void dodajPredmet(Predmet predmet) {
        predmeti.add(predmet);
        izracunajNormu();
    }

    public Integer izracunajNormu() {
        int norma = 0;

        for (var predmet : predmeti)

            if (jeLiPredmetObavezan(predmet) || jeLiPredmetIzborniiZauzet(predmet))
                norma = norma + (predmet.getBrojCasovaMjesecno() * 12);


        return norma;

    }
   private boolean jeLiPredmetObavezan(Predmet predmet){
       return fakultet.ciklusiStudija.stream()
               .map(ciklusStudija -> ciklusStudija.getSemestri())
               .flatMap(ArrayList<Semestar>::stream)
               .anyMatch(semestar -> semestar.getObavezniPredmeti().contains(predmet));


   }
   private boolean jeLiPredmetIzborniiZauzet(Predmet predmet){
        return fakultet.studenti.stream()
                .anyMatch(ugovor -> ugovor.getIzborniPredmeti().contains(predmet));
   }

    public Integer getNorma() {
        return norma;
    }
}
