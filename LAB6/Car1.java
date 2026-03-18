package LAB6;
abstract class Car {

    String company = "Car Company";

    void display() {
        System.out.println("Company: " + company);
    }

    abstract void avg();
    abstract void model();
}

class Maruti extends Car {

    void avg() {
        System.out.println("Maruti Average: 20 km/l");
    }

    void model() {
        System.out.println("Model: Swift");
    }
}

class Santro extends Car {

    void avg() {
        System.out.println("Santro Average: 18 km/l");
    }

    void model() {
        System.out.println("Model: Santro Sportz");
    }
}

public class Car1 {
    public static void main(String[] args) {

        Car c;

        c = new Maruti();
        c.display();
        c.avg();
        c.model();

        System.out.println();

        c = new Santro();
        c.display();
        c.avg();
        c.model();
    }
}