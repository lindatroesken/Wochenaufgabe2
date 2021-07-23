package repositories;

import model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDB {

    private Map<Integer, Product> products = new HashMap<>();



    public ProductDB() {
        Product product1 = new Product(1, "Seife");
        Product product2 = new Product(2, "Brot");
        Product product3 = new Product(3, "Hammer");
        products.put(product1.getProductNumber(), product1);
        products.put(product2.getProductNumber(), product2);
        products.put(product3.getProductNumber(), product3);

    }

    public Map<Integer, Product> list(){
        return products;

    }

    @Override
    public String toString() {
        return "ProductDB{" +
                "products=" + products +
                '}';
    }
}
