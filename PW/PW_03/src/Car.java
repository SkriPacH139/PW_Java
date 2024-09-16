public class Car extends Transport{
    private int count;
    private UniqueID id = new UniqueID(6, "car: ",count);

    public Car(){
        count++;
    }
    @Override
    public void move() {
        System.out.println("Car move");
    }
}
