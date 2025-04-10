class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is driving");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.move(); // Output: Car is driving
    }
}
