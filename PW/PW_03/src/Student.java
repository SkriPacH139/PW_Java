public class Student {
    private int count;
    private UniqueID id = new UniqueID(9, "student: ",count);

    private String name;
    private String group;
    private float grade;

    public Student(String name, String group, float grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
        count++;
    }
    public String getName() {return name;}
    public String getGroup() {return group;}
    public float getGrade() {return grade;}
}
