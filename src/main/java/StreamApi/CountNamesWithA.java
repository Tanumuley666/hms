package StreamApi;

import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

public class CountNamesWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Annie","Adam","Charlie");
        long count = names.stream()
        .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Count: " + count);
    }
}
