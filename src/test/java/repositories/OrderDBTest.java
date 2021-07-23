package repositories;

import model.Order;
import model.Product;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OrderDBTest {

    @Test
    public void testGetOrderByOrderNumber(){
        // GIVEN

        Product product1 = new Product(1, "Seife");
        Product product2 = new Product(2, "Brot");
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        Order order1 = new Order(10, productList);

        Map<Integer, Order> orders = new HashMap<>();
        orders.put(order1.getOrderNumber(), order1);
        OrderDB orderDB = new OrderDB(orders);


        // WHEN
        Optional<Order> actualOrder = orderDB.getByOrderNumber(10);
        //System.out.println(actualOrder.get().getOrderNumber());
        // THEN
        assertEquals(10, actualOrder.get().getOrderNumber());
    }


}