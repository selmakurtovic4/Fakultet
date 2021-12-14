package ba.unsa.etf.rpr;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Fakultet elektrotehnickiFakultet=new Fakultet();
    static UgovorZaProfesora ugovor;
    public static void main(String[] args) {

        setUp();


        for(;;) {
            System.out.println("Dobrodosli! Nalazite se na odsjeku 'Racunarstvo i informatika' u prvom ciklusu! Ostali su u pripremi.\n");
            System.out.println("Izaberite Vasu poziciju unosom odgovarajuceg broja!\n");
            System.out.println("1.Student\n");
            System.out.println("2.Profesor\n");
            System.out.println("3.Studentska sluzba\n");
            System.out.println("4.Dekan\n");
            Scanner unos = new Scanner(System.in);
            String izbor = unos.nextLine();
            if(izbor.equals("1"))
                dajMeniStudenta();
            else if(izbor.equals("2"))
                dajMeniProfesora();
            else if(izbor.equals("3"))
                dajMeniStudentskeSluzbe();
            else if(izbor.equals("4"))
                dajMeniDekana();
            else
                System.out.println("Pogresan Unos. Unesite ponovo!");
        }

    }



    private static void dajMeniProfesora() {
        for (; ; ) {

            System.out.println("Unesite ime");
            Scanner unos = new Scanner(System.in);
            String ime = unos.nextLine();
            System.out.println("Unesite prezime");
            unos = new Scanner(System.in);
            String prezime = unos.nextLine();
            Profesor profesor = new Profesor(ime, prezime);

            try {
                ugovor = elektrotehnickiFakultet.dajUgovorZaProfesora(profesor);
                System.out.println("Zdravo " + ime + "! " + "Izabrite opciju!\n");
                for(;;) {
                    System.out.println("0 Povratak u pocetni meni\n");
                    System.out.println("1.Pregled svih studenata po predmetu\n");
                    System.out.println("2.Pregled mog ugovora\n");
                    System.out.println("3.Pregled moje norme\n");
                    unos = new Scanner(System.in);
                    String izbor = unos.nextLine();

                    if (izbor.equals("0"))
                        return;
                    else if (izbor.equals("2")) {

                        System.out.println(ugovor.toString());
                    } else if (izbor.equals("3")) {
                        System.out.println("Vasa norma iznosi " + ugovor.getNorma());
                    }
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }


        }
    }

    private static void dajMeniDekana() {
        for(;;) {
            System.out.println("Izaberite opciju!");
            System.out.println("1.Pregled svih profesora");
            System.out.println("2.Pregled svih studenata");
            System.out.println("3.Zaposli profesora");
            System.out.println("4.Otpusti profesora");
            System.out.println("5.Dodaj predmet");
            System.out.println("6.Dodaj Semestar");


        }
    }

    private static void dajMeniStudentskeSluzbe() {
    }

    private static void dajMeniStudenta() {
    }


    private static void setUp() {
        //pravimo semestre
        CiklusStudija prviCiklus=new CiklusStudija(1,"Prvi ciklus Racunarstva i informatike");
        elektrotehnickiFakultet.dodajCiklusStudija(prviCiklus);
        Semestar  prviSemestar=new Semestar(1);
        prviSemestar.dodajObavezniPredmet(new Predmet(1,"Calculus 1",6,75));
        prviSemestar.dodajObavezniPredmet(new Predmet(2,"Fizika",6,60));
        prviSemestar.dodajObavezniPredmet(new Predmet(3,"Linearna Algebra",6,60));
        prviSemestar.dodajObavezniPredmet(new Predmet(4,"Uvod u programiranje",7,85));
        prviSemestar.dodajObavezniPredmet(new Predmet(5,"Engleski jezik",5,50));
        prviCiklus.dodajSemestar(prviSemestar);
        Semestar drugiSemestar=new Semestar(2);
        drugiSemestar.dodajObavezniPredmet(new Predmet(6,"Matematicka logika i teorija izracunljivosti",7,75));
        drugiSemestar.dodajObavezniPredmet(new Predmet(7,"Tehnike programiranja",7,85));
        drugiSemestar.dodajObavezniPredmet(new Predmet(8,"Calculus 2",6,60));
        drugiSemestar.dodajObavezniPredmet(new Predmet(9,"Vjerovatnoca i statistika",5,50));
        drugiSemestar.dodajObavezniPredmet(new Predmet(10,"Operativni sistemi",5,50));
        prviCiklus.dodajSemestar(drugiSemestar);
        Semestar treciSemestar= new Semestar(3);
        treciSemestar.dodajObavezniPredmet(new Predmet(11,"Razvoj programskih rjesenja",5,60));
        treciSemestar.dodajObavezniPredmet(new Predmet(12,"Algoritmi i strukture podataka",5,70));
        treciSemestar.dodajObavezniPredmet(new Predmet(13,"Osnove baza podataka",5,60));
        treciSemestar.dodajObavezniPredmet(new Predmet(14,"Diskretna matematika",5,60));
        treciSemestar.dodajObavezniPredmet(new Predmet(15,"Logicki dizajn",5,60));
        treciSemestar.dodajIzborniPredmet(new Predmet(16,"Sistemsko Programiranje",5,50));
        treciSemestar.dodajIzborniPredmet(new Predmet(17,"Numericki Algoritmi",5,50));
        prviCiklus.dodajSemestar(treciSemestar);
        Semestar cetvrtiSemestar=new Semestar(4);
       cetvrtiSemestar.dodajObavezniPredmet(new Predmet(18,"Automati i formalni jezici",5,80));
        cetvrtiSemestar.dodajObavezniPredmet(new Predmet(19,"Objektno orijentisana analiza i dizajn",5,60));
        cetvrtiSemestar.dodajObavezniPredmet(new Predmet(20,"Racunarska arhitektura",5,60));
        cetvrtiSemestar.dodajObavezniPredmet(new Predmet(21,"Osnove racurskih mreza",5,60));
        cetvrtiSemestar.dodajIzborniPredmet(new Predmet(22,"Razvoj mobilnih aplikacija",5,50));
        cetvrtiSemestar.dodajIzborniPredmet(new Predmet(23,"Digitalni signali",5,50));
        cetvrtiSemestar.dodajIzborniPredmet(new Predmet(24,"CAM-CAD Inzinjering",5,50));
        cetvrtiSemestar.dodajIzborniPredmet(new Predmet(25,"Inzenjerska ekonomika",5,50));
        prviCiklus.dodajSemestar(cetvrtiSemestar);
        //dodamo profesore
        Profesor profesor=new Profesor("Vedran","Ljubovic");
        elektrotehnickiFakultet.zaposliProfesora(profesor);
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(11,"Razvoj programskih rjesenja",5,60));
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(4,"Uvod u programiranje",7,85));
        profesor=new Profesor("Naida","Mujic");
        elektrotehnickiFakultet.zaposliProfesora(profesor);
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(1,"Calculus 1",6,75));
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(1,"Calculus 2",6,60) );
        profesor=new Profesor("Zeljko","Juric");
        elektrotehnickiFakultet.zaposliProfesora(profesor);
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(14,"Diskretna matematika",5,60) );
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(7,"Tehnike programiranja",7,85));
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(17,"Numericki Algoritmi",5,50) );
        profesor=new Profesor("Samir","Ribic");
        elektrotehnickiFakultet.zaposliProfesora(profesor);
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(10,"Operativni sistemi",5,50));
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(16,"Sistemsko Programiranje",5,50));
        profesor=new Profesor("Dijana","Dujak");
        elektrotehnickiFakultet.zaposliProfesora(profesor);
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(2,"Fizika",6,60));
        profesor=new Profesor("Haris","Cupic");
        elektrotehnickiFakultet.zaposliProfesora(profesor);
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor, new Predmet(18,"Automati i formalni jezici",5,80));
         elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor, new Predmet(12,"Algoritmi i strukture podataka",5,70));
         profesor= new Profesor("Novica","Nosovic");
        elektrotehnickiFakultet.zaposliProfesora(profesor);
         elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(20,"Racunarska arhitektura",5,60));
        elektrotehnickiFakultet.dodajNoviPredmetProfesoru(profesor,new Predmet(15,"Logicki dizajn",5,60));



    }
}
