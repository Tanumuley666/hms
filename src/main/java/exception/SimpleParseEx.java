package exception;

public class SimpleParseEx {
    public static void main(String[] args) {
        try{
            int value = Integer.parseInt("Hello");

        }catch (NumberFormatException e) {
            System.out.println("Error : Not a valid numberr");
        }
    }
}
