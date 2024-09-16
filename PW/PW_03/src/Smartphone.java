public class Smartphone  extends  Device{
    private int count;
    private UniqueID id = new UniqueID(5, "_bird: ",count);

    public Smartphone(String brand) {
        super(brand);
        count++;
    }

    public void takePhoto() {
        System.out.println(getBrand() + " делает фото.");
    }
}
