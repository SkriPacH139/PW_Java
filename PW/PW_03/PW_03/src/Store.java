import java.util.ArrayList;
import java.util.List;


public class Store {
    private int count;
    private UniqueID id = new UniqueID(5, "store: ",count);
    private List<Product> products = new ArrayList<Product>();

    public Store() {
        count++;
    }

    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public void removeProduct(String name) {
       int finderIndex=findProduct(name);

       if(finderIndex != -1) {
           products.remove(finderIndex);
       }
       else{
           System.out.println("Продукт " + name+ " не найден");
       }
    }

    public void findProd(String name) {
        int finderIndex = findProduct(name);

        if(finderIndex != -1) {
            System.out.println("Продукт " + products.get(finderIndex).getName() + " найден");
        }
        else{
            System.out.println("Продукт " + name + " не найден");
        }
    }

    private int findProduct(String name) {
        int index = -1;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                index = i;
            }
        }
        return index;
    }

    public void outListProd(){
        for (Product product : products) {
            System.out.println(product.getName() + " в количество - " + product.getQuantity());
        }
    }
}


