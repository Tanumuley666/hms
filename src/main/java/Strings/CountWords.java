package Strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "Java is osm";
        String[] words = str.split("\\s+");
        System.out.println("word count:" + words.length);
    }
}
