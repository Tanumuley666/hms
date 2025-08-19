package Strings;

public class StringConcat {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name:" + fullName);
        System.out.println("Full Name (cocat):" + firstName.concat(" ").concat(lastName));
    }
    }

