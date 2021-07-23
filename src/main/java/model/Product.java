package model;

public class Product {

        private int productNumber;
        private String productName;
        private double price = 5d;


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
    }

