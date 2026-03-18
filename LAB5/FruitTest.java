package LAB5;
class Fruit {
    String name;
    String type;
    double price;

    Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    void displayFruit() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class FruitTest {
    public static void main(String[] args) {

        Fruit f1 = new Fruit("Apple", "Single", 120.0);
        Fruit f2 = new Fruit("Grapes", "Bunch", 80.0);

        f1.displayFruit();
        f2.displayFruit();
    }
}
