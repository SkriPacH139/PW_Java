import java.util.Scanner;

public class Main {

    public static void startGame(){
        Player player = new Player("Герой", 100);

        // Создание оружия
        Weapon sword = new Weapon("Меч", 15);
        player.setWeapon(sword);

        // Создание врага
        Enemy enemy = new Enemy("Скелет", 50);

        System.out.println();

        // Бой
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            player.attack(enemy);
            if (enemy.getHealth() > 0) {
                enemy.attack(player);
            }
        }

        // Определение победителя
        if (player.getHealth() > 0) {
            System.out.println("\nПобеда! " + player.getName() + " победил!");
        } else {
            System.out.println("\nПоражение! " + enemy.getName() + " победил!");
        }
    }

    public static void checkShop(){
        // Создаем продукты
        _Product milk = new _Product("Молоко", 2.5);
        _Product bread = new _Product("Хлеб", 1.5);
        _Product eggs = new _Product("Яйца", 3.0);

        // Создаем клиента
        Customer customer = new Customer("Иван Иванов");

        // Создаем заказ
        Order order = new Order(customer);
        order.addProduct(milk);
        order.addProduct(bread);
        order.addProduct(eggs);

        // Добавляем заказ клиенту
        customer.addOrder(order);

        // Выводим общую стоимость заказа
        System.out.println("\nОбщая стоимость заказа: " + order.getTotalPrice());

        // Выводим историю заказов клиента
        System.out.println("\nИстория заказов клиента " + customer.getName() + ":");
        for (Order customerOrder : customer.getOrders()) {
            System.out.println("Заказ:");
            for (_Product product : customerOrder.getProducts()) {
                System.out.println("  " + product.getName() + " - " + product.getPrice());
            }
            System.out.println("Общая стоимость: " + customerOrder.getTotalPrice());
        }
    }

    public static void ticTacToe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер поля (3 - стандартное):");
        int size = scanner.nextInt();
        System.out.println("Введите символ для первого игрока (X или O):");
        char symbol1 = scanner.next().charAt(0);
        char symbol2 = (symbol1 == 'X') ? 'O' : 'X';

        _Player player1 = new _Player(symbol1);
        _Player player2 = new _Player(symbol2);

        Game game = new Game(size, player1, player2);
        game.play();
    }

    public static void deviceDemo(){
        Smartphone phone = new Smartphone("Samsung");
        Laptop laptop = new Laptop("Apple");

        phone.turnOn();
        phone.takePhoto();
        phone.turnOff();

        System.out.println();

        laptop.turnOn();
        laptop.openWebPage();
        laptop.turnOff();
    }

    public static void main(String[] args) {
        ticTacToe();
    }

}