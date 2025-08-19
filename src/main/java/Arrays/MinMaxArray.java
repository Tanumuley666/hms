package Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int [] arr = {3,7,1,9};
        findMinMaxArray(arr);

    }
    public static  void findMinMaxArray(int[] arr) {
        int min = arr[0],max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Min: " + min + " , max: " + max);
    }
}
