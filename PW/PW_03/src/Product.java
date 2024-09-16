public class Product {
    private int count;
    private UniqueID id = new UniqueID(10, "product: ",count);

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        count++;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }
}
