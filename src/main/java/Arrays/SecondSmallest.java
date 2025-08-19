package Arrays;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int [] arr = {5,1,9,2,6};

        Arrays.sort(arr);
        System.out.println("Second Smallest:" + arr[1]);
    }
}
