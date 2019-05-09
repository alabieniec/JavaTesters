package zajecia4;

public class Ksiazka {
    private String tytuł;
    private String autor;
    private int ilość_stron;
    private int ilość_przeczytanych_stron=0;


    public Ksiazka(String tytuł, String autor, int ilość_stron) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.ilość_stron = ilość_stron;
    }

    public int getIlość_przeczytanych_stron() {
        return ilość_przeczytanych_stron;
    }

    public void CoToZaKsiazka() {
        System.out.println("Ksiazka o tytule " + tytuł);
        System.out.println("Autor: " + autor);
        System.out.println("Ilosc Stron: " + ilość_stron);
    }

       // przyjmującą parametr określający ilość stron do przeczytania
        // (należy sprawdzić czy książka nie została już przeczytana)

        public void Czytaj(int strondoprzeczytania)
        {
            if (ilość_przeczytanych_stron+strondoprzeczytania<ilość_stron) {
                ilość_przeczytanych_stron += strondoprzeczytania;
            }
            else
            {
                ilość_przeczytanych_stron=ilość_stron;

            }
        }
        public boolean CzyPrzeczytana()
        {
            if (ilość_przeczytanych_stron==ilość_stron)
                return true;
            else
                return false;

        }


        // czyPrzeczytana – zwracająca informacje czy dana książka została już przeczytana
    }

