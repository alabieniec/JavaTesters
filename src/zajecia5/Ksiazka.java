package zajecia5;

import zajecia4.Czlowiek;

public class Ksiazka {
    private String tytuł;
    private String nazwa;
    private Rodzaj rodzaj;
    private Czlowiek autor;


    public Ksiazka(String tytuł, String nazwa, Rodzaj rodzaj, Czlowiek autor) {
        this.tytuł = tytuł;
        this.nazwa = nazwa;
        rodzaj=new Rodzaj();
        autor=new Czlowiek();

    }

}
