package Shop;

public class Keyboard extends Product {
    private Layout layout;
    private KeyboardType type;

    // Constructor for keyboards
    public Keyboard(int barcode, String brand, String color, ConnectivityType connectivity, int quantityInStock,
                    double originalCost, double retailPrice, ProductCategory category, Layout layout, KeyboardType type) {
        super(barcode, brand, color, connectivity, quantityInStock, originalCost, retailPrice, category);
        this.layout = layout;
        this.type = type;
    }

    @Override
    public String displayWithoutCost() {
        return String.format("%d, %s, %s, %s, %s, %s, %d, %.2f, %.2f, %s",
                getBarcode(), getCategory().toString().toLowerCase(), type.toString().toLowerCase(), getBrand(), getColor(), getConnectivity().toString().toLowerCase(),
                getQuantityInStock(), getOriginalCost(), getRetailPrice(), layout.toString());
    }

    // Getters and setters
    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public KeyboardType getType() {
        return type;
    }

    public void setType(KeyboardType type) {
        this.type = type;
    }
}
