package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Fakultet {
    ArrayList<UgovorZaProfesora>profesori;
    ArrayList<UgovorZaStudenta> studenti;
    ArrayList<CiklusStudija> ciklusiStudija;
    public Fakultet() {
    }
    public void dodajCiklusStudija( CiklusStudija ciklusStudija){
        ciklusiStudija.add(ciklusStudija);
    }


}
