public class Device {
    private int count;
    private UniqueID id = new UniqueID(5, "_bird: ",count);

    private String brand;

    public Device(String brand) {
        this.brand = brand;
        count++;
    }

    public String getBrand() {
        return brand;
    }

    public void turnOn() {
        System.out.println(brand + " включен.");
    }

    public void turnOff() {
        System.out.println(brand + " выключен.");
    }
}
