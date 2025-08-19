package StreamApi;

import java.util.Arrays;
import java.util.List;

public class ReduceMultiplication {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5);

        int product = numbers.stream().reduce(1,(a,b) -> a*b);

        System.out.println("Product :" + product);

    }
}
