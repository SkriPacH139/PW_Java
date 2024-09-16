import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int count;
    private UniqueID id = new UniqueID(5, "_bird: ",count);

    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
        count++;
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
