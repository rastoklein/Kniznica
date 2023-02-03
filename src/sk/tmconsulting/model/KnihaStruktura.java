package sk.tmconsulting.model;


//trieda model je zvlast v package, pre vytvaranie modelov, ktore budeme tahat do hlavnej triedy Kniznica

public class KnihaStruktura {
    //zadefinujeme premenne triedy, cize fields

    private String nazov;
    private String menoAutora;
    private int rokVydania;

    //nasledne vytvorim getter+setter, METODY  (cez prave tlacitko - Generate)



    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getMenoAutora() {
        return menoAutora;
    }

    public void setMenoAutora(String menoAutora) {
        this.menoAutora = menoAutora;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }



}
