package LAB7;
class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    void maxSpeed() {
        System.out.println("Vehicle speed unknown");
    }
}

class Car extends Vehicle {
    Car() {
        super("Car");
    }

    void maxSpeed() {
        System.out.println("Car max speed: 180 km/h");
    }
}

class Bicycle extends Vehicle {
    Bicycle() {
        super("Bicycle");
    }

    void maxSpeed() {
        System.out.println("Bicycle max speed: 25 km/h");
    }
}

class Scooter extends Vehicle {
    Scooter() {
        super("Scooter");
    }

    void maxSpeed() {
        System.out.println("Scooter max speed: 90 km/h");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Car c = new Car();
        Bicycle b = new Bicycle();
        Scooter s = new Scooter();

        c.maxSpeed();
        b.maxSpeed();
        s.maxSpeed();
    }
}
