public class _Bird extends _Animal{
    private int count;
    private UniqueID id = new UniqueID(5, "_bird: ",count);

    public _Bird() {
        count++;
    }
    @Override
    public void move() {
        System.out.println("Bird move");
    }
}
