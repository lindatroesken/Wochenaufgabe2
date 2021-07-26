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
        Optional<Order> actualOrder = orderDB.getByOrderNumber(10);/*Optional ist entweder Order oder null*/
        //System.out.println(actualOrder.get().getOrderNumber());
        if (actualOrder.isPresent()) {
            // THEN
            assertEquals(10, actualOrder.get().getOrderNumber());
        }else {
            fail("Der Test wurde nicht durchgeführt.");
        }

    }

    @Test
    public void testListOfAllOrders(){
        // GIVEN

        Product product1 = new Product(1, "Seife");
        Product product2 = new Product(2, "Brot");
        Product product3 = new Product(3, "Nudeln");
        Product product4 = new Product(4, "Axt");

        ArrayList<Product> productList1 = new ArrayList<Product>();
        productList1.add(product1);
        productList1.add(product2);
        Order order1 = new Order(10, productList1);

        ArrayList<Product> productList2 = new ArrayList<Product>();
        productList2.add(product3);
        productList2.add(product4);
        Order order2 = new Order(11, productList2);

        Map<Integer, Order> orders = new HashMap<>();
        orders.put(order1.getOrderNumber(), order1);
        orders.put(order2.getOrderNumber(), order2);
        OrderDB orderDB = new OrderDB(orders);


        // WHEN
        List<Order> actualOrderList = orderDB.listOfOrders();
        List<Order> expectedOrderList = Arrays.asList(order1,order2);
       //THEN
        assertEquals(expectedOrderList,actualOrderList);
        System.out.println(expectedOrderList);

    }

    @Test
    public void testCreateNewOrderInORderDB(){
        //GIVEN
        OrderDB orderDB = new OrderDB();

        Product product1 = new Product(1, "Seife");
        Product product2 = new Product(2, "Brot");
        Product product3 = new Product(3, "Nudeln");
        Product product4 = new Product(4, "Axt");

        ArrayList<Product> productList1 = new ArrayList<Product>();
        productList1.add(product1);
        productList1.add(product2);
        Order order1 = new Order(10, productList1);

        ArrayList<Product> productList2 = new ArrayList<Product>();
        productList2.add(product3);
        productList2.add(product4);
        Order order2 = new Order(11, productList2);

        orderDB.add(order1);
        orderDB.add(order2);

        //WHEN
        int expected =2;
        int actual = orderDB.listOfOrders().size();


        //THEN
        assertEquals(expected, actual);



    }



}