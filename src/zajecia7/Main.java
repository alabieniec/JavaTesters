package zajecia7;

import zajecia4.Samochod;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Zadanie1();
        Zadanie2();
        Zadanie3();
        Zadanie4();
        Zadanie5();
        Zadanie6();


    }

    public static void Zadanie1() {
        List<String> lista =new LinkedList<String>();

        lista.add("Pierwszy element listy");
        lista.add("Drugi element listy");
        lista.add("Trzeci element listy");

        System.out.println(lista);

    }
    public static void Zadanie2() {
        Set<Long> lista = new HashSet<Long>();
        lista.add(1000l);
        lista.add(2000l);
        lista.add(3000l);

        System.out.println(lista);

    }
    public static void Zadanie3()
    {
        Map<String, Long> lista=new HashMap<>();
        lista.put("I", 31000l);
        lista.put("II", 28000l);
        lista.put("III", 31000l);

        System.out.println(lista);
    }
    public static  void Zadanie4()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj 5 Stringow: ");

        String wart;
        Set<String> lista=new HashSet<String>();
        for (int i = 0; i < 5; i++) {
            wart=sc.nextLine();
            lista.add(wart);
        }
        System.out.println(lista);

    }
    public static void Zadanie5()
    {
        //stworz slownik
        Map<String, String> slownik=new HashMap<>();
        slownik.put("go", "iść");
        slownik.put("have", "musieć");
        slownik.put("take", "brać");
        slownik.put("give", "dawać");

        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj slowko ang i wcisnij enter");
        //for (Map.Entry<String, String> entry: slownik.entrySet()) {
        String ang;
        String pol;
        do {
            ang=sc.nextLine();
            pol=slownik.get(ang);
            System.out.println(pol);
        }while (pol!=null);





    }

    public static void Zadanie6()
    {
        //utworz liste przechowujaca samochody
        Set<Samochod> komis =new HashSet<>();
        komis.add(new Samochod("Audi A3", "czerwony", 1200, 7.5));
        komis.add(new Samochod("BMW", "niebieski", 8000, 9.0));
        komis.add(new Samochod("BMW", "niebieski", 20000, 9.0));
        //System.out.println(komis);
        for (Samochod komi : komis) {
            komi.CotoZaAuto();
        }

    }
}
