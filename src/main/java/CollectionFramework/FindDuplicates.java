package CollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "Java", "C++", "Python");

        Set<String> duplicates = names.stream()
                .filter(s -> Collections.frequency(names,s) > 1)
                .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
    }
}
