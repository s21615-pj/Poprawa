import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Shop sklep1 = new Shop(5, "TK MAXX");
        Product p1 = new Product(1,"spodnie", BigDecimal.valueOf(100));
        Product p2 = new Product(2,"koszulka", BigDecimal.valueOf(40));
        Product p3 = new Product(3,"bluza", BigDecimal.valueOf(110));
        Product p4 = new Product(4,"dres", BigDecimal.valueOf(200));
        Product p5 = new Product(5,"koszula", BigDecimal.valueOf(150));
        Product p6 = new Product(6,"krawat", BigDecimal.valueOf(120));

        sklep1.getDostepneProdukty().add(p1);
        sklep1.getDostepneProdukty().add(p2);
        sklep1.getDostepneProdukty().add(p3);
        sklep1.getDostepneProdukty().add(p4);
        sklep1.getDostepneProdukty().add(p5);
        sklep1.getDostepneProdukty().add(p6);

        Customer c1 = new Customer(10);

        boolean wynik1 = Walidator.walidujSklep(sklep1);

        System.out.println(wynik1);

        ShopService service = new ShopService(sklep1);

        System.out.println("Przed sprzedaza");
        System.out.println("Skelp dostepne: " + sklep1.getDostepneProdukty().size());
        System.out.println("Sklep sprzedane: " + sklep1.getSprzedaneProdukty().size());
        System.out.println("Klient kupione: " + c1.getKupioneProdukty().size());

        service.sellProduct(2,c1);
        service.sellProduct(3,c1);
        System.out.println("---- Po sprzedazy");
        System.out.println("Skelp dostepne: " + sklep1.getDostepneProdukty().size());
        System.out.println("Sklep sprzedane: " + sklep1.getSprzedaneProdukty().size());
        System.out.println("Klient kupione: " + c1.getKupioneProdukty().size());
        System.out.println("Przedmioty Klienta: " + c1.getKupioneProdukty());

        service.returnProduct(2, c1);
        System.out.println("---- Po zwrrocie");
        System.out.println("Skelp dostepne: " + sklep1.getDostepneProdukty().size());
        System.out.println("Sklep sprzedane: " + sklep1.getSprzedaneProdukty().size());
        System.out.println("Klient kupione: " + c1.getKupioneProdukty().size());
        System.out.println("Przedmioty skelpu: " + sklep1.getDostepneProdukty());
        System.out.println("Przedmioty Klienta: "+ c1.getKupioneProdukty());

        BigDecimal soldProduct = service.getSoldProductsReport();
        System.out.println("Kwota sprzedazy: "+ soldProduct);

    }
}
