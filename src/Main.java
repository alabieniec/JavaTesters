import static java.lang.StrictMath.pow;

public class Main {

    public static void main(String[] args) {

        Zadanie1();
        System.out.println("--------------------------------");
        int a1 = 2;
        int b1 = 3;
        Zadanie2(a1, b1);
        System.out.println("--------------------------------");
        double stopniecelcjusza = 10;
        double stopnieF = Zadanie3Farenhajta(stopniecelcjusza);
        System.out.println("Stopnie Farenhajta: " + stopnieF);

        System.out.println("Stopnie celcjusza: " + Zadanie3Celcjusza(stopnieF));
        System.out.println("--------------------------------");
        int wielocyfrowazmienna = 1234567890;
        Zadnie4(wielocyfrowazmienna);
        int zmienna1 = 5;
        int zmienna2 = 3;
        int zmienna3 = 3;
        System.out.println("Max: " + max(zmienna1, zmienna2, zmienna3));
        System.out.println("Min: " + min(zmienna1, zmienna2, zmienna3));
        double waga = 85.3;
        double wzrost = 1.64;
        System.out.println("Przy wadze: " + waga + " i wzroscie: " + wzrost + " : " + BMI(wzrost, waga));


    }

    public static void Zadanie1() {
        System.out.println("1. W ramach testów zadeklaruj po jednej zmiennej typów: boolean, char, int, long, float, dobule, String, oraz wypisz je na konsolę.");

        boolean a = true;
        char b = 'b';
        int c = 100;
        long d = 100000;
        float e = 3.14f;
        double f = 3.14;

        String g = "Agnieszka";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }

    public static void Zadanie2(int a1, int b1) {
        System.out.println("2. Zadeklaruj dwie zmienne liczbowe, oraz wypisz na ekran wyniki kilku podstawowych działań które można na nich wykonać (+, -, *, /, %).");

        System.out.println("liczba1: " + a1);
        System.out.println("liczba2: " + b1);

        int suma = a1 + b1;
        int odejmowanie = a1 - b1;
        int mnozenie = a1 * b1;
        double dzielenie = (double) a1 / b1;
        int modulo = a1 % b1;

        System.out.println("Dodawanie: " + suma);
        System.out.println("Odejmowanie: " + odejmowanie);
        System.out.println("Mnozenie: " + mnozenie);
        System.out.println("Dzielenie: " + dzielenie);
        System.out.println("Modulo: " + modulo);
    }


//Celcjusza to Farenhajta

    public static double Zadanie3Farenhajta(double stopnieC) {

        return (1.8 * stopnieC + 32.0);
    }

    public static double Zadanie3Celcjusza(double stopnieF) {

        return ((stopnieF - 32) / 1.8);
    }

    //wyliczyc sume i srednia cyfr
    private static void Zadnie4(int wielocyfrowazmienna) {

        int suma = 0;
        int cyfra;
        int i = 0;

        while (wielocyfrowazmienna > 0) {
            cyfra = wielocyfrowazmienna % 10;
            suma += cyfra;
            i++;
            wielocyfrowazmienna /= 10;

        }
        System.out.println("Ilosc cyfr: " + i);
        double srednia = (double) suma / i;
        System.out.println("Suma: " + suma);
        System.out.println("srednia: " + srednia);

    }

    private static int max(int zm1, int zm2, int zm3) {
        int wynik = 0;
        if ((zm1 >= zm2) && zm1 >= zm3)
            wynik = zm1;
        else if ((zm2 >= zm1) && (zm2 >= zm3))
            wynik = zm2;
        else
            wynik = zm3;

        return wynik;
    }

    private static int min(int zm1, int zm2, int zm3) {
        int wynik = 0;
        if ((zm1 <= zm2) && zm1 <= zm3)
            wynik = zm1;
        else if ((zm2 <= zm1) && (zm2 <= zm3))
            wynik = zm2;
        else
            wynik = zm3;

        return wynik;
    }

    private static String BMI(double wzrost, double waga) {
        double wsp = waga / pow(wzrost, 2.0);
        String message = "Nie wiem, ale pewnie jestes za gruby";

        if ((wsp >= 18.5) && (wsp <= 24.9)) {
            message = "Waga prawidłowa";
        } else if (wsp < 18.5) {
            message = "Niedowaga";
        }
        return message;
    }
}
