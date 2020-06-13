import java.util.ArrayList;
import java.util.List;

public class Shop {
    private int id;
    private String nazwa;
    private List<Product> dostepneProdukty;
    private List<Product> sprzedaneProdukty;

    public Shop(int id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
        this.dostepneProdukty = new ArrayList();
        this.sprzedaneProdukty = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public List<Product> getDostepneProdukty() {
        return dostepneProdukty;
    }

    public List<Product> getSprzedaneProdukty() {
        return sprzedaneProdukty;
    }
}
