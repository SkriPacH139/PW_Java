public class _Product {
    private int count;
    private UniqueID id = new UniqueID(5, "_bird: ",count);

    private String name;
    private double price;

    public _Product(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
