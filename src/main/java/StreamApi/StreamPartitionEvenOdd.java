package StreamApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);

        Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.partitioningBy(n ->n % 2==0));

        System.out.println("Even Numbers: " + evenOddMap.get(true));
        System.out.println("Odd Numbers: " +evenOddMap.get(false));
    }
}
