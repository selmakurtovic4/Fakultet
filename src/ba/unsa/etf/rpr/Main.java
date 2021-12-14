package ba.unsa.etf.rpr;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Fakultet ElektrotehnickiFakultet=new Fakultet();
        setUp(ElektrotehnickiFakultet);






    }

    private static void setUp(Fakultet elektrotehnickiFakultet) {
        //pravimo semestre
        Semestar  prviSemestar=new Semestar(1);
        //  ArrayList<Predmet> predmeti=new ArrayList<>();
        prviSemestar.dodajObavezniPredmet(new Predmet(1,"Calculus 1",6,75));
        prviSemestar.dodajObavezniPredmet(new Predmet(2,"Fizika",6,60));
        prviSemestar.dodajObavezniPredmet(new Predmet(3,"Linearna Algebra",6,60));
        prviSemestar.dodajObavezniPredmet(new Predmet(4,"Uvod u programiranje",7,85));
        prviSemestar.dodajObavezniPredmet(new Predmet(5,"Engleski jezik",5,50));
        Semestar drugiSemestar=new Semestar(2);
        drugiSemestar.dodajObavezniPredmet(new Predmet(6,"Matematicka logika i teorija izracunljivosti",7,75));
        drugiSemestar.dodajObavezniPredmet(new Predmet(7,"Tehnike programiranja",7,85));
        drugiSemestar.dodajObavezniPredmet(new Predmet(8,"Calculus 2",6,60));
        drugiSemestar.dodajObavezniPredmet(new Predmet(9,"Vjerovatnoca i statistika",5,50));
        drugiSemestar.dodajObavezniPredmet(new Predmet(10,"Operativni sistemi",5,50));
        Semestar treciSemestar= new Semestar(3);
        treciSemestar.dodajObavezniPredmet(new Predmet(11,"Razvoj programskih rjesenja",5,60));
        treciSemestar.dodajObavezniPredmet(new Predmet(12,"Algoritmi i strukture podataka",5,70));
        treciSemestar.dodajObavezniPredmet(new Predmet(13,"Osnove baza podataka",5,60));
        treciSemestar.dodajObavezniPredmet(new Predmet(14,"Diskretna matematika",5,60));
        treciSemestar.dodajObavezniPredmet(new Predmet(15,"Logicki dizajn",5,60));
        treciSemestar.dodajIzborniPredmet(new Predmet(16,"Sistemsko Programiranje",5,50));
        treciSemestar.dodajIzborniPredmet(new Predmet(17,"Numericki Algoritmi",5,50));
        Semestar cetvrtiSemestar=new Semestar(4);
       cetvrtiSemestar.dodajObavezniPredmet(new Predmet(18,"Automati i formalni jezici",5,80));
        cetvrtiSemestar.dodajObavezniPredmet(new Predmet(19,"Objektno orijentisana analiza i dizajn",5,60));
        cetvrtiSemestar.dodajObavezniPredmet(new Predmet(20,"Racunarska arhitektura",5,60));
        cetvrtiSemestar.dodajObavezniPredmet(new Predmet(21,"Osnove racurskih mreza",5,60));
        cetvrtiSemestar.dodajIzborniPredmet(new Predmet(22,"Razvoj mobilnih aplikacija",5,50));
        cetvrtiSemestar.dodajIzborniPredmet(new Predmet(23,"Digitalni signali",5,50));
        cetvrtiSemestar.dodajIzborniPredmet(new Predmet(24,"CAM-CAD Inzinjering",5,50));
        cetvrtiSemestar.dodajIzborniPredmet(new Predmet(25,"Inzenjerska ekonomika",5,50));


    }
}
