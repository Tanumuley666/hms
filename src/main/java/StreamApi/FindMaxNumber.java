package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,45,22,67,89,15);

        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);

        maxNumber.ifPresent(System.out::println);

    }
}
