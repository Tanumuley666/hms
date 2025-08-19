package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimit {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70);

        List<Integer> result = numbers.stream()
                .skip(2)
                .limit(4)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
