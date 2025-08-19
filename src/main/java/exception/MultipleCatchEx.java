package exception;

public class MultipleCatchEx {
    public static void main(String[] args) {
        try{
            String s = null;
            int a = 10/0;
            System.out.println(s.length());
        }catch (ArithmeticException e) {
            System.out.println("Math error!");

        }catch (NumberFormatException e) {
            System.out.println("Null error");
        }
    }
}
