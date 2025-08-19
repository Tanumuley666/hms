package constructors;

class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    public void showProduct() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Price: Rs" + price);
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Product p = new Product(101,"Laptop",8000.0);
        p.showProduct();
    }
}
