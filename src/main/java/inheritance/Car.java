package inheritance;

public class Car extends Vehicle{
    String model;

    Car(String model, int speed) {
        super(speed);
        this.model = model;
    }
    void display() {
        System.out.println("Car Model: " + model);
        showSpeed();
    }
}
