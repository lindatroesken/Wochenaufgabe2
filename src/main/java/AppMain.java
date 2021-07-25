import model.Order;
import model.Product;
import repositories.ProductDB;
import service.OrderService;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {

        ProductDB productDB = new ProductDB();
        System.out.println(productDB);

        Product product1 = new Product(1, "Seife");
        Product product2 = new Product(2, "Brot");
        ArrayList<Product> productList1 = new ArrayList<Product>();
        ArrayList<Product> productList2 = new ArrayList<Product>();
        ArrayList<Product> productList3 = new ArrayList<Product>();
        productList1.add(product1);
        productList2.add(product1);
        //productList2.add(product2);
        productList3.add(product2);
        productList3.add(product1);

        Order myFirstOrder = new Order(1, productList1);
        Order mySecondOrder = new Order(2, productList2);
        Order myThirdOrder = new Order(3, productList3);

        OrderService myOrders = new OrderService();
        //myOrders.add(new Order());
        myOrders.add(myFirstOrder);
        myOrders.addProduct(myFirstOrder.getOrderNumber(), product2);
        myOrders.add(mySecondOrder);
        myOrders.add(myThirdOrder);
        myOrders.printOrderList();

        String product4 = "Butter";
        myOrders.addProduct(myFirstOrder.getOrderNumber(), product4);
        myOrders.printOrderList();



    }
}
