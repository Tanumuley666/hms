package Strings;

public class Palindromea {
    public static void main(String[] args) {
        String input = "madam";
        String reverse = new StringBuilder(input).reverse().toString();
        
        if (input.equals(reverse)) {
            System.out.println("it is a palindrome");
        }
            else {
            System.out.println("not a palindrome");
                
            }
        }
    }

