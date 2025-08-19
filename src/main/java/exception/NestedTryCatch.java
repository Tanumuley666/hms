package exception;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int x = 10 / 2;

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);

            }
            String s = null;
            System.out.println(s.length());
        }catch (NullPointerException e) {
            System.out.println("Outer catch:" + e);
        }
    }
}
