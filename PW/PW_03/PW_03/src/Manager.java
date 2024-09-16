import java.util.List;

public class Manager extends Worker{
    private int count;
    private UniqueID id = new UniqueID(4, "manager: ",count);


    private List<Worker> subEmployees;

    public Manager(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
        count++;
    }

    public void addEmployee(Worker empl) {
        subEmployees.add(empl);
    }
}
