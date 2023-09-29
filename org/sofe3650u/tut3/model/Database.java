package org.sofe3650u.tut3.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

    List<Product> products;

    public Database(String dataFilePath) {
        this(new File(dataFilePath));
    }

    public Database(File file) {
        // open file and read
        this.products = new ArrayList<Product>();
        try {
            this.populate(this.products, file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
            e.printStackTrace();
        }
    }

    private void populate(List<Product> emptyProductsList, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            int productId = Integer.parseInt(parts[0]);
            String productName = parts[1];
            Product product = new Product(productId, productName);
            emptyProductsList.add(product);
        }
        scanner.close();
    }

    public Product getProduct(int prodId) {
        for(Product product : this.products) {
            int productId = product.getProductId();
            if(productId == prodId) {
                return product;
            }
        }
        return null;
    }

}
