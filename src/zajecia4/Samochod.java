package zajecia4;

public class Samochod {

    //coToZaAuto – wypisze na konsole marke i kolor samochodu
    // b. ilePaliwa – wypisze ilość paliwa w zbiorniku
    // c. jakiPrzebieg – wypisze przebieg samochodu
    // d. jedż – powoduje ‘przejechanie’ zadanej ilości kilometrów, spalając przy tym paliwo (należy przewidzieć opcję skończenia się paliwa)
    // e. tankuj – ‘dolewa’ zadaną ilość paliwa (należy przewidzieć opcję pełnego zbiornika)

    private String marka;
    private String color;
    private int przebieg;
    private double ile_paliwa=0;
    private double spalanie_paliwa=7.5;
    private double zbiornik_paliwa=50.0;

    public Samochod(String marka, String color, int przebieg, double spalanie_paliwa) {
        this.marka = marka;
        this.color = color;
        this.przebieg = przebieg;
        this.spalanie_paliwa = spalanie_paliwa;
    }

    public void CotoZaAuto()
    {
        System.out.println("Marka: "+this.marka);
        System.out.println("Kolor: "+this.color);

    }
    public double ilePaliwawZbiorniku()
    {
        return ile_paliwa;
    }
    public int JakiPrzebieg()
    {
        return przebieg;
    }
    public void Jedz(double ilosc_km)
    {
        //7.5 l/100 km
        //sprawdzamy czy starczy paliwa
        double spalanie=7.5/100;
        if (spalanie*ilosc_km<=ile_paliwa) {
            przebieg += ilosc_km;
            ile_paliwa -= (spalanie * ilosc_km);
        }
        else
        {
            System.out.println("Koniec paliwa!!!");
            przebieg+=(ile_paliwa/spalanie);
            ile_paliwa=0;
        }


    }
    public void Tankuj(double ilosc_l)
    {


        if (ile_paliwa+ilosc_l<=zbiornik_paliwa)
            ile_paliwa+=ilosc_l;
        else
        {
            System.out.println("Pelny zbiornik!!!");
            ile_paliwa=zbiornik_paliwa;
        }


    }

}
