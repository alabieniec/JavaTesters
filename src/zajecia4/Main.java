package zajecia4;

import jdk.nashorn.internal.ir.WhileNode;

public class Main {
    public static void main(String[] args) {
        Czlowiek aga=new Czlowiek("Agnieszka", "Łabieniec");
        aga.PrzedstawSie();

        Ksiazka AniolyiDemony=new Ksiazka("Anioly i demony", "Dan Brown", 200);
        System.out.println("Czytam wlasnie: ");
        AniolyiDemony.CoToZaKsiazka();

        while (!AniolyiDemony.CzyPrzeczytana())
        {
            AniolyiDemony.Czytaj(23);
            System.out.println("Jestem na stronie: "+ AniolyiDemony.getIlość_przeczytanych_stron());

        }
        Samochod audi=new Samochod("Audi A3", "metalic", 1000, 7.5 );
        audi.Tankuj(30);
        System.out.println(audi.ilePaliwawZbiorniku()+ " paliwa w zbiorniku");
        System.out.println(audi.JakiPrzebieg() + " km przebiegu");
        audi.Tankuj(30);
        audi.Jedz(100);
        System.out.println(audi.ilePaliwawZbiorniku()+ " paliwa w zbiorniku");
        System.out.println(audi.JakiPrzebieg() + " km przebiegu");
        audi.Jedz(400);
        System.out.println(audi.ilePaliwawZbiorniku()+ " paliwa w zbiorniku");
        System.out.println(audi.JakiPrzebieg() + " km przebiegu");
        audi.Jedz(200);
        System.out.println(audi.ilePaliwawZbiorniku()+ " paliwa w zbiorniku");
        System.out.println(audi.JakiPrzebieg() + " km przebiegu");
    }
    }
