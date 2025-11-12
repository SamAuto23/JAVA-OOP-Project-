package Shop;

import java.util.List;
import java.util.Comparator;

public class Admin extends User {
    private StockManager stockManager;

    public Admin(String userId, String username, String name, Address address, String role) {
        super(userId, username, name, address, role);
        this.stockManager = StockManager.getInstance();
    }

    @Override
    public void displayOptions() {
        System.out.println("Admin Options:");
        System.out.println("1. View Products");
        System.out.println("2. Add Product");
        // Further admin options can be added here
    }

    public void viewProducts() {
        List<Product> products = stockManager.getStock();
        products.sort(Comparator.comparingDouble(Product::getRetailPrice));
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void addProduct(Product product) {
        stockManager.addProduct(product);
    }
}
