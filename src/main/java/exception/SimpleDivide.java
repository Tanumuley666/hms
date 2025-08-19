package exception;

public class SimpleDivide {
    public static void main(String[] args) {
        try {
            int result = 20/0;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("Error Division by zero.");
        }
    }
}
