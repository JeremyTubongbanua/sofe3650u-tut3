package org.sofe3650u.tut3;

import org.sofe3650u.tut3.model.Product;

public class Display {

    public void displayProduct(Product product) {
        this.displayProduct(product.getProductId(), product.getProductName());
    }

    public void displayProduct(int productId, String productName) {
        System.out.println("ProductID: " + productId + " ProductName: " + productName);
    }

}
