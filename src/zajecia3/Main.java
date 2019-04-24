package zajecia3;

public class Main {
    public static void main(String[] args) {


        int tab[]=new int[] {5,10,15,20};
        System.out.println(SumaElTablicy(tab));
        int innatablica[]=SumaElTablicy(tab, 10);
        for (int i = 0; i < innatablica.length; i++) {
            System.out.println(innatablica[i]);
        }
        //---------- zadanie 1 ---------------//
        System.out.println("Zadanie 1: ");
        liczbyPodzielnePrzez5lub3();

        // --------- zadanie 2 ---------------//
        int liczba1 = 12;
        int liczba2 = 3;
        System.out.println("Zadanie 2: ");
        Dzielnik(liczba1, liczba2);

        // --------- zadanie 3 ---------------//
        System.out.println("Zadanie 3: ");
        System.out.println(Silnia (0));

        // --------- zadanie 4 ---------------//
        System.out.println("Zadanie 4: ");

        int innatablica2[]=PrzesuwamyTabliceWprawo(tab, 6);
        for (int i = 0; i < innatablica2.length; i++) {
            System.out.println(innatablica2[i]);
        }


    }

    private static int[] PrzesuwamyTabliceWprawo(int[] tab, int przesuniecie) {
        int pom;
        while(przesuniecie>0) {
            int pom1=tab[0];
            int pom2=tab[tab.length-1];
            for (int i = 0; i < tab.length; i++) {
                pom1=tab[i];
                tab[i]=pom2;
                pom2=pom1;
            }
            przesuniecie--;
        }
        return tab;

    }

    public static void Dzielnik(int zmienna1, int zmienna2) {
        int nwsd = 1;
        int pom2 = 1;

        while ((pom2 <= zmienna1) && (pom2 <= zmienna2)){
            if(zmienna2%pom2==0 && zmienna2%pom2==0) {
                nwsd = pom2;

            }
            pom2++;
        }
        System.out.println(nwsd);
    }

    public static int SumaElTablicy(int[] tablica)
    {
        int suma=0;
        for (int i = 0; i < tablica.length; i++) {
            suma+=tablica[i];
        }

        return suma;
    }

    public static int[] SumaElTablicy(int[] tablica, int zwieksz)
    {
        int suma=0;
        for (int i = 0; i < tablica.length; i++) {
            tablica[i]+=zwieksz;
        }

        return tablica;
    }

    public static void liczbyPodzielnePrzez5lub3()
    {
        for (int i = 1; i < 100; i++) {
            if (i%3 ==0 || i%5==0) {
                System.out.println(i);
            }
        }

    }

    public static int Silnia(int n)
    {
        if (n>1) {
            return (Silnia(n-1)*n);
        }
        else {
            return 1;
        }

    }

}
