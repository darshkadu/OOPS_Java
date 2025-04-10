class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is zooming");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.move();
    }
}
