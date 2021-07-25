package service;

import model.Order;
import model.Product;
import repositories.OrderDB;
import repositories.ProductDB;

import java.util.List;
import java.util.Optional;

public class OrderService {
    private OrderDB orderDB = new OrderDB();
    private ProductDB productDB = new ProductDB();
    //private int orderID = 0;

    public OrderService() {
    }

    public OrderService(OrderDB orderDB) {
        this.orderDB = orderDB;
    }

    public void addProduct(int orderID, Product newProduct){
        boolean hasProduct = productDB.getByProductNumber(newProduct.getProductNumber()).isPresent();
        if(!hasProduct){
            System.out.println("Product not in database");
            return;
        }
        Optional<Order> order = getByOrderNumber(orderID);
        if (order.isPresent()){
            order.get().addProductToList(newProduct);
        }
    }

    public void addProduct(int orderID, String newProductName){
        Optional<Product> newProduct = productDB.getByProductName(newProductName);
        if(newProduct.isPresent()){
            Optional<Order> order = getByOrderNumber(orderID);
            if (order.isPresent()){
                order.get().addProductToList(newProduct.get());
            }
        }
    }



    public void add(Order newOrder){
        orderDB.add(newOrder);
    }

    public Optional<Order> getByOrderNumber(int orderNumber){
        Optional<Order> order = orderDB.getByOrderNumber(orderNumber);
        return order;
    }

    public void printOrderList(){
        List<Order> orderList = orderDB.list();
        System.out.println("Order overview: ");
        orderList.forEach(order -> {
            System.out.println("    " + order);
        });
    }


}
