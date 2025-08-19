package STRINGCONCEPTS;

import java.util.Arrays;

public class StringConcepts {
    public static void main(String[] args) {

        // 1. string creation
        String s1 = "Hello";
        String s2 =  new String("Hello");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Immutability
        String s3 = "java";
        s3.concat(" World");
        System.out.println("s3 after concat (not assigned) : " + s3);

        s3 = s3.concat(" World");
        System.out.println("s3 after concat (assigned): " + s3);

        // 3. equals() vs ==
        String a = "Test";
        String b = "Test";
        String c =  new String("Test");
        System.out.println("a==b: " + (a == b));
        System.out.println("a==c: " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));

        // 4. compareTo()
        String x = "Apple";
        String y = "Banana";
        System.out.println("Apple vs Banana: " + x.compareTo(y));
        System.out.println("Banana vs Apple: " +  y.compareTo(x));
        System.out.println("Apple vs Apple: " + x.compareTo("Apple"));

        // 5. substring()
        String text = "Programming";
        System.out.println("Substring(0,4): " + text.substring(0,4));
        System.out.println("Substring(4): " + text.substring(4));

        // 6. split()
        String str = "one,two,three";
        String[] parts = str.split(",");
        for (String part : parts) {
            System.out.println(part);

         // 7. length()
            String word = "java";
            System.out.println("Length of Java: " + word.length());
            System.out.println("Char at index 2: " + word.charAt(2));

         // 8. Case conversion
            System.out.println("upper: " + word.toUpperCase());
            System.out.println("lower: " + word.toLowerCase());

         // 9. trim()
            String spaced = "  Java  ";
            System.out.println("Before trim: '" + spaced + "'");
            System.out.println("After trim: '" + spaced.trim()  + "'");

         // 10. startsWith(), endsWith()
            String file = "report.pdf";
            System.out.println("Starts with rep? " + file.startsWith("rep"));
            System.out.println("Ends with .pdf? " + file.endsWith(".pdf"));
            System.out.println("Contains 'gram'? " + text.contains("gram"));

          // 11. replace()
            System.out.println("Replace m with M: " + text.replace("m", "M"));

          // 12. isEmpty(),isBlank()
            String empty = "";
            String blank = "  ";
            System.out.println("empty.isEmpty(): " + empty.isEmpty());
            System.out.println("blank.isEmpty(): " + blank.isEmpty());
            System.out.println("blank.isBlank(): " + blank.isBlank());

          // 13. valueOf()
            int num = 123;
            String numStr = String.valueOf(num);
            System.out.println("numStr: " + numStr);

          // 14. join()
            String joined = String.join("-", "2025", "08", "16");
            System.out.println("Joined: " + joined);

          // 15. repeat()
            String star = "*";
            System.out.println("Repeat: " + star.repeat(5));

          // 16. String Pool Concept
            String pool1 = "Java";
            String pool2 = "Java";
            String pool3 = new String("Java");

            System.out.println("pool1 == pool2: " + (pool1 == pool2));
            System.out.println("pool1 == pool3: " + (pool1 == pool3));
            System.out.println("pool1.equals(pool3): " + pool1.equals(pool3));

          // 17. intern()
            String s4 = new String("Java");
            String s5 = s1.intern();
            String s6 = "Java";
            System.out.println("s4 == s5: " + (s4 == s5));

          // 18. StringBuilder
             StringBuilder sb = new StringBuilder("Hello");
             sb.append("World");
            System.out.println("StringBuilder: " + sb);

             //StringBuffer
            StringBuffer sbf = new StringBuffer("Hello");
            sbf.append("World");
            System.out.println("StringBuffer: " + sbf);

           // 19. String.format()
              String formatted = String.format("Name: %s, Age: %d, ", "Tanu",25);
            System.out.println("Formatted: " + formatted);

          // 20. matches()
              String email = "test@gamil.com";
            System.out.println("Email valid? " + email.matches(".*@gmail\\.com"));

          // 21. getBytes() and toCharArray()
             String lang = "Java";
            System.out.println("Bytes: " + Arrays.toString(lang.getBytes()));
            System.out.println("CharArray: " + Arrays.toString(lang.toCharArray()));

/         //

        }



    }


}
