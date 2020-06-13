import java.math.BigDecimal;

public class Product {
    private int id;
    private String nazwa;
    private BigDecimal cena;

    public Product(int id, String nazwa, BigDecimal cena){
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
