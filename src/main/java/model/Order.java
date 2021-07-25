package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private List<Product> listOfProducts;

    public Order() {
    }

    public Order(int orderNumber, List<Product> listOfProducts) {
        this.orderNumber = orderNumber;
        this.listOfProducts = listOfProducts;
    }

    public int getOrderNumber() {
        return orderNumber;
    }


    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void addProductToList(Product newProduct){
        listOfProducts.add(newProduct);
    }

    @Override
    public String toString() {
        return new StringBuilder().
                append("Order: ").
                append(orderNumber).
                append(", listOfOrders: ").
                append(getListOfProductNames()).toString();
    }

    public List<String> getListOfProductNames() {
        List<String> productNames = new ArrayList<>();
        listOfProducts.forEach(product -> {
            productNames.add(product.getProductName());
        });
        return productNames;
    }
}
