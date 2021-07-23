package repositories;

import model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDB {

    private Map<Integer, Product> products;

    Product product1 = new Product(1, "Seife");

    public ProductDB(Map<Integer, Product> products) {
        this.products = products;
    }
}
