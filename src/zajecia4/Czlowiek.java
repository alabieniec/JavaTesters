package zajecia4;

public class Czlowiek {
    private String imie="";
    private String nazwisko="";

    public Czlowiek(String imie) {
        this.imie = imie;
    }

    public Czlowiek() {
        this.imie="";
        this.nazwisko="";
    }

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void PrzedstawSie()
    {
        System.out.println("Nazywam sie: "+imie+" "+nazwisko);
    }

}
