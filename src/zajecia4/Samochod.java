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
    private double spalanie_paliwa;

    public Samochod(String marka, String color, int przebieg, double spalanie_paliwa) {
        this.marka = marka;
        this.color = color;
        this.przebieg = przebieg;
        this.spalanie_paliwa = spalanie_paliwa;
    }

    public void CotoZaAuto()
    {
        System.out.println("Marka: "+this.marka);
        System.out.println("Kolor: "+color);

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
       /*if ((7.5/100*ilosc_km)<=ile_paliwa)
           przebieg+=ilosc_km;
       else*/

    }


}
