package StreamApi;

import java.util.Arrays;
import java.util.List;

public class CountNamesWithS {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Rakhi","Sahil","Sima","Seeta");
        long count = names.stream()
                .filter(name -> name.startsWith("S")).count();
        System.out.println("count :" + count);

    }
}
