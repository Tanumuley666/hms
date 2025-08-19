package Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int count = 0;

        for (int num : arr) {
            count++;
        }
        System.out.println("Array Lenghth: " + count);
    }
}
