package Java8Features;

import java.util.Arrays;
import java.util.List;

public class LambdaCollection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alu","Bhalu","phalu");
        names.forEach(name -> System.out.println(name));
    }
}
