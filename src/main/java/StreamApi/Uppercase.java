package StreamApi;

import java.util.Arrays;
import java.util.List;

public class Uppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john","joe","romi");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
