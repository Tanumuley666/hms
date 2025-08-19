package StreamApi;

import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","spring","hibernate");

        long count = names.stream().count();

        System.out.println(count);

    }
}
