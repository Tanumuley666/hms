package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    int id;
    double amount;
    Order(int id, double amount) {
        this.id = id;
        this.amount= amount;
    }
}
public class HighValueOrders {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(101,500),
                new Order(102,1500),
                new Order(103,2500),
                new Order(104, 800)
        );
        List<Integer> highOrderIds = orders.stream()
                .filter(o -> o.amount > 1000)
                .map(o -> o.id)
                .collect(Collectors.toList());
        System.out.println("High Value Order IDs: " + highOrderIds);
    }
}
