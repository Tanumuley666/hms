package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseConversion {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "peter","alice","mark");
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + uppercaseNames);
    }
}
