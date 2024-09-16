public class Cat implements Animal {
    private int count;
    private UniqueID id = new UniqueID(5, "cat: ",count);

    public Cat() {
        count++;
    }
    @Override
    public void makeSound() {
        System.out.println("Cat makes sound");
    }
}
