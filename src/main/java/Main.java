public class Main {
    public static void main(String[] args) {

        Shop sklep1 = new Shop(5, "TK MAXX");
        boolean wynik1 = Walidator.walidujSklep(sklep1);

        System.out.println(wynik1);
    }
}
