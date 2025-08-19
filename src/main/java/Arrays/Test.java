package Arrays;

public class Test {
    public static int testMethod() {
        try {
            return 1;
        } finally {
            System.exit(0);
            return 2;  // This will override the try block's return
        }
    }

    public static void main(String[] args) {
        System.out.println(testMethod());  // Output: 2
    }
}
