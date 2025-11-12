package Shop;

public class Mouse extends Product {
    private int numberOfButtons;
    private MouseType type;

    // Constructor for mice
    public Mouse(int barcode, String brand, String color, ConnectivityType connectivity, int quantityInStock,
                 double originalCost, double retailPrice, ProductCategory category, int numberOfButtons, MouseType type) {
        super(barcode, brand, color, connectivity, quantityInStock, originalCost, retailPrice, category);
        this.numberOfButtons = numberOfButtons;
        this.type = type;
    }

    @Override
    public String displayWithoutCost() {
        return String.format("%d, %s, %s, %s, %s, %s, %d, %.2f, %.2f, %d",
                getBarcode(), getCategory().toString().toLowerCase(), type.toString().toLowerCase(), getBrand(), getColor(), getConnectivity().toString().toLowerCase(),
                getQuantityInStock(), getOriginalCost(), getRetailPrice(), numberOfButtons);
    }

    // Getters and setters
    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public MouseType getType() {
        return type;
    }

    public void setType(MouseType type) {
        this.type = type;
    }
}
