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
        System.out.println(createtable(3));

        ////------------ zadanie II/2 /////////////////
        System.out.println("Zadanie II/2");
        int[] tablica_pierwsza=createtable(10);
        int[] tablica_druga= new int[10];
        for (int i = 0; i < 10; i++) {
            tablica_druga[i]=tablica_pierwsza[9-i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(tablica_druga[i]+ " ");
        }
        System.out.println();

        ////------------ zadanie II/3 /////////////////
        System.out.println("Zadanie II/3");
        int n = 99;
        boolean pierwsza=SprawdzCzyLiczbapierwsza(n);
        System.out.println("Liczba pierwsza: "+pierwsza);

        ////------------ zadanie II/4 /////////////////
        System.out.println("Zadanie II/4");
        TabliczkaMnozenia();

        ////------------ zadanie II/5 /////////////////
        System.out.println("Zadanie II/5");
        RysujChoinke(10);
    }

    private static void RysujChoinke(int n) {
        int pom=n;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 2*n; i++) {
                if (i<=pom+j && i>=pom-j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static void TabliczkaMnozenia() {
        int wynik=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                wynik=i*j;
                System.out.print(j+"x"+i+"="+wynik+" ");
                if (wynik/10==0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static boolean SprawdzCzyLiczbapierwsza(int n) {
        for (int i = 2; i < n-1; i++) {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
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

    public static int[] createtable(int wielkosc_tablicy)
    {
        int tab[]= new int[wielkosc_tablicy];
        Random r=new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i]= r.nextInt(100);

        }

        String wartoscitablicy="Wartosci tablicy: ";

        for (int i = 0; i < tab.length; i++) {
            wartoscitablicy+=tab[i]+" ";
        }

        System.out.println(wartoscitablicy);
        return tab;
    }
   // public static String Create2tables()
    //{
       // int[] tab1 = new int[10];
      //  int[] tab2 = new int[10];

    //}
}
