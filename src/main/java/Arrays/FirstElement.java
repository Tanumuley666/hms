package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rani","Raju","Rahu","Ritu");
        Optional<String> firstName = names.stream().findFirst();
        firstName.ifPresent(name -> System.out.println("First Name:" + name));
    }
}
