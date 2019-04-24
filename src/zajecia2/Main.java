package zajecia2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ////------------zadanie 1 /////////////////
        int dzien_tygodnia = 2;
        System.out.println("Jest: " + DzienTygodnia(dzien_tygodnia));

        ////------------zadanie 2 /////////////////
        String miesiac = "KWIECIEN";
        System.out.println("Jest: " + PoraRoku(miesiac));

        ////------------ zadanie 3 /////////////////
        double liczba1=0.34;
        double liczba2 = 0.00;
        char znak='/';

        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbe 1: ");
        liczba1=sc.nextDouble();
        System.out.println("Podaj liczbe 2: ");
        liczba2=sc.nextDouble();

        while (liczba2==0)
        {
            System.out.println("Podaj jeszcze raz liczbe 2: ");
            liczba2=sc.nextDouble();

        }
        System.out.println("Podaj znak dzialania: ");

        znak=sc.next().charAt(0);

        System.out.println("Wynik dzialania "+znak+ " : "+ProstyKalkulator(liczba1, liczba2, znak));

        ////------------ zadanie II/1 /////////////////
        System.out.println(createtable());
        ////------------ zadanie II/2 /////////////////

    }

    public static String DzienTygodnia(int number) {
        String wynik = "";
        switch (number) {
            case 1:
                wynik = "Poniedzialek";
                break;
            case 2:
                wynik = "Wtorek";
                break;
            case 3:
                wynik = "Sroda";
                break;
            case 4:
                wynik = "Czwartek";
                break;
            case 5:
                wynik = "Piatek";
                break;
            case 6:
                wynik = "Sobota";
                break;
            case 7:
                wynik = "Niedziela";
                break;
            default:
                wynik = "Niepoprawny dzien tygodnia";

        }
        return wynik;


    }

    public static String PoraRoku(String miesiac) {
        String wynik = "";
        switch (miesiac) {
            case "GRUDZIEN":
            case "STYCZEN":
            case "LUTY":
                wynik = "Jest zima";
                break;
            case "MARZEC":
            case "KWIECIEN":
            case "MAJ":
                wynik = "Jest wiosna";
                break;
            case "CZERWIEC":
            case "LIPIEC":
            case "SIERPIEN":
                wynik = "Jest lato";
                break;
            case "WRZESIEN":
            case "PAZDZEIERNIK":
            case "LISTOPAD":
                wynik = "Jest jesien";
                break;
            default:
                wynik = "Nie znam takiego miesiaca";


        }
        return miesiac;


    }

    public static double ProstyKalkulator(double liczba1, double liczba2, char znakdzialania)
    {
        double wynik =0;
        switch (znakdzialania) {
            case '+':
                wynik=liczba1+liczba2;
                break;
            case '-':
                wynik=liczba1-liczba2;
                break;
            case '/':
                wynik=liczba1/liczba2;
                break;
            case '*':
                wynik=liczba1*liczba2;
                break;

        }

        return wynik;

    }

    public static String createtable()
    {
        int tab[]= new int[3];
        Random r=new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i]= r.nextInt(100);

        }

        String wartoscitablicy="Wartosci tablicy: ";

        for (int i = 0; i < tab.length; i++) {
            wartoscitablicy+=tab[i]+" ";
        }

        return wartoscitablicy;
    }
}
