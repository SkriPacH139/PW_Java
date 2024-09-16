public class Cow  implements Animal{
    private int count;
    private UniqueID id = new UniqueID(5, "cow: ",count);

    public Cow() {
        count++;
    }
    @Override
    public void makeSound() {
        System.out.println("Cow makes sound");
    }
}
