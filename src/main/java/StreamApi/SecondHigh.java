package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigh {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(4000,3000,1000,2000);
                int secondHighest = salaries.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(-1);
        System.out.println("2nd Hishest salary: " + secondHighest);

    }
}
