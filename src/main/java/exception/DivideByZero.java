package exception;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            int a = 10/0;

        }catch (ArithmeticException e) {
            System.out.println("you cant devide by zero");
        }
    }
}
