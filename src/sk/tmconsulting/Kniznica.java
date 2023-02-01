package sk.tmconsulting;

import sk.tmconsulting.model.Kniha;
import sk.tmconsulting.model.Knihy;

import java.util.ArrayList;
import java.util.Scanner;

/*

Vytvorte knižnicu (Library), kde bude môcť používateľ zadať knihy (nazov, autora, počet strán, rok vydania, cena) cez konzolu
kým nezadá slovo koniec. Opakovanie na ArrayList.

Aplikacia po spusteni zobrazi menu s možnosťami:
(1) Zadaj novú knihu *
(2) Zobraz všetky knihy *
(3) Zobraz konkrétnu knihu (podľa názvu knihy) *
(4) Zadaj index knihy, ktorú zobrazujeme
(5) Zobraz názov poslednej knihy
(6) Zobraz názov prvej knihy
(7) Zobraz počet všetkých kníh
(8) Vymaž konkrétnu knihu (podľa indexu)
(9) Zadaj index knihy, ktorú odstraňujeme
(10) Vymaž všetky knihy
Koniec = skončí zadávanie novej knihy

Aplikacia caka zadanie konkretnej moznosti a nasledne reaguje.

*/
//cez model - vytvoreneho v samostatnej Triede (Kniha)
public class Kniznica {
    // vytvorili sme metodu naplnTestovacimiUdajmi


    public static void main(String[] args) {
        //naplnTestovacimiUdajmi(); // zavolame metodu naplnTestovacimiUdajmi, ktora naplni kniznicu testovacimi udajmi a vypise jej zoznam

        // TODO 1.krok: Zobraz menu s polozkou (1) Zadaj novú knihu *  (2) Zobraz všetky knihy   (3) Zobraz konkrétnu knihu (podľa názvu knihy) *

        Knihy testovacieKnihy = new Knihy();
       //naplnili sme Arralist testovacimi knihami
        ArrayList<Kniha> kniznica = testovacieKnihy.naplnKniznicuKnihami();

        //ArrayList<Kniha> kniznica = new ArrayList<Kniha>();

        while (true){
        System.out.println("Vyber si z menu:");
        System.out.println("(1) Zadaj novu knihu");
        System.out.println("(2) Zobraz všetky knihy");
        System.out.println("(3) Zobraz konkrétnu knihu (podľa názvu) ");
            System.out.println("(9) Koniec");

        Scanner scn = new Scanner(System.in); // inicializacia "konzoly" a vstupu (pisania)
        int cisloMenu = scn.nextInt(); // do premennej cisloMenu vlozime z "konzoly" cislo, ktore zada pouzivatel

        if (cisloMenu == 1) {
            Scanner scn1 = new Scanner(System.in); // vytvarame pre istotu novy scanner, aby sme mohli ziskat udaje z "konzolu" = Run dialog
            System.out.println("Stlačil si čislo 1");
            // Aplikacia by mala vypisat, resp. sa opytat na zadanie: Zadaj nazov knihy, potom Zadaj autora knihy a nasledne Zadaj rok vydania
            System.out.println("Zadaj názov knihy");
            String nazov = scn1.nextLine(); // nextLine je pre String, teda text
            System.out.println("Zadaj meno autora");
            String menoAutora = scn1.nextLine();
            System.out.println("Zadaj rok vydania");
            int rokVydania = scn1.nextInt();

        Kniha kniha = new Kniha ();    //vytvorili sme prazdnu knihu, objekt triedy Kniha
        kniha.setNazov(nazov);   //naplname prazdnu knihu nazvom
        kniha.setMenoAutora(menoAutora); //naplname prazdnu knihu nazvom
        kniha.setRokVydania(rokVydania); //naplname prazdnu knihu rokom

        kniznica.add(kniha);   //do kolekcie knih vlozime naplnenu knihu

        // ak je cisloMenu = 1 tak tu nieco urobime
        } else if (cisloMenu == 2) {
            System.out.println("Stlačil si číslo 2");
            for (Kniha vystup:kniznica){
                System.out.println("Nazov knihy: " + vystup.getNazov());
                System.out.println("Meno Autora: " + vystup.getMenoAutora());
                System.out.println("Rok vydania: " + vystup.getRokVydania());
            }
            // ak je cisloMenu = 2 tak tiez tu nieco urobime
        } else if (cisloMenu == 3) {
            System.out.println("Stlačil si číslo 3");
            // ak je cisloMenu = 3 tak tiez tu nieco urobime
        } else if (cisloMenu == 9) {
            break;   //ukoncime cyklus ak pouzivatel zada cislo 9

        }

        }

    }
    }
