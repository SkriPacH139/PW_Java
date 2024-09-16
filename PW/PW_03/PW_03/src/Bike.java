public class Bike extends Transport{
    private int count;
    private UniqueID id = new UniqueID(6, "bike: ",count);

    public Bike(){
        count++;
    }

    @Override
    public void move() {
        System.out.println("Bike move");
    }
}
