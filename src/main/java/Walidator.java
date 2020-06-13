public class Walidator {
    public static boolean walidujProdukt(Product product) {
        if (product.getCena() == null){
            return false;
        }
        return true;
    }

    public static boolean walidujSklep(Shop shop) {
        if (shop.getNazwa().length() >= 6){
            char[] nazwaSklepu = shop.getNazwa().toCharArray();
            for (char l : nazwaSklepu){
                if(Character.isDigit(l)){
                    System.out.println("Nazwa sklepu musi zawierac tylko litery");
                    return false;
                }
            }
            return true;
        }
        System.out.println("Nazwa sklepu musi byc dluzsza niz 5 znakow");
        return false;
    }
}
