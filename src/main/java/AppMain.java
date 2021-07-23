import repositories.ProductDB;

public class AppMain {
    public static void main(String[] args) {

        ProductDB productDB = new ProductDB();
        System.out.println(productDB.toString());
    }
}
