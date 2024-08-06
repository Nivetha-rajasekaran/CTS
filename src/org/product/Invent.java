package org.product;



import java.util.HashMap;
import java.util.Map;

public class Invent {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
