class Car {
    private int speed;

    public void accelerate(int increase) {
        if (increase > 0) {
            speed += increase;
            System.out.println("Speed increased to: " + speed + " km/h");
        }
    }

    public void brake(int decrease) {
        if (decrease > 0 && speed - decrease >= 0) {
            speed -= decrease;
            System.out.println("Speed decreased to: " + speed + " km/h");
        } else {
            System.out.println("Car already stopped.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate(50);
        c.brake(20);
        c.brake(40);
    }
}
