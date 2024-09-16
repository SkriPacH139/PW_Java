public class Player {
    private int count;
    private UniqueID id = new UniqueID(3, "circle: ",count);

    private String name;
    private int health;
    private Weapon weapon;

    // Конструктор
    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.weapon = null;
        count++;
    }

    // Метод для получения имени игрока
    public String getName() {
        return name;
    }

    // Метод для получения текущего здоровья
    public int getHealth() {
        return health;
    }

    // Метод для получения оружия
    public Weapon getWeapon() {
        return weapon;
    }

    // Метод для установки оружия
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Метод для атаки
    public int attack(Enemy enemy) {
        if (weapon != null) {
            int damage = weapon.getDamage();
            enemy.takeDamage(damage);
            System.out.println(name + " атаковал " + enemy.getName() + " оружием " + weapon.getName() + " и нанёс " + damage + " урона.");
            return damage;
        } else {
            System.out.println(name + " атаковал " + enemy.getName() + " голыми руками, но промахнулся.");
            return 0;
        }
    }

    // Метод для получения урона
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " погиб!");
        } else {
            System.out.println("\n" + name + " получил " + damage + " урона. Осталось здоровья: " + health );
        }
    }
}
