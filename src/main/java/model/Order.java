package model;

import java.util.List;

public class Order {
    private int orderNumber;
    private List<Product> listOfOrders;

    public Order() {
    }

    public Order(int orderNumber, List<Product> listOfOrders) {
        this.orderNumber = orderNumber;
        this.listOfOrders = listOfOrders;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<Product> getListOfOrders() {
        return listOfOrders;
    }

    public void setListOfOrders(List<Product> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", listOfOrders=" + listOfOrders +
                '}';
    }
}
