package StreamApi;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class SortDatesDescending {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
           LocalDate.of(2023, 5, 12),
        LocalDate.of(2022,8,30),
        LocalDate.of(2024,1,1)
                );
List<LocalDate> sorted = dates.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

        System.out.println("Dates Descending: " + sorted);
    }
}
