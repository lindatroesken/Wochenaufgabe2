package services;

import repositories.OrderDB;
import repositories.ProductDB;

public class OrderService {
    //Zugriff auf Order- und ProductDB. Hierdurch wurde automatisch die beiden Klassen importiert.
    private ProductDB productDB = new ProductDB();
    private OrderDB orderDB = new OrderDB();

    public OrderService(){
    }

    //Liste aller Orders ausgeben-> Methode mit String als Rückgabewert
    public String convertListIntoString(){

        return " ";
    }


}
