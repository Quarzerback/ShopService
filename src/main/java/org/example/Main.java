package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product shirt = new Product(1001, "Shirt", 29.99, 100);
        Product pullover = new Product(1002, "Pullover", 49.99, 50);
        Product cap = new Product(1003, "Cap", 24.99, 70);
        Product shorts = new Product(1004, "Shorts", 44.99, 600);
        Product shoes = new Product(1005, "Shoes", 79.99, 40);
        Product socks = new Product(1006, "Socks", 9.99, 300);

        ProductRepo products = new ProductRepo();


    }
}