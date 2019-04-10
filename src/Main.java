public class Main {

    public static void main(String[] args) {
        System.out.println("1. W ramach testów zadeklaruj po jednej zmiennej typów: boolean, char, int, long, float, dobule, String, oraz wypisz je na konsolę.");

        boolean a=true;
        char b='b';
        int c=100;
        long d=100000;
        float e=3.14f;
        double f=3.14;

        String g = "Agnieszka";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        System.out.println("2. Zadeklaruj dwie zmienne liczbowe, oraz wypisz na ekran wyniki kilku podstawowych działań które można na nich wykonać (+, -, *, /, %).");
        int a1=2;
        int b1=3;
        System.out.println("liczba1: "+a1);
        System.out.println("liczba2: "+b1);

        int suma=a1+b1;
        int odejmowanie=a1-b1;
        int mnozenie=a1*b1;
        double dzielenie= (double) a1/b1;
        int modulo=a1%b1;

        System.out.println("Dodawanie: "+ suma);
        System.out.println("Odejmowanie: "+odejmowanie);
        System.out.println("Mnozenie: "+mnozenie);
        System.out.println("Dzielenie: "+dzielenie);
        System.out.println("Modulo: "+modulo);
    }

//    public static int main(String[] args)
//    {
//        return 15;
//    }
}
