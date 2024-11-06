package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    static Persoon persoon = new Persoon();



    public static void  main(String[] args) {
        System.out.println("Profiel van: " + persoon.voornaam);
        System.out.println("Voornaam: " + persoon.voornaam);
        System.out.println("Achternaam: " + persoon.achternaam);
        System.out.println("Geboren op: " + persoon.geboortedatum);
        Main m = new Main();


    }
    public void printDays() {
        long days = getDays();
        System.out.println("U bent " + days + " dagen oud");
    }

    public long getDays() {
        LocalDate borndate = LocalDate.of(2006, 9, 22);
        LocalDate curDate = LocalDate.now();

        return ChronoUnit.DAYS.between(borndate, curDate);
    }
    
}