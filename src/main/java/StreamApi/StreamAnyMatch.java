package StreamApi;

import java.util.List;

public class StreamAnyMatch {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,8,12,3);

        boolean hasGreaterThan10 = numbers.stream().anyMatch(n -> n >10);

        System.out.println(hasGreaterThan10);
    }
}
