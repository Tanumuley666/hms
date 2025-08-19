package inheritance;

public class WashingMachine extends Appliance{


     int capacity;

    WashingMachine(String brand, int capacity) {
        super(brand);
        this.capacity = capacity;
    }
    void showDetails() {
        showBrand();
        System.out.println("Capacity: "+ capacity + " kg");
    }
}
