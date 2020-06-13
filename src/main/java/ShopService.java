import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class ShopService {
    private Shop sklep;

    public ShopService(Shop sklep){
        this.sklep = sklep;
    }

    private Optional<Product>findProductInShop(int productId){
        List<Product> dostepmeProdukty = sklep.getDostepneProdukty();
        for (Product product : dostepmeProdukty){
            if(productId == product.getId()){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    private Optional<Product>findProductInCustomer(int productId, Customer customer){
        List<Product> listaProduktow = customer.getKupioneProdukty();
        for (Product product : listaProduktow) {
            if (productId == product.getId()){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public List<Product> sellProduct(int productId, Customer customer){
        Optional<Product> productInShop = findProductInShop(productId);

        if(productInShop.isPresent()) {
            sklep.getDostepneProdukty().remove(productInShop.get());
            sklep.getSprzedaneProdukty().add(productInShop.get());
            customer.getKupioneProdukty().add(productInShop.get());
        }
        return customer.getKupioneProdukty();
    }

    public List<Product>returnProduct(int productId, Customer customer){
        Optional<Product> productInCustomer = findProductInCustomer(productId, customer);
        if(productInCustomer.isPresent()) {
            sklep.getDostepneProdukty().add(productInCustomer.get());
            sklep.getSprzedaneProdukty().remove(productInCustomer.get());
            customer.getKupioneProdukty().remove(productInCustomer.get());
        }
        return sklep.getDostepneProdukty();
    }

    public BigDecimal getSoldProductsReport(){
        List<Product> sprzedaneProdukty = sklep.getSprzedaneProdukty();
        BigDecimal suma = BigDecimal.ZERO;
        for (Product product : sprzedaneProdukty){
            suma = suma.add(product.getCena());
        }

        return suma;
    }
}
