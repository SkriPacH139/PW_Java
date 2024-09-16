public class Person {
    private int count;
    private UniqueID id = new UniqueID(9, "person: ",count);

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
    }

    public void infoPerson(){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Пол: " + gender);
    }

    public void changeAge(int age){
        this.age = age;
    }
    public void changeName(String name){
        this.name = name;
    }
}
