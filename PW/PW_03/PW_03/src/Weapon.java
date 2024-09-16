public class Weapon {
    private int count;
    private UniqueID id = new UniqueID(3, "circle: ",count);

    private String name;
    private int damage;

    // Конструктор
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
        count++;
    }

    // Метод для получения имени оружия
    public String getName() {
        return name;
    }

    // Метод для получения урона оружия
    public int getDamage() {
        return damage;
    }
}
