package StreamApi;

import java.util.Arrays;
import java.util.List;

public class CountNameWithR {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rani","Raj","Ramu");
        long count = names.stream()
                .filter(name -> name.startsWith("R")).count();
        System.out.println("count :" + count);
    }
}
