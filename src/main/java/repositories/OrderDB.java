package repositories;

import model.Order;

import java.util.*;

public class OrderDB {
    private Map<Integer, Order> orders = new HashMap<>();

    public OrderDB() {
    }

    public OrderDB(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public void add(Order newOrder){
        orders.put(newOrder.getOrderNumber(), newOrder);
    }

    public Optional<Order> getByOrderNumber(int orderNumber){
        return Optional.ofNullable(orders.get(orderNumber));
    }

    public List<Order> list(){
        return new ArrayList<>(orders.values());
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }
}
