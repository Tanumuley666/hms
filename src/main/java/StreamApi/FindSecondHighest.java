package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,5,8,50,3,100);

        Optional<Integer> secondHighest = numbers.stream()
                .sorted()
                .skip(1)
                .findFirst();

        secondHighest.ifPresent(System.out::println);

    }
}
