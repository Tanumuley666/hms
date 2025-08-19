package StreamApi;

import java.util.Arrays;
import java.util.List;

public class CountEx {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,12,18,7,20);

        long count = nums.stream()
                .filter(n -> n >10)
                .count();
        System.out.println("Count:" + count);
    }
}
