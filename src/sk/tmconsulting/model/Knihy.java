package sk.tmconsulting.model;

import java.util.ArrayList;

public class Knihy {

    //METODA
    public ArrayList<KnihaStruktura> naplnKniznicuKnihami() {
        KnihaStruktura kniha1 = new KnihaStruktura(); // vytvorenie prazdnej knihy, cize objektu = instancie
        kniha1.setNazov("Já, robot"); // naplnili sme knihu1 nazvom
        kniha1.setMenoAutora("Isaac Asimov"); // naplninili sme knihu1 autorom
        kniha1.setRokVydania(1965);

        KnihaStruktura kniha2 = new KnihaStruktura(); // vytvorenie prazdnej knihy, cize objektu = instancie
        kniha2.setNazov("Duna"); // naplnili sme knihu1 nazvom
        kniha2.setMenoAutora("Frank P. Herbert"); // naplninili sme knihu1 autorom
        kniha2.setRokVydania(1970);

        //vytvorili sme nove Pole:
        ArrayList<KnihaStruktura> kniznicaPole = new ArrayList<KnihaStruktura>(); // vytvorili sme prazdne dynamicke pole = zoznam kniznice
        kniznicaPole.add(kniha1);  //naplnili sme Pole knihou1
        kniznicaPole.add(kniha2);
        return kniznicaPole;
    }
    //definovanie Metody (vyhladaneKnihy) s premennou
    public ArrayList<KnihaStruktura> vyhladaneKnihy(ArrayList<KnihaStruktura> kniznicaSoVsetkymiKnihami, String hladanyNazov){
        //musime naprogramovat logiku, ako ma vyhladat knihy, cez nove pole
        ArrayList<KnihaStruktura> najdeneKnihy = new ArrayList<KnihaStruktura>();
        for(KnihaStruktura kniha:kniznicaSoVsetkymiKnihami){       //prechadzame kazdou knihou v Arraliste
            if(kniha.getNazov().toLowerCase().contains(hladanyNazov.toLowerCase())){   //a v jej nazve hladame cez prikaz (metodu) contains ci obsahuje slovo v premennej hladany nazov
                najdeneKnihy.add(kniha);
            }
        }
        return najdeneKnihy;

    }

}
