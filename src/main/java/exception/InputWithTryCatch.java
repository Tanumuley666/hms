package exception;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputWithTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a number :");
            int a = sc.nextInt();
            int result = 100/a;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e) {
            System.out.println("Cant divide by zero");
        }
    }
}
