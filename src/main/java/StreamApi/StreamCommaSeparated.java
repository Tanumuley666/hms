package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCommaSeparated {
    public static void main(String[] args) {
        List<String> items = List.of("Apple","Banana","Cherry");

        String result = items.stream().collect(Collectors.joining(","));

        System.out.println(result);
    }
}
