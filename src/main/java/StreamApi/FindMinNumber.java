package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,25,74,37,73);

        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);

        minNumber.ifPresent(System.out::println);

    }
}
