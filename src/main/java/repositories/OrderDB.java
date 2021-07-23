package repositories;

import model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OrderDB {
    private Map<Integer, Order> orders = new HashMap<>();

    public OrderDB(Map<Integer, Order> orders) {
        this.orders = orders;
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
}
