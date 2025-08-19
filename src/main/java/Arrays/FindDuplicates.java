package Arrays;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,5,7,3,7,8,5,9,10);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !unique.add(n))
                .collect(Collectors.toSet());
        System.out.println("Duplicate Numbers: " + duplicates);
    }
}
