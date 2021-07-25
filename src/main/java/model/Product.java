package model;

import java.util.Objects;

public class Product {

        private int productNumber;
        private String productName;
        //private double price = 5d;


        public Product(int productNumber, String productName){
            this.productNumber = productNumber;
            this.productName = productName;
        }

        public int getProductNumber() {
            return productNumber;
        }

        public String getProductName() {
            return productName;
        }

        @Override
        public String toString() {
            return "Model.Product.Product{" +
                    "productNumber=" + productNumber +
                    ", productName='" + productName + '\'' +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productNumber == product.productNumber && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNumber, productName);
    }
}

