package repositories;

public class ProductNotFoundException extends RuntimeException{

    private String productName;
    public ProductNotFoundException(Throwable cause) {
        super(cause);
    }

    public ProductNotFoundException(String productName) {
        this.productName = productName;
    }

    @Override
    public String getMessage() {
        return "Cannot find product '" + productName + "' in database.";
    }
}
