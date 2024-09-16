public class Worker extends Person {
    private int count;
    private UniqueID id = new UniqueID(10, "worker: ",count);

    private double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
        count++;
    }
}

