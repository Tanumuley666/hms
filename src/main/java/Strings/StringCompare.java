package Strings;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println("Equals:" + str1.equals(str2));
        System.out.println("Ignore case:" + str1.equalsIgnoreCase(str2));
        System.out.println("CompareTo:" + str1.compareTo(str2));
    }
}
