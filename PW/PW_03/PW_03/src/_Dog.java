public class _Dog extends _Animal {
    private int count;
    private UniqueID id = new UniqueID(5, "_dog: ", count);

    public _Dog() {
        count++;
    }
    @Override
    public void move() {
        System.out.println("Dog move");
    }
}
