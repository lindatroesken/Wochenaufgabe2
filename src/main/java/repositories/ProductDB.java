package repositories;

import model.Product;

import java.util.*;

public class ProductDB {

    private Map<Integer, Product> products = new HashMap<>();


    public ProductDB() {
        initializeDB();
    }
    private void initializeDB(){
        Product product1 = new Product(111, "Seife");
        Product product2 = new Product(112, "Brot");
        Product product3 = new Product(113, "Hammer");
        Product product4 = new Product(114, "Käse");
        Product product5 = new Product(115, "Butter");
        products.put(product1.getProductNumber(), product1);
        products.put(product2.getProductNumber(), product2);
        products.put(product3.getProductNumber(), product3);
        products.put(product4.getProductNumber(), product4);
        products.put(product5.getProductNumber(), product5);

    }

    public List<Product> list(){
        return new ArrayList<>(products.values());
    }

    public Optional<Product> getByProductNumber(int productNumber){
        Product product = products.get(productNumber);
        return Optional.ofNullable(product);
    }

    public Optional<Product> getByProductName(String productName){
             for (Product product : list()) {
                if(product.getProductName().equals(productName)) {
                    return Optional.of(product);
                }
            }

        return Optional.empty();
    }

    @Override
    public String toString() {
        return "ProductDB{" +
                "products=" + products +
                '}';
    }
}
