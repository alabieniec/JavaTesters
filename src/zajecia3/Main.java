package zajecia3;

public class Main {
    public static void main(String[] args) {

        int liczba1 = 12;
        int liczba2 = 3;
        Mianownik(liczba1, liczba2);
        int tab[]=new int[] {5,10,15,20};
        System.out.println(SumaElTablicy(tab));
        int innatablica[]=SumaElTablicy(tab, 10);
        for (int i = 0; i < innatablica.length; i++) {
            System.out.println(innatablica[i]);
        }
    }

    public static void Mianownik(int zmienna1, int zmienna2) {
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

}
