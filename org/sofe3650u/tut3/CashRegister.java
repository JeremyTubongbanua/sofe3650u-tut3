package org.sofe3650u.tut3;

import org.sofe3650u.tut3.model.Database;
import org.sofe3650u.tut3.model.Product;

public class CashRegister {

    private String DATA_FILE = "data.txt";

    private Database database;
    private Keyboard keyboard;
    private Display display;

    public CashRegister() {
        this.database = new Database(DATA_FILE);
        this.keyboard = new Keyboard();
        this.display = new Display();
    }

    public CashRegister(Database database, Keyboard keyboard, Display display) {
        this.database = database;
        this.keyboard = keyboard;
        this.display = display;
    }

    public void listenKeyboardOutputDisplay() {
        System.out.println("Please enter a product ID (e.g. \"0\"):");
        int productId = this.keyboard.getNextInt();
        Product product = database.getProduct(productId);
        if(product != null) {
            System.out.println("Product found with id " + productId + ":");
            this.display.displayProduct(product);
        } else {
            System.out.println("Product not found.");
        }
    }

}
