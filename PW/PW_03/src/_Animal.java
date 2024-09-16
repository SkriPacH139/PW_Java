public class _Animal {
    private int count;
    private UniqueID id = new UniqueID(5, "_animal: ", count);

    public void move(){
        System.out.println("Animal move");
        count++;
    }
}
