import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class University {
    private int count;
    private UniqueID id = new UniqueID(5, "university: ",count);

    private List<Student> students = new ArrayList<>();

    public University() {
        count++;
    }

    public void addStudent(String name, String group, float grade) {
        students.add(new Student(name, group, grade));
    }

    public void sortByName() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getGroup() + " " + student.getGrade());
        }
    }

    public void sortByGrade() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Float.compare(s2.getGrade(), s1.getGrade());
            }
        });

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getGroup() + " " + student.getGrade());
        }
    }


}
