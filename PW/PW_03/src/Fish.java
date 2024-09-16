public class Fish extends _Animal{
    private int count;
    private UniqueID id = new UniqueID(5, "_fish: ",count);

    public Fish(){
        count++;
    }
    @Override
    public void move() {
        System.out.println("Fish move");
    }
}

