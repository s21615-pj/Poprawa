import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private List<Product> kupioneProdukty;

    public Customer(int id){
        this.id = id;
        kupioneProdukty = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public List<Product> getKupioneProdukty() {
        return kupioneProdukty;
    }
}
