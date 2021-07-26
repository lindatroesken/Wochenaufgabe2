package repositories;

import model.Order;

import java.util.*;

public class OrderDB {
    private Map<Integer, Order> orders = new HashMap<>();

    public OrderDB(Map<Integer, Order> orders) {
        this.orders = orders;
    }
    public OrderDB(){

    }

    public void add(Order newOrder){
        orders.put(newOrder.getOrderNumber(), newOrder);
    }

    public Optional<Order> getByOrderNumber(int orderNumber){
        return Optional.ofNullable(orders.get(orderNumber));

    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }


    public List<Order> listOfOrders() {
        //return orders.values().stream().toList(); /*Möglichkeit 1*/
        return new ArrayList<>(orders.values()); /*Möglichkeit 2*/
    }
}



