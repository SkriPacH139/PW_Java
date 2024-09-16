import java.util.ArrayList;
import java.util.List;

public class Order {
    private int count;
    private UniqueID id = new UniqueID(5, "_bird: ",count);

    private Customer customer;
    private List<_Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        count++;
    }

    public void addProduct(_Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (_Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<_Product> getProducts() {
        return products;
    }
}
