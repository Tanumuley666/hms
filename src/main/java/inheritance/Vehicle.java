package inheritance;

public class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void showSpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}
