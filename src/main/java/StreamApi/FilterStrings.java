package StreamApi;

import java.util.Arrays;
import java.util.List;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Gauri","Vishal","Shubham");
        names.stream()
                .filter(name ->name.startsWith("G"))
                .forEach(System.out::println);

    }
}
