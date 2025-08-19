package inheritance;

public class Appliance {
    String brand;

    Appliance(String brand) {
        this.brand = brand;
    }

    void showBrand() {
        System.out.println("Appliance Brand: " + brand);
    }

}
