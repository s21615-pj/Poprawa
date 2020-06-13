public class Product {
    private int id;
    private String nazwa;
    private Integer cena;

    public Product(int id, String nazwa, Integer cena){
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

    public Integer getCena() {
        return cena;
    }
}
