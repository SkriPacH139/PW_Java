public class Laptop extends Device {
    private int count;
    private UniqueID id = new UniqueID(5, "_bird: ",count);

    public Laptop(String brand) {
        super(brand);
        count++;
    }

    public void openWebPage() {
        System.out.println(getBrand() + " открывает веб-страницу.");
    }
}
