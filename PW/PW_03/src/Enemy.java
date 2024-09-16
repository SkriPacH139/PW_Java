import java.util.Random;

public class Enemy {
    private int count;
    private UniqueID id = new UniqueID(3, "circle: ",count);

    private String name;
    private int health;

    // Конструктор
    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
        count++;
    }

    // Метод для получения имени врага
    public String getName() {
        return name;
    }

    // Метод для получения текущего здоровья
    public int getHealth() {
        return health;
    }

    // Метод для получения урона
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " погиб!");
        } else {
            System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
        }
    }

    // Метод для атаки
    public int attack(Player player) {
        Random random = new Random();
        int damage = random.nextInt(5) + 1; // Случайный урон от 1 до 5
        player.takeDamage(damage);
        System.out.println(name + " атаковал " + player.getName() + " и нанёс " + damage + " урона.\n");
        return damage;
    }
}
