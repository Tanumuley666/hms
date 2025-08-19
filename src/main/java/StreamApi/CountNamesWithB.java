package StreamApi;

import java.util.Arrays;
import java.util.List;

public class CountNamesWithB {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Babita","Bhargavi","Rekha","Riti");
        long count = names.stream()
                .filter(name -> name.startsWith("B")).count();
        System.out.println("count:"+count);

    }
}
