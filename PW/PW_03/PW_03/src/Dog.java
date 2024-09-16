public class Dog implements Animal{
    private int count;
    private UniqueID id = new UniqueID(5, "dog: ",count);

    public Dog() {
        count++;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound");
    }
}
